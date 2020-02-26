package fr.epsi.android.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import fr.epsi.android.modele.Promotion;

@Repository
public class PromotionDao {
 private EntityManager em;
 
 public List<Promotion> getAllpromo(){
	 return em.createQuery("SELECT p from Promotion p", Promotion.class)
			 .getResultList();
 }
}
