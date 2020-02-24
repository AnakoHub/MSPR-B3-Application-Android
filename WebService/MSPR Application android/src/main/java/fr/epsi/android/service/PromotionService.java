package fr.epsi.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.android.dao.PromotionDao;
import fr.epsi.android.modele.Promotion;

@Service
public class PromotionService {
	
	@Autowired
	private PromotionDao promotionDao;
	
	/**
	 * Récupère la liste de promotion depuis le DAO qui accède a la base de données
	 * @return Liste de toutes les promotions
	 */
	public List<Promotion> getAllPromotion(){
		return promotionDao.getAllPromotion();
	}
	
	/**
	 * Récupère une promotion spécifique avec son code
	 * @param code Code de la promotion
	 * @return Promotion selon le code correspondant au code
	 */
	public Promotion getPromoByCode(String code) {
		return promotionDao.getPromoByCode(code);
	}
}