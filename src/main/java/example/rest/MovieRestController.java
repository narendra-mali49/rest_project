package example.rest;

import java.lang.reflect.Parameter;
import java.util.Collection;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= {"http://localhost:9000"})
public class MovieRestController {
	@RequestMapping("/movie-api")// default request is get request
	public Collection<Movie> getAllMovies() {
		return MovieRepository.getAllMovies();
	}
	
	@RequestMapping("/movie-api/{id}")
	public Object getSingleMovie(@PathVariable Integer id) {
		Movie m = MovieRepository.getSingleMovie(id);
		if(m==null)
			throw new MovieNotFoundException("Movie with given ID does not exist."); 
		return m;
	}
	
	@RequestMapping("/movie-api/having-genre/{genre}")
	public Collection<Movie> getAllMoviesHavingGenre(@PathVariable String genre){
		return MovieRepository.getAllMoviesWithGenre(genre);
	}
	
//	adding movie
	@PostMapping("/movie-api")//POST request
	public Response addMovie(@RequestBody Movie m) {
		System.out.println("Received Movie: "+m);
		MovieRepository.createMovie(m);
		return new Response(200, "Movie added");
	}
	
//	updating movie put
	@PutMapping("/movie-api")
	public String updateMovie(@RequestBody Movie m) {
		MovieRepository.updateMovie(m);
		return "Movie updated";
	}
	
// updating movie patch
	@PatchMapping("/movie-api")
	public String patchMovie() {
		return "Movie patch update";
	}
	
//	deleting movie
	@DeleteMapping("/movie-api/{id}")
	public String deleteMovie(@PathVariable Integer id) {
		MovieRepository.deleteMovie(id);
		return "Movie Deleted Successfully";
	}
	
//	
	@PostMapping("/movie-info")
	public void acceptMovieInfo(@RequestBody MovieInfo movieInfoRef) {
		System.out.println(movieInfoRef);
		//Depending upon the requirement, further processing may take place
	}
}
