package fr.epsi.android.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.epsi.android.modele.Promotion;

@Repository
public class PromotionDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public Promotion getPromoByCode(String code) {
		return em.find(Promotion.class, code);
	}
}
