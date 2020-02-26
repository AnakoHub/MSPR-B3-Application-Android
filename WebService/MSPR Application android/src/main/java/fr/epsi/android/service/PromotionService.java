package fr.epsi.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.android.dao.PromotionDao;
import fr.epsi.android.modele.Promotion;

/**
 * Coucher service de l'API web
 * @author Anako
 *
 */

@Service
public class PromotionService {
	
	@Autowired
	private PromotionDao promotionDao;
	
	@Transactional(readOnly = true)
	public List<Promotion> getAllPromo(){
		return promotionDao.getAllpromo();
	}
	
	@Transactional(readOnly = true)
	public Promotion getPromoByCode(String code) {
		return promotionDao.getPromoByCode(code);
	}
}
