package com.nikolas.leaflet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nikolas.leaflet.domain.LeafletMap;

public interface LeafletMapRepository extends  JpaRepository<LeafletMap, Integer> {

	LeafletMap findOne(Integer id);
	
//	LeafletMap saveAndFlush(LeafletMap leafletMap);
}
