package us.hyalen.springbootprojects.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import us.hyalen.springbootprojects.entity.Restaurant;

@RestController
public class ItemCatalogController {
	@RequestMapping("/restaurant")
	public List<Restaurant> showRestaurant() {
		return Arrays.asList(
			new Restaurant(0, "PF do Mauricio"), 
			new Restaurant(0, "Pizza Hut"), 
			new Restaurant(0, "Fogo de Chao"));
	}
}
