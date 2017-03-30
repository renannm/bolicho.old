package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.iffarroupilha.bolicho.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho.controle.ProdutoControle;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

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
		final JTextField txtDescricao = new JTextField(30);
		final JTextField txtPreco = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		btnGravar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				ProdutoControle controle = new ProdutoControle();
				//pegar dados da tela
				Produto p = new Produto();
				p.setDescricao(txtDescricao.getText());
				//converte para um valor flutuante
				float preco = controle.converteFlutuante(txtPreco.getText());
				
				p.setPreco(preco);
				
				//valida os dados
				String erro = controle.validarProduto(p);
				if(erro == null){
					//nenhum erro criado
					//realiza a gravação
					controle.gravar(p);
					JOptionPane.showMessageDialog(null, "Gravado!");
				}else{
					JOptionPane.showMessageDialog(null, erro, "Validação", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// adiciona em tela
		add(lblDescricao);
		add(txtDescricao);
		add(lblPreco);
		add(txtPreco);
		add(btnGravar);
		
		
		
		
	}

}
