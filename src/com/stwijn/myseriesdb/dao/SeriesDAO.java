package com.stwijn.myseriesdb.dao;

import java.util.List;

import com.stwijn.myseriesdb.entity.Series;

public interface SeriesDAO {

	public List<Series> getMySeries();
	
	public void saveSerie(Series mySerie);
	
	public Series getSerie(int id);
	
	public void deleteSerie(int id);
}
