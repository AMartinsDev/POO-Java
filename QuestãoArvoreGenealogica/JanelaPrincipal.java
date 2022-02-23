

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
public class JanelaPrincipal {

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
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
	Pessoa raiz = new Filho();
	public JanelaPrincipal() {
		initialize();
		this.raiz.setNome("Joao");
        this.raiz.setPai(null);
        comboBox.addItem(this.raiz.getNome());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pai");
		lblNewLabel.setBounds(45, 40, 73, 16);
		frame.getContentPane().add(lblNewLabel);
		
		 
		
		JLabel lblNewLabel_1 = new JLabel("Nova pessoa");
		lblNewLabel_1.setBounds(230, 40, 140, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(230, 65, 140, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(73, 121, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
		rdbtnNewRadioButton_1.setBounds(290, 121, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		buttonGroup1.add(rdbtnNewRadioButton_1);
		buttonGroup1.add(rdbtnNewRadioButton);
		comboBox = new JComboBox();
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (evt.getSource() != comboBox) {

		            Pessoa aux = null;
		            String nome = textField.getText();
		            String nomePai = ((String) comboBox.getModel().getSelectedItem());

		            aux = raiz.localizaPessoa(nomePai);


		            if (rdbtnNewRadioButton.isSelected()) {
		                try {
		                    aux.cadastrarFilho(nome, "masculino");
		                } catch (Exception ex) {
		                    System.out.print("Erro1");
		                }
		            } else if (rdbtnNewRadioButton_1.isSelected()) {
		                try {
		                    aux.cadastrarFilho(nome, "feminino");
		                } catch (Exception ex) {
		                    System.out.print("Erro2");
		                }
		            }



		            ArrayList<String> temp=raiz.getArvore();
		            DefaultComboBoxModel dt=new DefaultComboBoxModel(temp.toArray());
		            comboBox.setModel(dt);
		            comboBox.repaint();
		            

		        }
			
			}
		});
		btnNewButton.setBounds(180, 180, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(73, 221, 339, 76);
		frame.getContentPane().add(textArea);
	
		comboBox = new JComboBox();
		 comboBox.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent evt) {
		 		if (evt.getSource() != btnNewButton) {
		            
		            String nome = (String) comboBox.getModel().getSelectedItem();
		            Pessoa aux = null;
		            try {
		                aux = raiz.localizaPessoa(nome);
		            } catch (Exception ex) {
		                ex.printStackTrace(System.out);
		            }
		            textArea.setText(aux.getDescendencia());
		        }        
		 	}
		 });
		comboBox.setBounds(85, 36, 130, 27);
		frame.getContentPane().add(comboBox);
	}
}
