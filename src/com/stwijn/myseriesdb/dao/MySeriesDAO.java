package com.stwijn.myseriesdb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stwijn.myseriesdb.entity.Series;

@Repository
public class MySeriesDAO implements SeriesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Series> getMySeries() {

		// DI mbv @Autowired
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Series> theQuery = currentSession.createQuery("from Series", Series.class);
		List<Series> deSeries = theQuery.getResultList();

		return deSeries;
	}

	@Override
	@Transactional
	public void saveSerie(Series mySerie) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(mySerie);
		//currentSession.save(mySerie);
	}

	@Override
	@Transactional
	public Series getSerie(int id) {

		Session currentSession = sessionFactory.getCurrentSession();

		// get Serie object mbv primary key
		Series mySerie = currentSession.get(Series.class, id);

		return mySerie;
	}

	@Override
	@Transactional
	public void deleteSerie(int id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Series mySerie = currentSession.get(Series.class, id);
		currentSession.delete(mySerie);
		
		/* kan ook mbv Query
		 * Query deleteQ = currentSession.createQuery("delete from Series where id=:serieId");
		 * deleteQ.setParameter("serieId", id);
		 * deleteQ.executeUpdate();
		 */
	}

}
