package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * <p>
 * Classe que representa a View para gerir Produtos 
 * </p>
 * @author RenanNM
 * @since 16/03/2017
 */
public class FrmProduto extends JFrame{
	
	public FrmProduto(Bolicho principal) {
		setTitle("Bolicho -> Produto");
		setSize(320,240);
		setLocationRelativeTo(principal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		// cria os componentes para a tela
		JLabel lblDescricao = new JLabel("Descricao:");
		JLabel lblPreco = new JLabel("Preco:");
		JTextField txtDescricao = new JTextField(30);
		JTextField txtPreco = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// adiciona em tela
		add(lblDescricao);
		add(txtDescricao);
		add(lblPreco);
		add(txtPreco);
		add(btnGravar);
		
		
		
		
	}

}
