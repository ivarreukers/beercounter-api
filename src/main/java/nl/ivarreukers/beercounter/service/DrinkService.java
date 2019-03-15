package nl.ivarreukers.beercounter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nl.ivarreukers.beercounter.model.BeerCounterStatus;
import nl.ivarreukers.beercounter.model.UpdateInput;
import nl.ivarreukers.beercounter.persistence.BeerCounterPersistence;

@Component
public class DrinkService {
	
	@Autowired
	BeerCounterPersistence beerCounterPersistence;
	
	public void addDrinkToPlayer(UpdateInput input) {
		beerCounterPersistence.addDrinkToPlayer();
	}

	public BeerCounterStatus getTotalUpdate() {
		beerCounterPersistence.getBeerCounterStatus();
		
		return null;
	}

}
