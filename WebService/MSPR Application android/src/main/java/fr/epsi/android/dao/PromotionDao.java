package fr.epsi.android.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.epsi.android.modele.Promotion;

/**
 * Couche repository de l'API web pour l'accès à la base de données 
 * et les requêtes concernant les promotions
 * @author Anaël Akouété
 *
 */

@Repository
public class PromotionDao {
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Recupère la liste de toutes les promotions en base de données
	 * @return La liste de toutes les promotions
	 */
	public List<Promotion> getAllpromo(){
		return em.createQuery("SELECT p FROM Promotion p", Promotion.class)
				.getResultList();
	}
	
	/**
	 * Récupère dans la base de données la promoiton correspondant au code envoyé dans la requête
	 * @param code Code de la promotion
	 * @return	L'objet Promotion correspondant au code passé en argument
	 */
	public Promotion getPromoByCode(String code) {
		return em.createQuery("SELECT p FROM Promotion p WHERE p.code = :code", Promotion.class)
				.setParameter("code", code)
				.getSingleResult();
	}
}
