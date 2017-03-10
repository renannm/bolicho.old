package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * <p>
 * Classe Principal do Projeto, contempla a tela inicial
 * </p>
 * 
 * @author RenanNM
 * @since 08/03/2017
 */
public class Bolicho extends JFrame {

	// Construtor Inicial (Atalho Ctrl + BarraDeEspaço + Enter)

	public Bolicho() {
		setTitle(":: Bolicho ::");
		setSize(640, 480); // Se trocar com a linha debaixo, a interface é
							// criada primeiro e depois centraliza (da uma
							// "zuada no vizu")
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes(); // **Atalho** Clicka em cima -> Ctrl + 1 + Enter	
		setVisible(true); // última coisa a se fazer é o SetVisible, pois o que
							// esta depois dela não aparece na tela (a menos que
							// tu "force")
	}

	private void desenhaComponentes() { //Criamos os itens do menu!
		// cria a barra de menus
		JMenuBar menu = new JMenuBar();
		// cria o menu cadastros
		JMenu cadastro = new JMenu("Cadastros");
		menu.add(cadastro);
		// cria os sub items
		JMenuItem cliente = new JMenuItem("Cliente");
		JMenuItem produto = new JMenuItem("Produtos");
		JMenuItem venda = new JMenuItem("Vendas");
		// vincula ao menu cadastros
		cadastro.add(cliente);
		cadastro.add(produto);
		cadastro.add(venda);
		// vincula as ações aos items
		// Ação ao clickar em Cliente
		cliente.addActionListener(new ActionListener() { // e -> {}; Expressão Lâmbda equivalente ao "new Action Listener()" mas precisa da versão Java RE 1.8!!!
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new FrmCliente(Bolicho.this); //instanciando a classe Cliente na classe principal
			}
		});
		// Ação ao clickar em Produto
		produto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(Bolicho.this,"Conte-me sobre o seu dia ^_^) :");
				
			}
		});
		// Ação ao clickar em Venda
		venda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(Bolicho.this, "Você aceita doar um pouco do seu Ki para a Genkidama?");
				
			}
		});
		
		//adiciona o menu na tela (tipo um add)
		setJMenuBar(menu);
		
	}

	public static void main(String[] args) {
		new Bolicho();
	}

}
