package com.example.testsecuritytest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityClass {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails giovanni = User.builder()
                .username("Giovanni")
                .password("{noop}test1234")
                .roles("EMPLOYEE")
                .build();

        UserDetails maria = User.builder()
                .username("Maria")
                .password("{noop}test5678")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails paolo = User.builder()
                .username("Paolo")
                .password("{noop}test2468")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(giovanni, maria, paolo);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                        configurer
                                .anyRequest().authenticated()
                )
                .formLogin(form ->
                        form
                                .loginPage("/mostra-login") //! creazione controller per questa mappatura (LoginController gestirà la mappatura)
                                .loginProcessingUrl("/autenticateTheUser")
                                .permitAll()
                );
        return http.build();
    }
}
