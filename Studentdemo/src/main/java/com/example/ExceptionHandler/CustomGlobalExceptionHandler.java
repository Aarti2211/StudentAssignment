package com.example.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
		
	//This annotation  which allows to handle exceptions across the whole application in one global handling component
@ControllerAdvice

		//ResponseEntityExceptionHandler provide centralized exception handling across all
		//@RequestMapping methods through @ExceptionHandler methods.
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders header,HttpStatus status,WebRequest request)
	{
		Map<String,String> errors=new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)->
		{
			String fieldname=((FieldError)error).getField();
			String message=error.getDefaultMessage();
			errors.put(fieldname, message);
		});
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
		
	}

}
