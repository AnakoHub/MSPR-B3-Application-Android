package fr.epsi.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.android.dao.PromotionDao;
import fr.epsi.android.modele.Promotion;

/**
 * Couche service de l'API web
 * @author Anaël Akouété
 *
 */

@Service
public class PromotionService {
	
	@Autowired
	private PromotionDao promotionDao;
	
	/**
	 * Récupère la liste des promotions depuis la DAO de l'API web
	 * @return La liste de toutes les promotions récupérer dans la couche DAO
	 */
	@Transactional(readOnly = true)
	public List<Promotion> getAllPromo(){
		return promotionDao.getAllpromo();
	}
	
	@Transactional(readOnly = true)
	public Promotion getPromoByCode(String code) {
		return promotionDao.getPromoByCode(code);
	}
}
