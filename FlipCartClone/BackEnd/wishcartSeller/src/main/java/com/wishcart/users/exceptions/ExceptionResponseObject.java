package com.wishcart.users.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponseObject {
	private String message;
	@Builder.Default
	private String serviceName="wishcart_users";
	private Date time;
	private HttpStatus httpStatus;
}
