package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
* <p>
* Classe que concentra as l�gicas ligadas ao produto
* </p>
**/

public class ProdutoControle extends AControle {
	/*
	 * <p>
	 * Valida se os dados do produto est�o corretos
	 * </p>
	 * */
	public String validarProduto(Produto p){
		
		if(p != null){ //Valida��o da classe cliente
			if( p.getPreco() == 0){
				return "Informe o Pre�o!";
			}else if( p.getDescricao() == null || p.getDescricao().isEmpty()){
				return "Por favor, informe uma Descri��o!";
			}
		}else{
			return "Dados do cliente n�o informados!";
		}
		
		return null;
	}

	
}