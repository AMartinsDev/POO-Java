package Jogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;


public class telaDaVelha {

	private JFrame frmJogoDaVelha;
	public JogoDaVelha y;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JTextField text7;
	private JTextField text8;
	private JTextField text9;
	private JLabel lblNewLabel;
	private JTextField textWinner;
	int cont = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaDaVelha window = new telaDaVelha();
					window.frmJogoDaVelha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaDaVelha() {
		y = new JogoDaVelha();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmJogoDaVelha = new JFrame();
		frmJogoDaVelha.setForeground(Color.RED);
		frmJogoDaVelha.setTitle("JOGO DA VELHA");
		frmJogoDaVelha.setBounds(100, 100, 450, 300);
		frmJogoDaVelha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogoDaVelha.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont = 0;
				y.inicializar();
				
				text1.setEnabled(true);
				text1.setText("");
				
				text2.setEnabled(true);
				text2.setText("");
				
				text3.setEnabled(true);
				text3.setText("");
				
				text4.setEnabled(true);
				text4.setText("");

				text5.setEnabled(true);
				text5.setText("");

				text6.setEnabled(true);
				text6.setText("");

				text7.setEnabled(true);
				text7.setText("");

				text8.setEnabled(true);
				text8.setText("");
				
				text9.setEnabled(true);
				text9.setText("");

				textWinner.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(30, 216, 85, 21);
		frmJogoDaVelha.getContentPane().add(btnNewButton);
		
		textWinner = new JTextField();
		textWinner.setBounds(214, 219, 190, 19);
		frmJogoDaVelha.getContentPane().add(textWinner);
		textWinner.setColumns(10);
		
		
		text1 = new JTextField();
		text1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[0][0] = text1.getText();
				if(text1.getText().equalsIgnoreCase("X")){
				cont++;
				text1.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text1.getText().equalsIgnoreCase("O")){
				cont++;
				text1.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else{
				JOptionPane.showMessageDialog(text1, "Jogada invalida");
				}
			}
		});
		text1.setBounds(30, 25, 96, 19);
		frmJogoDaVelha.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[1][0] = text2.getText();
				if(text2.getText().equalsIgnoreCase("X")){
				cont++;
				text2.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text2.getText().equalsIgnoreCase("O")){
				cont++;
				text2.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text2, "Jogada invalida");
				}
			}
		});
		text2.setBounds(30, 86, 96, 19);
		frmJogoDaVelha.getContentPane().add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[2][0] = text3.getText();
				if(text3.getText().equalsIgnoreCase("X")){
				cont++;
				text3.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text3.getText().equalsIgnoreCase("O")){
				cont++;
				text3.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text3, "Jogada invalida");
				}
			}
		});
		text3.setBounds(30, 151, 96, 19);
		frmJogoDaVelha.getContentPane().add(text3);
		text3.setColumns(10);
		
		text4 = new JTextField();
		text4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[0][1] = text4.getText();
				if(text4.getText().equalsIgnoreCase("X")){
				cont++;
				text4.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text4.getText().equalsIgnoreCase("O")){
				cont++;
				text4.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text4, "Jogada invalida");
				}
			}
		});
		text4.setBounds(170, 25, 96, 19);
		frmJogoDaVelha.getContentPane().add(text4);
		text4.setColumns(10);
		
		text5 = new JTextField();
		text5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[1][1] = text5.getText();
				if(text5.getText().equalsIgnoreCase("X")){
				cont++;
				text5.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text5.getText().equalsIgnoreCase("O")){
				cont++;
				text5.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text5, "Jogada invalida");
				}
			}
		});
		text5.setBounds(170, 86, 96, 19);
		frmJogoDaVelha.getContentPane().add(text5);
		text5.setColumns(10);
		
		text6 = new JTextField();
		text6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[2][1] = text6.getText();
				if(text6.getText().equalsIgnoreCase("X")){
				cont++;
				text6.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text6.getText().equalsIgnoreCase("O")){
				cont++;
				text6.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text6, "Jogada invalida");
				}
			}
		});
		text6.setBounds(170, 151, 96, 19);
		frmJogoDaVelha.getContentPane().add(text6);
		text6.setColumns(10);
		
		text7 = new JTextField();
		text7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[0][2] = text7.getText();
				if(text7.getText().equalsIgnoreCase("X")){
				cont++;
				text7.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text7.getText().equalsIgnoreCase("O")){
				cont++;
				text7.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text7, "Jogada invalida");
				}
			}
		});
		text7.setBounds(308, 25, 96, 19);
		frmJogoDaVelha.getContentPane().add(text7);
		text7.setColumns(10);
		
		text8 = new JTextField();
		text8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[1][2] = text8.getText();
				if(text8.getText().equalsIgnoreCase("X")){
				cont++;
				text8.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text8.getText().equalsIgnoreCase("O")){
				cont++;
				text8.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text8, "Jogada invalida");
				}
			}
		});
		text8.setBounds(308, 86, 96, 19);
		frmJogoDaVelha.getContentPane().add(text8);
		text8.setColumns(10);
		
		text9 = new JTextField();
		text9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y.tabuleiro[2][2] = text9.getText();
				if(text9.getText().equalsIgnoreCase("X")){
				cont++;
				text9.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else if(text9.getText().equalsIgnoreCase("O")){
				cont++;
				text9.setEnabled(false);
				y.verificar(cont);
				textWinner.setText(y.getVencedor());
				}
				else {
				JOptionPane.showMessageDialog(text9, "Jogada invalida");
				}
			}
		});
		text9.setBounds(308, 151, 96, 19);
		frmJogoDaVelha.getContentPane().add(text9);
		text9.setColumns(10);
		
		lblNewLabel = new JLabel("Vencedor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(152, 220, 64, 13);
		frmJogoDaVelha.getContentPane().add(lblNewLabel);
		
		
		
	}
}
