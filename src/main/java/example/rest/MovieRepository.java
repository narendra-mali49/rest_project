package example.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieRepository {
	//This class is meant for holding several Movie objects
	private static Map<Integer, Movie> allMovies;
	
	static {
		allMovies = new HashMap<>();
		Movie m1 = new Movie(101,"Life of PI", "Emotional",125);
		Movie m2 = new Movie(102,"Speed", "Action",85);
		Movie m3 = new Movie(103,"Predator", "Horror",95);
		Movie m4 = new Movie(104,"Commando", "Action",125);
		Movie m5 = new Movie(105,"Tremors", "Horror",90);
		Movie m6 = new Movie(106,"Terminator", "Horror",95);
		
		allMovies.put(m1.getMovieId(), m1);
		allMovies.put(m2.getMovieId(), m2);
		allMovies.put(m3.getMovieId(), m3);
		allMovies.put(m4.getMovieId(), m4);
		allMovies.put(m5.getMovieId(), m5);
		allMovies.put(m6.getMovieId(), m6);
	}
	
//	get all movies
	public static Collection<Movie> getAllMovies(){
		return allMovies.values();
	}
	
//	get single movie
	public static Movie getSingleMovie(Integer id) {
		Movie singleMovie= allMovies.get(id);
		return singleMovie;
	}
	
//	get all movies with genre name
	public static Collection<Movie> getAllMoviesWithGenre(String genre){
		Collection<Movie> filteredMovie= new Vector<Movie>();
//		
//		for(Movie m: allMovies.values()) {
//			if(m.getGenre().toLowerCase().equals(genre.toLowerCase())) {
//				filteredMovie.add(m);
//			}
//		}
//		
//		return filteredMovie;
//		filteredMovie = allMovies.values().stream().filter((m)-> m.getGenre().toLowerCase().equals(genre.toLowerCase())).toList();
		filteredMovie = allMovies.values().stream().filter((m)-> m.getGenre().toLowerCase().equals(genre.toLowerCase())).collect(Collectors.toList());

		return filteredMovie;
	}
	
//	post movie in movie repository
	public static void createMovie(Movie m) {
		allMovies.put(m.getMovieId(), m);
	}
	
//	updating movie
	public static void updateMovie(Movie m) {
		allMovies.put(m.getMovieId(), m);
	}
	
//	deleting movie
	public static void deleteMovie(Integer id) {
		allMovies.remove(id);
	}
}
