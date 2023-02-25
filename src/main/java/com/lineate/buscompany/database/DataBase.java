package com.lineate.buscompany.database;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.lineate.buscompany.model.LandQuakeMarker;
import com.lineate.buscompany.model.OceanQuakeMarker;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.AbstractShapeMarker;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.MultiMarker;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;

import processing.core.PGraphics;

public class DataBase {

	private List<Marker> quakeMarkers;

	private static DataBase instance; // #1

	private DataBase() {
	}

	public static DataBase getInstance() {
		if (instance == null) {
			instance = new DataBase();
		}
		return instance;
	}

	public void setQuakeMarkers(List<Marker> quakeMarkers) {
		this.quakeMarkers = quakeMarkers;

	}

	public void addQuakeMarker(LandQuakeMarker Marker) {
		this.quakeMarkers.add(Marker);
	}

	public void addQuakeMarker(OceanQuakeMarker Marker) {
		this.quakeMarkers.add(Marker);
	}

	public List<Marker> getQuakeMarkers() {
		return quakeMarkers;
	}

}
