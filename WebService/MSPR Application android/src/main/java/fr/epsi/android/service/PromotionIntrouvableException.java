package fr.epsi.android.service;

import fr.epsi.android.modele.Promotion;

/**
 * Classe d'exception pour 
 * @author Anaël Akouété
 *
 */

public class PromotionIntrouvableException extends Exception {
	public PromotionIntrouvableException(String message) {
		super(message);
	}

}
