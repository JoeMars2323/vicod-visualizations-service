package com.marsoft.vicod.visualizations.exceptions;

import java.util.Arrays;

import org.springframework.http.HttpStatus;


public class NotFoundException extends VicodException {
	
	private static final long serialVersionUID = 7723792274526077721L;

	
	
	public NotFoundException(final String message) {
		super(HttpStatus.NOT_FOUND.value(), message);
	}

	
	
	public NotFoundException(final String message, final VicodError data) {
		super(HttpStatus.NOT_FOUND.value(), message, Arrays.asList(data));
	}
	
	
	
}