package sql.entity_result.and.construtor_result.app.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import sql.entity_result.and.construtor_result.app.dao.Dao;
import sql.entity_result.and.construtor_result.app.entity.Model;

@Repository
public class DaoImpl implements Dao{
	
	@PersistenceContext
	private EntityManager em;
	
	private static final String SQL_CONSTRUCTOR_RESULT =" "
		  + " SELECT " + 
			"    cod_cidade as cidade, " + 
			"    nome as nome ," + 
			"    uf as uf," + 
			"    datainsert as datainsert " + 
			" FROM " + 
			"    cidades ";
	
	private static final String SQL_ENTITY_RESULT =" "
			  + " SELECT " + 
				"    cod_cidade as cidade, " + 
				"    nome as nome ," + 
				"    uf as uf," + 
				"    datainsert as datainsert " + 
				" FROM " + 
				"    cidades ";

	@Override
	public List<Model> findConstructorResult() {
		
		Query query = em.createNativeQuery(SQL_CONSTRUCTOR_RESULT, "ConstructorResultExemplo");
		
		return query.getResultList();
	}

	@Override
	public List<Model> findEntityresultResult() {
		
	Query query = em.createNativeQuery(SQL_ENTITY_RESULT, "EntityResultExemplo");
		
		return query.getResultList();
	}

	
	
}
