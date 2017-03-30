package br.edu.iffarroupilha.bolicho.controle;

import java.util.List;

/**
 * <p>
 * controlador gen�rico que agrupa as fun��es comuns de l�gicas, como gravar,
 * buscar etc
 * </p>
 */
public abstract class AControle {
	// gravar ou atualizar uma informa��o
	// em banco
	public void gravar(Object entidade) {

	}

	// busca todos os registros de uma
	// determinada entidade (classe)
	public List buscarTodos(Class classe) {
		return null;
	}

	// excluir entidades
	public void excluir(Object entidade) {

	}
	/*
	 * <p>
	 * Converte um termo em um n�mero, caso o n�mero esteja em formato inv�lido, retorna-se zero.
	 * </p>
	 * */
	public int converteInteiro(String termo){
		try{
			return Integer.parseInt(termo);
		}catch(Exception e){
			return 0;
		}		
	}
	/*
	 * <p>
	 * Converte um termo em um n�mero com casas decimais, caso o n�mero esteja em formato inv�lido, retorna-se zero.
	 * </p>
	 * */
	public float converteFlutuante(String termo){
		try{
			return Float.parseFloat(termo);
		}catch(Exception e){
			return 0;
		}		
	}
}