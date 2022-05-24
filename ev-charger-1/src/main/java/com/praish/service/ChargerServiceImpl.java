package com.praish.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.praish.model.Charger;
import com.praish.repository.ChargerRepository;

@Service
public class ChargerServiceImpl implements ChargerService{
	
	private ChargerRepository chargerRepository;
	
	public ChargerServiceImpl(ChargerRepository chargerRepository) {
		super();
		this.chargerRepository = chargerRepository;
	}

	@Override
	public List<Charger> getAllChargers() {
		return chargerRepository.findAll();
	}

	@Override
	public Charger saveCharger(Charger charger) {
		return chargerRepository.save(charger);
		
	}
	
	@Override
	public Charger getChargerById(Long id) {
		return chargerRepository.findById(id).get();
	}

	@Override
	public Charger updateCharger(Charger charger) {
		return chargerRepository.save(charger);
	}

	@Override
	public void deleteChargerById(Long id) {
		chargerRepository.deleteById(id);	
	}
}
