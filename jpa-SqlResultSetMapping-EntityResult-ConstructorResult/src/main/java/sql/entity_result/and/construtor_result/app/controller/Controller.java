package sql.entity_result.and.construtor_result.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import sql.entity_result.and.construtor_result.app.dto.Dto;
import sql.entity_result.and.construtor_result.app.service.Services;

@RestController
@RequestMapping("/result")
@Api(tags = { "Estudo do 'EntityResult e ConstructorResult '"})
public class Controller {
	
	@Autowired
	private Services services;


	@ApiOperation(value = "Exemplo: @constructorResult",notes = "Exemplo de request: /constructor")
	@GetMapping(value = "/constructor")
	public ResponseEntity<List<Dto>> exemploConstructorResult(){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(services.servicesConstructorResult());

	}
	
	@ApiOperation(value = "Exemplo: @entityresultResult",notes = "Exemplo de request: /entity")
	@GetMapping(value = "/entity")
	public ResponseEntity<List<Dto>> exemploEntityResult(){

		return ResponseEntity.status(HttpStatus.CREATED).body(services.servicesEntityresultResult());
	}
	
}
