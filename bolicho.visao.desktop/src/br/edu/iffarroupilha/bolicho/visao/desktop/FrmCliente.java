package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * <p>
 * Classe que representa a View para gerir Clientes
 * </p>
 * @author RenanNM
 * @since 09/03/2017
 */
public class FrmCliente extends JFrame {


	private Bolicho telaPrincipal; //parâmetro de escopo global dentro da classe (é um ponteiro :)

	public FrmCliente(Bolicho telaPrincipal){ //criando uma associação entre a tela principal e a que estamos criando agora
		this.telaPrincipal = telaPrincipal;
		setTitle("Bolicho -> Clientes");
		setSize(320,240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
	}

	private void desenhaComponentes() {
		JLabel lblCPF = new JLabel("CPF:");
		JLabel lblNome = new JLabel("Nome:");
		JTextField txtCPF = new JTextField(30);
		JTextField txtNome =  new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout(new FlowLayout(FlowLayout.LEFT)); //definindo o layout dos componentes em tela [BoxLayout cria uma tabela com linhas e colunas]
		
		//adiciona os componentes em tela
		add(lblCPF);
		add(txtCPF);
		add(lblNome);
		add(txtNome);
		add(btnGravar);
	}
	
	
}
