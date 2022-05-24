package com.praish.service;

import java.util.List;

import com.praish.model.Charger;

public interface ChargerService {
	
	List<Charger> getAllChargers();
	
	Charger saveCharger(Charger charger);
	
	Charger getChargerById(Long id);
	
	Charger updateCharger(Charger charger);
	
	void deleteChargerById(Long id);

}
