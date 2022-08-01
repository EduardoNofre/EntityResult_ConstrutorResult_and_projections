package sql.entity_result.and.construtor_result.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import sql.entity_result.and.construtor_result.app.dao.Dao;
import sql.entity_result.and.construtor_result.app.dto.Dto;
import sql.entity_result.and.construtor_result.app.entity.Model;


@Service
@Getter
@Slf4j
public class Services {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private Dao dao;
	

	public List<Dto> servicesConstructorResult(){
		
		log.info("utilizando o @ConstructorResult");
		return dao.findConstructorResult().stream().map(this::converterToDto).collect(Collectors.toList());
	}
	

	public List<Dto> servicesEntityresultResult(){

		log.info("utilizando o @EntityResult");
		return dao.findEntityresultResult().stream().map(this::converterToDto).collect(Collectors.toList());
	}
	
	private Dto converterToDto(Model model) {

		return modelMapper.map(model, Dto.class);

	}
}
