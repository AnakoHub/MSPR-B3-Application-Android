package fr.epsi.androiddao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.epsi.androidmodele.Client;

@Repository
public class ClientDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public Client getClientByCode(int code) {
		return em.find(Client.class, code);
	}

}
