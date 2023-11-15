package com.wishcart.users.exceptions;
import org.springframework.http.HttpStatus;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	private HttpStatus httpStatus;

	public CustomException(String message, HttpStatus httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public CustomException(String message) {
		super(message);
	}

}
