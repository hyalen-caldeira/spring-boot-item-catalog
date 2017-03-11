package us.hyalen.itemcatalog.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	private List<Restaurant> restaurants = new ArrayList<> (Arrays.asList(
			new Restaurant(0, "PF do Mauricio"), 
			new Restaurant(1, "Pizza Hut"), 
			new Restaurant(2, "Fogo de Chao")));
	
	public List<Restaurant> getAllRestaurants() {
		return restaurants;
	}
	
	public Restaurant getRestaurant(int id) {
		return restaurants.stream().filter(r -> r.getId() == id).findFirst().get();
	}

	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
		
	}

	public void updateRestaurant(int restaurantId, Restaurant restaurant) {
		for (int i = 0; i < restaurants.size(); i++) {
			Restaurant r = restaurants.get(i);
			
			if (r.getId() == restaurantId) {
				restaurants.set(i, restaurant);
				
				return;
			}
		}
	}

	public void deleteRestaurant(int restaurantId) {
		restaurants.removeIf(k -> k.getId() == restaurantId);
	}
}
