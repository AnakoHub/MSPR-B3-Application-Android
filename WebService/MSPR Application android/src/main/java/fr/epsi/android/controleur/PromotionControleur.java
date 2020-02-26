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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import fr.epsi.android.dto.ClientDto;
import fr.epsi.android.dto.PromotionDto;
import fr.epsi.android.modele.Client;
import fr.epsi.android.modele.Promotion;
import fr.epsi.android.service.ClientService;
import fr.epsi.android.service.PromotionService;

@RestController
@RequestMapping("/mspr")
public class PromotionControleur {
	
	@Autowired
	private PromotionService promotionService;
//	@Autowired
//	private ClientService clientService;
	
	/**
	 * Fonction test pour verifier la connexion entre le webservice et l'application
	 * avec deux Promotion entrées en dure
	 * @return promotion objet JSON
	 */
	@GetMapping(path="/test", produces = "application/json")
	public List<Promotion>getTest() {
		Promotion promotion1 = new Promotion();
		promotion1.setId(1);
		promotion1.setCode("IOBI7488");
		promotion1.setDate("31 Mars 2019");
		promotion1.setNom("Promotion test");
		promotion1.setUrl("basket");
		promotion1.setDescription("Produit test");
		
		Promotion promotion2 = new Promotion();
		promotion2.setId(2);
		promotion2.setCode("IOFAIO213");
		promotion2.setDate("15 Mars 2019");
		promotion2.setNom("Promotion test 2");
		promotion1.setUrl("teeshirt");
		promotion2.setDescription("2ème produit test");
		
		List<Promotion> listPromotion = new ArrayList<Promotion>();
		listPromotion.add(promotion1);
		listPromotion.add(promotion2);
		
		return listPromotion;
	}
	
	/**
	 * Reçois l'identifiant et le mot de passe passé dans la requête et créé l'objet client correspondant
	 * @param clientDto Identifiant et mot de passe passé par l'application
	 * @param uriBuilder 
	 * @return Un objet client correspondant au information du login passé par l'application
	 */
//	@PostMapping(path = "/login", produces = "applicaiton/json")
//	public ResponseEntity<Client> getLog(@RequestBody ClientDto clientDto, UriComponentsBuilder uriBuilder){
//		Client client = promotionService.;
//		URI uri = uriBuilder.path("/gostyle/" + clientService.getId());
//		return ResponseEntity.created(uri);
//	}
	
	/**
	 * Recupère la liste de promotion depuis la couche service pour le transmettre a la vue
	 * @return La liste de toutes les promotions depuis la couche service
	 */
	@GetMapping(path = "/liste-promotion", produces = "application/json")
	public List<Promotion> getAllPromotion() {
		List<Promotion> promotions = promotionService.getAllPromo();
		return promotions;
	}
	
	/**
	 * Recupère les détails d'une promotion grâce a son code
	 * @param codePromotion Code de la promotion
	 * @return La promotion correspondant au code envoyé dans la requête
	 */
//	@GetMapping(path = "/details/{codePromotion}", produces = "application/json")
//	public Promotion getPromotion(@PathVariable String codePromotion) {
//		return promotionService.getPromoByCode(codePromotion);
//	}
//	
//	@PostMapping(path = "/details/{codePromotion}", produces = "application/json")
//	public ResponseEntity<Promotion> getListePromotion(@RequestBody PromotionDto promotionDto, UriComponentsBuilder uriBuilder,@PathVariable String codePromotion) {
//		Promotion promotion = promotionService.getPromoByCode(promotionDto.getCode(codePromotion));
//		URI uri = uriBuilder.path("/gostyle/liste_promotion/" + promotion.getCode()).build().toUri();
//		return ResponseEntity.created(uri).body(promotion);
//	}
}