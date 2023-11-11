package com.example.mytest.security;

import com.example.mytest.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityClassConfig {

/**
 * Questo metodo mi permette di codificare le password tramite BCryptPasswordEncoder */
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Questo metodo mi permette di autenticare gli utenti */
    @Bean
    public DaoAuthenticationProvider authenticationProvider(UserService userService){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService); // carica le informazioni presenti nel database per quanto riguarda gli utenti
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    /** ? Supporto JDBC
     * ! Qui si dice a spring di usare l'autenticazione JDBC con la nostra fone dati
     * ! Inietto l'origine dei dati
     * Questo dirà */
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(configurer -> configurer
                        .requestMatchers("/").hasRole("EMPLOYEE")
                        .requestMatchers("/leaders/**").hasRole("MANAGER")
                        .requestMatchers("/systems/**").hasRole("ADMIN")
                        .anyRequest().authenticated())
                .formLogin(form ->
                        form
                                .loginPage("/mostra-login") //! creazione controller per questa mappatura (LoginController gestirà la mappatura)
                                // quando si tenterà di accedere alla nostra home o qualsiasi altro dominio, verrà richiamata questa pagina per
                                // effettuare il login, infatti creiamo un controller mappato su quest'end-point
                                .loginProcessingUrl("/autenticateTheUser")
                                .permitAll()
                )
                .logout(logout -> logout.permitAll()
                ).exceptionHandling(configurer -> configurer.accessDeniedPage("/accesso-negato"));
        return httpSecurity.build();
    }
}
