

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtQtde;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Projeto projeto = new Projeto();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cansultas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Nome Pesquiisador");
		lblNewLabel_3.setBounds(49, 69, 137, 16);
		panel_1.add(lblNewLabel_3);
		
		JComboBox cmbPesquisadores = new JComboBox();
		cmbPesquisadores.setModel(new DefaultComboBoxModel(new String[] {"", "Mara Andrade"}));
		cmbPesquisadores.setBounds(219, 65, 237, 27);
		panel_1.add(cmbPesquisadores);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("QTD Pesquisadores");
		lblNewLabel_4.setBounds(49, 206, 153, 16);
		panel_1.add(lblNewLabel_4);
		
		txtQtde = new JTextField();
		txtQtde.setBounds(219, 201, 237, 26);
		panel_1.add(txtQtde);
		txtQtde.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor Pago");
		lblNewLabel_5.setBounds(49, 288, 132, 16);
		panel_1.add(lblNewLabel_5);
		
		txtValor = new JTextField();
		txtValor.setBounds(219, 283, 237, 26);
		panel_1.add(txtValor);
		txtValor.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastros", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Pesquisador");
		lblNewLabel.setBounds(33, 20, 137, 16);
		panel.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(187, 15, 130, 26);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(33, 70, 61, 16);
		panel.add(lblNewLabel_1);
		
		JComboBox cmbTipo = new JComboBox();
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"", "Professor", "Coordenador"}));
		cmbTipo.setBounds(69, 66, 248, 27);
		panel.add(cmbTipo);
		
		JLabel lblNewLabel_2 = new JLabel("Coordenador: ");
		lblNewLabel_2.setBounds(33, 135, 103, 16);
		panel.add(lblNewLabel_2);
		
		JComboBox cmbCoordenadores = new JComboBox();
		cmbCoordenadores.setModel(new DefaultComboBoxModel(new String[] {"", "Mara Andrade"}));
		cmbCoordenadores.setBounds(128, 131, 189, 27);
		panel.add(cmbCoordenadores);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome=txtNome.getText();
				String tipo = (String)cmbTipo.getSelectedItem();
				String coordenador = (String)cmbCoordenadores.getSelectedItem();
				
				projeto.addPesquisador(nome, tipo, coordenador);
				
				if(tipo.equalsIgnoreCase("coordenador")) {
					cmbCoordenadores.addItem(nome);
				}
				cmbPesquisadores.addItem(nome);
				
				JOptionPane.showMessageDialog(btCadastrar, "Pesquisador Cadastrado com Sucesso");		
			}
		});
		btCadastrar.setBounds(35, 216, 282, 29);
		panel.add(btCadastrar);
		
		JButton btnNewButton = new JButton("Consulta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = (String)cmbPesquisadores.getSelectedItem();
				Pesquisador selecionado = projeto.getRaiz().getByNome(nome);
				txtValor.setText(""+selecionado.getValorPago());
				txtQtde.setText(""+selecionado.getNumeroSupervisionados());
				
			}
		});
		btnNewButton.setBounds(64, 129, 117, 29);
		panel_1.add(btnNewButton);
	}
}
