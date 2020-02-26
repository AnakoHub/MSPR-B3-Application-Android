package fr.epsi.android.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.epsi.android.modele.Promotion;

@Repository
public class PromotionDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<Promotion> getAllpromo(){
		return em.createQuery("SELECT p from Promotion p", Promotion.class)
				.getResultList();
	}
}
