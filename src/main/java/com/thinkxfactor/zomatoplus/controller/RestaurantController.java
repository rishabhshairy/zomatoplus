package com.thinkxfactor.zomatoplus.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.ItemRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository repo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	@PostMapping("/create")
	public Restaurant createRest(@RequestBody Restaurant restaurant) {
		repo.saveAndFlush(restaurant);
		return restaurant;
		
	}
	
	@GetMapping("/getAll")
	public List<Restaurant> listAll(){
		return repo.findAll();
		
	}
	
	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items item) {
		
		itemRepo.saveAndFlush(item);
		return item;
			
	}
	
	@GetMapping("/allItems")
	public List<Items> allItems() {
		return itemRepo.findAll();
	}
}
