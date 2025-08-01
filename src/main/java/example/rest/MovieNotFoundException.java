package example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//UNCHECKED
@ResponseStatus(HttpStatus.NOT_FOUND) //Used to specify value for the Response Header 'status'
public class MovieNotFoundException extends RuntimeException {
	public MovieNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
