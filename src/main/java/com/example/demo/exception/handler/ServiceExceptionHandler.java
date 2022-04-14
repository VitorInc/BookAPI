package com.example.demo.exception.handler;


import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.NaoEncontradoException;
import com.example.demo.vo.ExceptionResponseVO;
@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {

	private static final String HEADER_MESSAGE = "mensagem";
	private static final String TYPE_VERIFICACAO_DADOS = "Verificação de dados";
	private static final String TITLE_NAO_ENCONTRADO = "Entidade não encontrada";

	private static final HttpStatus BAD_REQUEST = HttpStatus.BAD_REQUEST;

	
	@ExceptionHandler(NaoEncontradoException.class)
	public ResponseEntity<Object> handleNaoEncontradoException(NaoEncontradoException e, ServletWebRequest request) {

		logger.info(e.getMessage());

		ExceptionResponseVO bodyExceptionResponse = new ExceptionResponseVO(TITLE_NAO_ENCONTRADO,
				TYPE_VERIFICACAO_DADOS, "" + e.getMessage(), request.getRequest().getRequestURI());

		HttpHeaders header = new HttpHeaders();
		header.add(HEADER_MESSAGE, e.getMessage());

		return handleExceptionInternal(e, bodyExceptionResponse, header, BAD_REQUEST, request);
	}
	
	
}
