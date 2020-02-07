package fr.epsi.androidservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.androiddao.PromotionDao;
import fr.epsi.androidmodele.Promotion;

@Service
public class PromotionService {
	
	@Autowired
	private PromotionDao promotionDao;
	
	public Promotion getPromoByCode(String code) {
		return promotionDao.getPromoByCode(code);
	}
}