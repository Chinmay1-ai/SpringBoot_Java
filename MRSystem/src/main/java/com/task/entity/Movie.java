package com.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String title;
	private String genre;
	private String language;
	private String releaseYear;
	private String director;
	private String producer;
	private String duration;
	private String rating;
	private String review;
	private String actorName;
	private String actressName;
	private double budget;
	private double collection;

	public Movie() {

	}

	public Movie(int movieId, String title, String genre, String language, String releaseYear, String director,
			String producer, String duration, String rating, String review, String actorName, String actressName,
			double budget, double collection) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.releaseYear = releaseYear;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
		this.rating = rating;
		this.review = review;
		this.actorName = actorName;
		this.actressName = actressName;
		this.budget = budget;
		this.collection = collection;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getCollection() {
		return collection;
	}

	public void setCollection(double collection) {
		this.collection = collection;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", language=" + language
				+ ", releaseYear=" + releaseYear + ", director=" + director + ", producer=" + producer + ", duration="
				+ duration + ", rating=" + rating + ", review=" + review + ", actorName=" + actorName + ", actressName="
				+ actressName + ", budget=" + budget + ", collection=" + collection + "]";
	}

}
