package com.school.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ScheduleNotFoundByIdException extends RuntimeException {
	private String message;

	public ScheduleNotFoundByIdException(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}
	
}