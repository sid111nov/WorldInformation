package com.webservices.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.webservices.models.City;
import com.webservices.models.State;
import com.webservices.models.Country;

public class WorldInformationDAO {
	
	SessionFactory sessionFactory = getSessionFactory();

	public WorldInformationDAO() {
		
	}

	private SessionFactory getSessionFactory() {
		Configuration configuartion = new Configuration().configure();
		configuartion.addAnnotatedClass(Country.class);
		configuartion.addAnnotatedClass(State.class);
		configuartion.addAnnotatedClass(City.class);
		SessionFactory sessionFactory = configuartion.buildSessionFactory();
		return sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Country> getCountries() {
		System.out.println("reached point 3");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Country> list = session.createQuery("from Country").getResultList();
		return list;
	}

	public void setCountry(String country, String countryCode) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Country countryEntity = new Country(country,countryCode);
		session.save(countryEntity);
		session.getTransaction().commit();
	}

}
