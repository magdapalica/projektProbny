package com.fdmgroup.springbootprobaexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.springbootprobaexample.model.User;
import com.fdmgroup.springbootprobaexample.repository.CouponRepository;


@Service
public class CouponService {

	@Autowired
	private CouponRepository repo;
	
//	public List<Place> findAllPlaces(){
//		return repo.findAll();
//	}
//	
//	public void createNewPlace(Place place) {
//		repo.save(place);
//	}
//
//	public Place findPlacebyId(int id) {
//		Optional<Place> optPlace = repo.findById(id);
//		return optPlace.orElse(new Place("DefaultCity", "DefaultCountry"));
//	}
//
//	public void deletePlace(int id) {
//		repo.deleteById(id);
//	}
}
