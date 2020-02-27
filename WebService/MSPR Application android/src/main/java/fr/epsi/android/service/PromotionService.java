package fr.epsi.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.android.dao.PromotionDao;
import fr.epsi.android.modele.Promotion;

/**
 * Couche service de l'API web pour le traitement des opérations sur les objets
 * @author Anaël Akouété
 *
 */

@Service
public class PromotionService {
	
	@Autowired
	private PromotionDao promotionDao;
	
	/**
	 * Récupère la liste des promotions depuis le DAO de l'API web
	 * @return La liste de toutes les promotions récupérer dans la couche DAO
	 */
	@Transactional(readOnly = true)
	public List<Promotion> getAllPromo(){
		return promotionDao.getAllpromo();
	}
	
	/**
	 * Récupère depuis le DAO la promotion correspondant au code passé en argument
	 * @param code Code de la promotion
	 * @return Promotion correspondant au code ou un message d'erreur
	 */
	@Transactional(rollbackFor = PromotionIntrouvableException.class)
	public Promotion getPromoByCode(String code) throws PromotionIntrouvableException {
		if (promotionDao.getPromoByCode(code).equals(null)) {
			throw new PromotionIntrouvableException("Aucune promotion correspondant a ce code n'existe !");
		}
		return promotionDao.getPromoByCode(code);
	}
}
