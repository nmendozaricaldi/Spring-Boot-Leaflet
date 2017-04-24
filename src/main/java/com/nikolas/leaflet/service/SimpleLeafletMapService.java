package com.nikolas.leaflet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikolas.leaflet.domain.LeafletMap;
import com.nikolas.leaflet.repository.LeafletMapRepository;

@Component
public class SimpleLeafletMapService implements LeafletMapService {
	@Autowired
	LeafletMapRepository leafletMapRepository;

	private static final long serialVersionUID = 1L;

	@Override
	public LeafletMap leafletMap(Integer id) {
		return leafletMapRepository.findOne(id);
	}

	@Override
	public LeafletMap updateLeafletMap(LeafletMap leafletMap) {
		leafletMap = leafletMapRepository.saveAndFlush(leafletMap);
		return leafletMap;
	}

}
