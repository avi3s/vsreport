package com.vs.vsreport.helper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.vs.vsreport.model.ErrorModel;

@RestControllerAdvice
public class ExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErrorModel> handleValidationExceptions(MethodArgumentNotValidException ex) {

		List<ErrorModel> errorModels = new ArrayList<ErrorModel>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			ErrorModel errorModel = new ErrorModel();
			errorModel.setErrorMessage(error.getDefaultMessage());
			errorModel.setFieldName(((FieldError) error).getField());
			errorModels.add(errorModel);
		});
		return errorModels;
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public Object handleAnyException(Exception e, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", Util.getCurrentDateTime());
		body.put("message", e.getLocalizedMessage());

		return body;
	}

}
