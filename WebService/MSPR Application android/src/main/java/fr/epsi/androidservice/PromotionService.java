package fr.epsi.androidservice;

import org.springframework.beans.factory.annotation.Autowired;

import fr.epsi.androiddao.PromotionDao;

public class PromotionService {
	@Autowired
	private PromotionDao promotionDao;
	
	public Promotion getPromoByCode(String code) {
		return promotionDao.getPromoByCode(code);
	}
}
