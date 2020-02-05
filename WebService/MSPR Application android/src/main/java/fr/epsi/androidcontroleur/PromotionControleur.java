package fr.epsi.androidcontroleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.epsi.androidservice.PromotionService;

@RestController
@RequestMapping("/gostyle")
public class PromotionControleur {
	@Autowired
	private PromotionService promotionService;
	
	@GetMapping(path="/promotion/{code}", produces = "application/json")
	public Promotion getPromotion(@Pathvariable String code) {
		return promotionService.getPromoByCode(code);
	}
	
//	@PostMapping(path="/promotion/", produces="application/json", consumes="application/json")
//	public ResponseEntity<Promotion> couponing(@RequestBody PromotionDto promotionDto, UriComponentBuilder uriBuilder){
//		Promotion promotion = promotionService
//	}
}
