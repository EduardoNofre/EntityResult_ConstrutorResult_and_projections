package sql.entity_result.and.construtor_result.app.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Dto {

	private Long cidade;
	private String nome;
	private String uf;
	private LocalDateTime dataInsert;

}
