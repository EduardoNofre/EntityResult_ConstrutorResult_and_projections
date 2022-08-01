package sql.entity_result.and.construtor_result.app.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SqlResultSetMappings(value = {  
@SqlResultSetMapping(
		name = "EntityResultExemplo",
		entities = @EntityResult(
				entityClass = Model.class,
				fields = {
						@FieldResult(name = "cidade",			column = "cidade"),
						@FieldResult(name = "nome",				column = "nome"),
						@FieldResult(name = "uf",				column = "uf"),
						@FieldResult(name = "dataInsert",		column = "dataInsert")
				})),

@SqlResultSetMapping(
		name = "ConstructorResultExemplo",
		classes = @ConstructorResult(
				targetClass = Model.class,
				columns = {
						@ColumnResult(name = "cidade",			type = Long.class),
						@ColumnResult(name = "nome",			type = String.class),
						@ColumnResult(name = "uf",				type = String.class),
						@ColumnResult(name = "dataInsert",		type = LocalDateTime.class)
				}))}
)


@JsonIgnoreProperties(ignoreUnknown = false)
public class Model implements Serializable {
	
	private static final long serialVersionUID = 8708487779741872153L;
	
	@Id
	private Long cidade;
	private String nome;
	private String uf;
	private LocalDateTime dataInsert;

}
