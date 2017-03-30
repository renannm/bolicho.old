package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;

/**
* <p>
* Classe de l�gica para a entidade cliente
* </p> 
**/
public class ClienteControle extends AControle{
	/*
	 * <p>
	 * Valida se os dados do cliente est�o corretos
	 * </p>
	 * */
	public String validarCliente(Cliente cli){
		
		if(cli != null){ //Valida��o da classe cliente
			if( cli.getCpf() == 0){
				return "Informe o CPF!";
			}else if( cli.getNome() == null || cli.getNome().isEmpty()){
				return "Por favor, informe um nome!";
			}
		}else{
			return "Dados do cliente n�o informados!";
		}
		
		return null;
	}

}