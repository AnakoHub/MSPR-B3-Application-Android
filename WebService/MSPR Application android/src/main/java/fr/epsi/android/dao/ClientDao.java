package fr.epsi.android.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * Couche d'acces au données pour les requêtes sur la base de données des comptes clients
 * @author Anael Akouété
 *
 */

@Repository
public class ClientDao {
	
	@PersistenceContext
	private EntityManager em;
	
}
