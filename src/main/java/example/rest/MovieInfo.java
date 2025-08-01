package example.rest;

public class MovieInfo {
	private String movieTitle;
	private String movieGenre;
	
	public MovieInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieInfo(String movieTitle, String movieGenre) {
		super();
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieTitle=" + movieTitle + ", movieGenre=" + movieGenre + "]";
	}
	
	
}
