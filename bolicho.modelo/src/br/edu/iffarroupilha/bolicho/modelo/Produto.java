package br.edu.iffarroupilha.bolicho.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //chave primária
		@Column(nullable=false) //not null
		private int idProduto;
		
		@Column(length=40,nullable=false) //tamanho + notnull
		private String descricao;
		
		@Column(length=40,nullable=false) //tamanho + notnull
		private double preco;
		
		//Getters and Setters
		
		public int getIdProduto() {
			return idProduto;
		}
		public void setIdProduto(int idProduto) {
			this.idProduto = idProduto;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
}
