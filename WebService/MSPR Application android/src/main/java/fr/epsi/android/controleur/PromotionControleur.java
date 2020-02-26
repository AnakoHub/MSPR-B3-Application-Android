package fr.epsi.android.controleur;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import fr.epsi.android.modele.Promotion;
import fr.epsi.android.service.PromotionDto;
import fr.epsi.android.service.PromotionService;

@RestController
@RequestMapping("/gostyle")
public class PromotionControleur {
	
//	@Autowired
//	private PromotionService promotionService;
	
	/**
	 * Fonction test pour verifier la connexion entre le webservice et l'application
	 * @return promotion objet JSON
	 */
	@GetMapping(path="/promotion", produces = "application/json")
	public List<Promotion>getPromotion() {
		Promotion promotion1 = new Promotion();
		promotion1.setId(1);
		promotion1.setCode("IOBI7488");
		promotion1.setDate("31 Mars 2019");
		promotion1.setNom("Promotion sur une paire de basket");
		promotion1.setUrl("basket");
		promotion1.setDescription("30% de réduction sur une paire de basket dont le prix est supérieur à 50€");
		
		Promotion promotion2 = new Promotion();
		promotion2.setId(2);
		promotion2.setCode("IOFAIO213");
		promotion2.setDate("15 Mars 2019");
		promotion2.setNom("Promotion sur un T-shirt");
		promotion2.setUrl("tshirt");
		promotion2.setDescription("20% de réduction sur un T-Shirt dont le prix est supérieur à 25€");
		
		Promotion promotion3 = new Promotion();
		promotion3.setId(3);
		promotion3.setCode("IOFAIO318");
		promotion3.setDate("15 Juin 2019");
		promotion3.setNom("Casquette offerte");
		promotion3.setUrl("casquette");
		promotion3.setDescription("Une casquette offerte à partir de 100€ d'achat");
		
		Promotion promotion4 = new Promotion();
		promotion4.setId(4);
		promotion4.setCode("IOFAIO118");
		promotion4.setDate("15 Mai 2019");
		promotion4.setNom("Promotion sur un survêtement");
		promotion4.setUrl("survetement");
		promotion4.setDescription("30% sur un survêtement");
		
		Promotion promotion5= new Promotion();
		promotion5.setId(5);
		promotion5.setCode("IOFAIO218");
		promotion5.setDate("15 Juillet 2019");
		promotion5.setNom("Promotion Etudiante");
		promotion5.setUrl("basket");
		promotion5.setDescription("50% sur tout le magasin pour les étudiants sous reserve d’un justificatif");
		
		
		List<Promotion> listPromotion = new ArrayList<Promotion>();
		listPromotion.add(promotion1);
		listPromotion.add(promotion2);
		listPromotion.add(promotion3);
		listPromotion.add(promotion4);
		listPromotion.add(promotion5);
		
		return listPromotion;
	}	
	
//	@PostMapping(path = "/liste_promotion/{codePromotion}", produces = "application/json")
//	public ResponseEntity<Promotion> getListePromotion(@RequestBody PromotionDto promotionDto, UriComponentsBuilder uriBuilder,@PathVariable String codePromotion) {
//		Promotion promotion = promotionService.getPromoByCode(promotionDto.getCode(codePromotion));
//		URI uri = uriBuilder.path("/gostyle/liste_promotion/" + promotion.getCode()).build().toUri();
//		return ResponseEntity.created(uri).body(promotion);
//	}
}
