package nl.ivarreukers.beercounter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.ivarreukers.beercounter.model.BeerCounterStatus;
import nl.ivarreukers.beercounter.model.UpdateInput;
import nl.ivarreukers.beercounter.service.DrinkService;

@RestController
public class DrinkCounterController {
    
	@Autowired
	DrinkService drinkService;
	
    @GetMapping("/update")
    public BeerCounterStatus getTotalUpdate() {
    	return drinkService.getTotalUpdate();
    }
    
    @PostMapping("/add-drink")
    public void addDrink(@RequestBody UpdateInput input) {
    	drinkService.addDrinkToPlayer(input);
    }
}
