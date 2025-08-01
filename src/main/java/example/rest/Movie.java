package example.rest;

public class Movie {
	private Integer movieId;
	private String title;
	private String genre;
	private int duration;//Minutes
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Integer movieId, String title, String genre, int duration) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", duration=" + duration + "]";
	}
	
	
	
}
