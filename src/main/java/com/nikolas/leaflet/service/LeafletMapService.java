package com.nikolas.leaflet.service;

import java.io.Serializable;

import com.nikolas.leaflet.domain.LeafletMap;

public interface LeafletMapService extends Serializable {
	LeafletMap leafletMap(Integer id);

	LeafletMap updateLeafletMap(LeafletMap leafletMap);
}
