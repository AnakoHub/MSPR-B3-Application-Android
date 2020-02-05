package fr.epsi.androiddao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PromotionDao {
	
	@PersitenceContext
	private EntityManager em;
	
	public Promotion getPromoByCode(String code) {
		return em.find(Promotion.class, code);
	}
}
