package fr.epsi.androidcontroleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.epsi.androidmodele.Promotion;

@RestController
@RequestMapping("/gostyle")
public class PromotionControleur {
	
	@GetMapping(path="/promotion", produces = "application/json")
	public Promotion getPromotion() {
		Promotion promotion = new Promotion();
		promotion.setCode("IOBI7488");
		promotion.setDescription("Ceci est un produit test");
		promotion.setLien("http://epsi.fr");
		return promotion;
	}
	
}
