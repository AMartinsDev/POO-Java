//Aluno: Arthur Silva Martins
//Matricula: 2018216002
//Disciplina: Programação Orientada a Objeto
//Professor: Manoel Carvalho
//Período: 2021.2


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class TelaConversaoDeUnidades {

	private JFrame frmConversorDeUnidades;
	private JTextField text0;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConversaoDeUnidades window = new TelaConversaoDeUnidades();
					window.frmConversorDeUnidades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public TelaConversaoDeUnidades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//INICIALIZAÇÃO DA CLASSE ConversaoDeUnidadesDeArea, USANDO A VARIAVEL "x"
		ConversaoDeUnidadesDeArea x = new ConversaoDeUnidadesDeArea();
		
		frmConversorDeUnidades = new JFrame();
		frmConversorDeUnidades.setTitle("Conversor De Unidades");
		frmConversorDeUnidades.setBounds(100, 100, 450, 300);
		frmConversorDeUnidades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeUnidades.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite a \u00E1rea do campo de futebol em m\u00B2:");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 47, 254, 15);
		frmConversorDeUnidades.getContentPane().add(lblNewLabel);
		
		text0 = new JTextField();
		text0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		text0.setBounds(240, 43, 63, 19);
		frmConversorDeUnidades.getContentPane().add(text0);
		text0.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("A \u00E1rea do campo em p\u00E9s quadrados \u00E9:");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 112, 213, 13);
		frmConversorDeUnidades.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A \u00E1rea do campo em milhas quadradas \u00E9:");
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 177, 224, 13);
		frmConversorDeUnidades.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("A \u00E1rea do campo em acre \u00E9:");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 146, 213, 13);
		frmConversorDeUnidades.getContentPane().add(lblNewLabel_3);
		
		text1 = new JTextField();
		text1.setBounds(220, 108, 96, 19);
		frmConversorDeUnidades.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(230, 142, 96, 19);
		frmConversorDeUnidades.getContentPane().add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(240, 173, 96, 19);
		frmConversorDeUnidades.getContentPane().add(text3);
		text3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("A \u00E1rea do campo em centrimetros quadrados \u00E9:");
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 211, 247, 13);
		frmConversorDeUnidades.getContentPane().add(lblNewLabel_4);
		
		text4 = new JTextField();
		text4.setBounds(263, 205, 96, 19);
		frmConversorDeUnidades.getContentPane().add(text4);
		text4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 87, 416, 2);
		frmConversorDeUnidades.getContentPane().add(separator);
		
		JButton botao0 = new JButton("Converter");
		botao0.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Declaração de var auxiliar para conseguir setar o texto na jtextfield com os valores convertidos
				String aux;
				text0.getText();
				x.metroQuadrado= Float.parseFloat(text0.getText());
				
				x.setPeQuadrado(x.metroQuadrado);
				aux = Float.toString(x.getPeQuadrado());
				text1.setText(aux);
				
				x.setAcre(x.getPeQuadrado());
				aux = Float.toString(x.getAcre());
				text2.setText(aux);
				
				x.setMilhaQuadrada(x.getAcre());
				aux = Float.toString(x.getMilhaQuadrada());
				text3.setText(aux);
				
				x.setCentimetrosQuadrados(x.getPeQuadrado());
				aux = Float.toString(x.getCentimetrosQuadrados());
				text4.setText(aux);
				
				botao0.setEnabled(false);
				text0.setEnabled(false);
				text1.setEnabled(false);
				text2.setEnabled(false);
				text3.setEnabled(false);
				text4.setEnabled(false);
				
			}
		});
		botao0.setBounds(310, 56, 116, 21);
		frmConversorDeUnidades.getContentPane().add(botao0);
		
		JButton botao1 = new JButton("Nova Convers\u00E3o");
		botao1.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				text0.setText("");
				text1.setText("");
				text2.setText("");
				text3.setText("");
				text4.setText("");
				
				text0.setEnabled(true);
				text1.setEnabled(true);
				text2.setEnabled(true);
				text3.setEnabled(true);
				text4.setEnabled(true);
				botao0.setEnabled(true);

			}
		});
		botao1.setBounds(310, 23, 116, 21);
		frmConversorDeUnidades.getContentPane().add(botao1);
		
		text0.setEnabled(false);
		text1.setEnabled(false);
		text2.setEnabled(false);
		text3.setEnabled(false);
		text4.setEnabled(false);
		botao0.setEnabled(false);
	}
}
