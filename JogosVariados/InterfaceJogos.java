

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceJogos {

	private JFrame frame;
	private JTextField txtJogadorZeroCem;
	private JTextField txtJogador1;
	private JTextField txtJogador2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceJogos window = new InterfaceJogos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceJogos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Jogo jogo=new ZeroACem();
		Jogo jogo2=new ParImpar();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Zero ou Um", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jogador: ");
		lblNewLabel.setBounds(30, 24, 61, 16);
		panel_2.add(lblNewLabel);
		
		txtJogadorZeroCem = new JTextField();
		txtJogadorZeroCem.setBounds(86, 19, 130, 26);
		panel_2.add(txtJogadorZeroCem);
		txtJogadorZeroCem.setColumns(10);
		
		JTextArea textAreaZeroCemPArcial = new JTextArea();
		textAreaZeroCemPArcial.setBounds(30, 118, 347, 46);
		panel_2.add(textAreaZeroCemPArcial);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=txtJogadorZeroCem.getText();
				jogo.addJogador(new Jogador(nome));
				textAreaZeroCemPArcial.setText(jogo.getJogadas());
			}
		});
		btnNewButton.setBounds(260, 19, 117, 29);
		panel_2.add(btnNewButton);
		
		JTextArea textAreaZerCemFinal = new JTextArea();
		textAreaZerCemFinal.setBounds(30, 204, 347, 46);
		panel_2.add(textAreaZerCemFinal);
		
		JButton btnNewButton_1 = new JButton("Jogar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaZerCemFinal.setText(jogo.jogar());
				textAreaZeroCemPArcial.setText(jogo.getJogadas());
			}
		});
		btnNewButton_1.setBounds(260, 70, 117, 29);
		panel_2.add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Resultado das Jogadas");
		lblNewLabel_1.setBounds(30, 94, 186, 16);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado Final: ");
		lblNewLabel_2.setBounds(30, 176, 147, 16);
		panel_2.add(lblNewLabel_2);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Par ou Impar", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Jogador 1: ");
		lblNewLabel_3.setBounds(6, 30, 68, 16);
		panel_1.add(lblNewLabel_3);
		
		txtJogador1 = new JTextField();
		txtJogador1.setBounds(79, 25, 117, 26);
		panel_1.add(txtJogador1);
		txtJogador1.setColumns(10);
		
		txtJogador2 = new JTextField();
		txtJogador2.setBounds(290, 25, 130, 26);
		panel_1.add(txtJogador2);
		txtJogador2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Jogador 2:");
		lblNewLabel_4.setBounds(208, 30, 70, 16);
		panel_1.add(lblNewLabel_4);
		
		
		
		JTextArea textAreaParImparParcial = new JTextArea();
		textAreaParImparParcial.setBounds(6, 122, 414, 46);
		panel_1.add(textAreaParImparParcial);
		
		
		JLabel lblNewLabel_5 = new JLabel("Resultado Final");
		lblNewLabel_5.setBounds(6, 212, 96, 16);
		panel_1.add(lblNewLabel_5);
		
		JTextArea textAreaParImparFinal = new JTextArea();
		textAreaParImparFinal.setBounds(6, 235, 414, 46);
		panel_1.add(textAreaParImparFinal);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Matriz Perfeita", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Jogador");
		lblNewLabel_6.setBounds(6, 24, 61, 16);
		panel.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 19, 130, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(6, 79, 50, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(6, 117, 50, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(84, 79, 50, 26);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(84, 117, 50, 26);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(6, 155, 50, 26);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(84, 155, 50, 26);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(164, 79, 50, 26);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(164, 117, 50, 26);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(164, 155, 50, 26);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Resultado Final");
		lblNewLabel_7.setBounds(6, 204, 203, 16);
		panel.add(lblNewLabel_7);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(16, 232, 394, 73);
		panel.add(textArea_4);
		
		JButton btnNewButton_4 = new JButton("Jogar");
		btnNewButton_4.setBounds(293, 117, 117, 29);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Cadastrar e Iniciar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogo2.addJogador(new Jogador(txtJogador1.getText()));
				jogo2.addJogador(new Jogador(txtJogador2.getText()));
				textAreaParImparParcial.setText(jogo2.getJogadas());
			}
		});
		btnNewButton_2.setBounds(149, 63, 162, 29);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Jogar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaParImparFinal.setText(jogo2.jogar());
			}
		});
		btnNewButton_3.setBounds(161, 180, 117, 29);
		panel_1.add(btnNewButton_3);
		
		
	}
}
