package fr.epsi.android.controleur;

import java.net.URI;
import java.util.ArrayList;
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
		promotion1.setNom("Promotion test");
		promotion1.setDescription("Produit test");
		
		Promotion promotion2 = new Promotion();
		promotion2.setId(2);
		promotion2.setCode("IOFAIO213");
		promotion2.setNom("Promotion test 2");
		promotion2.setDescription("2ème produit test");
		
		List<Promotion> listPromotion = new ArrayList<Promotion>();
		listPromotion.add(promotion1);
		listPromotion.add(promotion2);
		
		return listPromotion;
	}	
	
//	@PostMapping(path = "/liste_promotion/{codePromotion}", produces = "application/json")
//	public ResponseEntity<Promotion> getListePromotion(@RequestBody PromotionDto promotionDto, UriComponentsBuilder uriBuilder,@PathVariable String codePromotion) {
//		Promotion promotion = promotionService.getPromoByCode(promotionDto.getCode(codePromotion));
//		URI uri = uriBuilder.path("/gostyle/liste_promotion/" + promotion.getCode()).build().toUri();
//		return ResponseEntity.created(uri).body(promotion);
//	}
}
