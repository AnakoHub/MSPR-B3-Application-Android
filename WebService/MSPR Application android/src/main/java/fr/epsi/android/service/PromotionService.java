package fr.epsi.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.android.dao.PromotionDao;
import fr.epsi.android.modele.Promotion;

@Service
public class PromotionService {
	
	@Autowired
	private PromotionDao promotionDao;
	
	public Promotion getPromoByCode(String code) {
		return promotionDao.getPromoByCode(code);
	}
}