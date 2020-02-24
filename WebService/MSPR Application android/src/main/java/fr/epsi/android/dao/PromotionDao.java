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
	
	/**
	 * Permet de recuperer une promotion specifique selon son code dans la base de données
	 * @param code Code de la promotion 
	 * @return Une promotion
	 */
	public Promotion getPromoByCode(String code) {
		return em.createQuery("SELECT p FROM Pizza p WHERE p.code = :code", Promotion.class)
				.setParameter("code", code)
				.getSingleResult();
	}
	
	/**
	 * Récupère la liste de toutes les promotions dans la base de données
	 * @return Liste de toutes les promotions
	 */
	public List<Promotion> getAllPromotion(){
		return em.createQuery("SELECT * FROM Promotion p", Promotion.class)
				.getResultList();
	}
}
