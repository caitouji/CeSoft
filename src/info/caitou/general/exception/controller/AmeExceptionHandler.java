package info.caitou.general.exception.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.UnexpectedTypeException;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ControllerAdvice
public class AmeExceptionHandler {

	/**
	 *
	 * @param exception UnexpectedTypeException
	 * @param response
	 * @return
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UnexpectedTypeException.class)
	public Object unexpectedType(UnexpectedTypeException exception, HttpServletResponse response) {
		return exception.getMessage();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public Object messageNotReadable(HttpMessageNotReadableException exception, HttpServletResponse response) {
		return exception.getMessage();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Object ex(MethodArgumentNotValidException exception, HttpServletResponse response) {
		BindingResult bindingResult = exception.getBindingResult();
		return getErrors(bindingResult);
	}

	private Map<String, String> getErrors(BindingResult result) {
		Map<String, String> map = new HashMap<>();
		List<FieldError> list = result.getFieldErrors();
		for (FieldError error : list) {
			map.put(error.getField(), error.getDefaultMessage());
		}
		return map;
	}
}
