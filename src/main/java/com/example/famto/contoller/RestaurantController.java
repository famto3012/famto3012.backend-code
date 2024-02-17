package com.example.famto.contoller;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.famto.entity.ProductsData;
import com.example.famto.entity.RestaurantData;
import com.example.famto.entity.RestaurantTagsModel;
import com.example.famto.exception.ResourceNotFoundException;
import com.example.famto.repository.ProductsRepo;
import com.example.famto.repository.RestaurantRepo;


@RestController
@RequestMapping("/api/restaurants")


public class RestaurantController {
	
	@Autowired
	private RestaurantRepo restaurantRepo;

	// get all restaurants
	@GetMapping
	public List<RestaurantData> getAllRestaurants() {
		return this.restaurantRepo.findAll();
		
	}

	// get restaurants by id
	@GetMapping("/{restaurantId}")
	public RestaurantData getRestaurantById(@PathVariable (value = "restaurantId") int restaurantId) {
		return this.restaurantRepo.findById(restaurantId).
				orElseThrow(() -> new ResourceNotFoundException("User not found with restaurantId"));
	}

	// create restaurant
	@PostMapping
	
	public RestaurantData createRestaurant(@RequestBody RestaurantData restaurantData) {
		return this.restaurantRepo.save(restaurantData);
	
	}
	
	// update restaurant data
	@PutMapping("/{restaurantId}")
	public RestaurantData updateRestaurant(@RequestBody RestaurantData restaurantData, @PathVariable ("restaurantId") int restaurantId) {
		RestaurantData existingRestaurant = this.restaurantRepo.findById(restaurantId)
			.orElseThrow(() -> new ResourceNotFoundException("User not found with restaurantId"));
		
		if(restaurantData.getRestaurantName() != null) {
			existingRestaurant.setRestaurantName(restaurantData.getRestaurantName());
		}
		if(restaurantData.getAddress() != null) {
			existingRestaurant.setAddress(restaurantData.getAddress());
		}
		if(restaurantData.getPhone() != null) {
			existingRestaurant.setPhone(restaurantData.getPhone());
		}
		if(restaurantData.getEmail() != null) {
			existingRestaurant.setEmail(restaurantData.getEmail());
		}
		if(restaurantData.getCity() != null) {
			existingRestaurant.setCity(restaurantData.getCity());
		}
		if(restaurantData.getDisplayAddress() != null) {
			existingRestaurant.setDisplayAddress(restaurantData.getDisplayAddress());
		}
		if(restaurantData.getContactName() != null) {
			existingRestaurant.setContactName(restaurantData.getContactName());
		}
		if(restaurantData.getDescription() != null) {
			existingRestaurant.setDescription(restaurantData.getDescription());
		}
		if(restaurantData.getSlug() != null) {
			existingRestaurant.setSlug(restaurantData.getSlug());
		}
		if(restaurantData.getLogoUrl() != null) {
			existingRestaurant.setLogoUrl(restaurantData.getLogoUrl());
		}
		
		if(restaurantData.getBannerUrl() != null) {
			existingRestaurant.setBannerUrl(restaurantData.getBannerUrl());
		}
		if(restaurantData.getBgColour() != null) {
			existingRestaurant.setBgColour(restaurantData.getBgColour());
		}
		if(restaurantData.getRatingBarColor() != null) {
			existingRestaurant.setRatingBarColor(restaurantData.getRatingBarColor());
		}
		if(restaurantData.getTag() != null) {
			existingRestaurant.setTag(restaurantData.getTag());
		}		
		if(restaurantData.getServingArea() != null) {
			existingRestaurant.setServingArea(restaurantData.getServingArea());
		}
		if(restaurantData.getCommissionType() != null) {
			existingRestaurant.setCommissionType(restaurantData.getCommissionType());
		}		
		if(restaurantData.getBusinessCategory() != null) {
			existingRestaurant.setBusinessCategory(restaurantData.getBusinessCategory());
		}
		if(restaurantData.getRating() != null) {
			existingRestaurant.setRating(restaurantData.getRating());
		}		
		if(restaurantData.getServiceStatus() != null) {
			existingRestaurant.setServiceStatus(restaurantData.getServiceStatus());
		}
		if(restaurantData.getSponsorship() != null) {
			existingRestaurant.setSponsorship(restaurantData.getSponsorship());
		}		
		if(restaurantData.getCommissionValue() != null) {
			existingRestaurant.setCommissionValue(restaurantData.getCommissionValue());
		}
		if(restaurantData.getLatitude() != null) {
			existingRestaurant.setLatitude(restaurantData.getLatitude());
		}		
		if(restaurantData.getLongitude() != null) {
			existingRestaurant.setLongitude(restaurantData.getLongitude());
		}
		if(restaurantData.getTags() != null) {
			existingRestaurant.setTags(restaurantData.getTags());
		}
		 return this.restaurantRepo.save(existingRestaurant);
	}
	
	@DeleteMapping("/{restaurantId}")
	public ResponseEntity<RestaurantData> deleteRestaurant(@PathVariable ("restaurantId") int restaurantId){
		RestaurantData existingRestaurant = this.restaurantRepo.findById(restaurantId)
					.orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + restaurantId));
		 this.restaurantRepo.delete(existingRestaurant);
		 return ResponseEntity.ok().build();
	} 
	
	@GetMapping("/search")
    public List<RestaurantData> searchRestaurants(String query) {
        List<RestaurantData> restaurants = restaurantRepo.searchRestaurants(query);
        return restaurants;
    }

}
