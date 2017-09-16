package org.ufpr.sistemapedidos.dao.generic;

import java.util.List;

/**
 * 
 * @author Caio Calo
 *
 * @param <T> entity
 */
public interface GenericDAO<T> {

	/**
	 * Busca por ID.
	 * 
	 * @author Caio Calo
	 * @param id
	 * @return entity
	 */
	T selectById(Long id);

	/**
	 * Busca todos que atendem a condi��o.
	 * 
	 * @author Caio Calo
	 * @param condition
	 * @return entity
	 */
	List<T> selectAll(String condition);

	/**
	 * Insere a entity no banco.
	 * 
	 * @author Caio Calo
	 * @param entity
	 * @return <b>true</b> - se inserido com sucesso.<br>
	 *         <b>false</b> - se houve algum problema na inser��o.
	 */
	boolean insert(T entity);

	/**
	 * Atualiza os dados no banco.
	 * 
	 * @author Caio Calo
	 * @param entity
	 * @return <b>true</b> - se atualizado com sucesso.<br>
	 *         <b>false</b> - se houve algum problema na atualiza��o.
	 */
	boolean update(T entity);

	/**
	 * Remove a entity do banco.
	 * 
	 * @author Caio Calo
	 * @param entity
	 * @return <b>true</b> - se removido com sucesso.<br>
	 *         <b>false</b> - se houve algum problema na remo��o.
	 */
	boolean delete(T entity);

}
