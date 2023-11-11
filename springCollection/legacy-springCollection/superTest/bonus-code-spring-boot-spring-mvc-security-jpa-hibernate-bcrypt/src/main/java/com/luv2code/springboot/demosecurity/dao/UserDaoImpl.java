package com.luv2code.springboot.demosecurity.dao;

import com.luv2code.springboot.demosecurity.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

/**
 * Questa classe è una repository JPA ed è
 * responsabile di trovare il nome utente in base al nome che gli viene passato tramite jpql
 * infatti viene creata la query tipizzata,
 * ! Ricordiamoci che entityManager è un interfaccia di JPA che rappresenta una connessione al db
 * questa repo viene utilizzata dai service
 */
@Repository
public class UserDaoImpl implements UserDao {

	private EntityManager entityManager;

	public UserDaoImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}

	/**
	 * Questo metodo ci consente di effettuare una query tipizzata, accetta un parametro, per cui quando viene richiamato gli si passa un nome utente
	 * si setta il parametro denomiato che prenderà il valore della query --> (user, null)
	 * se trova un utente con quel nome allora verrà salvato nella variabile theUser
	 * */
	@Override
	public User findByUserName(String theUserName) {

		// retrieve/read from database using username
//! Recupera e Legge dal database utilizzando username, ritorna un oggetto di tipo User se trova l'utente altrimenti lancia un eccezione
		TypedQuery<User> theQuery = entityManager.createQuery("from User where userName=:uName", User.class);
		theQuery.setParameter("uName", theUserName);

		User theUser = null;
		try {
			theUser = theQuery.getSingleResult();
		} catch (Exception e) {
			theUser = null;
		}

		return theUser;
	}

}
