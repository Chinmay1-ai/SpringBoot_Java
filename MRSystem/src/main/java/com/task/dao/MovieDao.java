package com.task.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.entity.Movie;

@Repository
public class MovieDao {

	@Autowired
	SessionFactory factory;

	public String insertMovie(Movie v) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.persist(v);
		session.close();
		tr.commit();

		return "Movie is Added Succesfully ....!! ";
	}

	public String deleteMovie(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Movie v = session.get(Movie.class, id);
		session.remove(v);
		session.close();
		tr.commit();

		return "Movie Deleted Succesfully ....!! ";
	}

	public String updateMovie(int id, Movie v) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Movie m = session.get(Movie.class, id);
		m.setTitle(v.getTitle());
		m.setGenre(v.getGenre());
		m.setLanguage(v.getLanguage());
		m.setReleaseYear(v.getReleaseYear());
		m.setDirector(v.getDirector());
		m.setProducer(v.getProducer());
		m.setDuration(v.getDuration());
		m.setRating(v.getRating());
		m.setReview(v.getReview());
		m.setActorName(v.getActorName());
		m.setActressName(v.getActressName());
		m.setBudget(v.getBudget());
		m.setCollection(v.getCollection());

		session.merge(m);
		session.close();
		tr.commit();

		return "Movie Details Updated Succesfully ....!! ";
	}

	public List<Movie> fetchAllMovies() {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from student";

		Query<Movie> query = session.createQuery(hqlQuery);
		List<Movie> list = query.getResultList();
		session.close();
		tr.commit();

		return list;
	}

}
