//Aluno: Arthur Silva Martins
//Matricula: 2018216002
//Disciplina: Programação Orientada a Objeto
//Professor: Manoel Carvalho
//Período: 2021.2

package provaQuestao2;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela_Prova_Questao2 {

	// Declaração de variáveis
	String status; // auxiliar para as funções de interface
	private JFrame frame;
	private JTable tabela_disc; // Tabela para guardar as disciplinas
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private javax.swing.JButton botao_salvar = new JButton("SALVAR");
	private javax.swing.JButton botao_cancelar = new JButton("CANCELAR");
	private javax.swing.JButton botao_novo = new JButton("NOVO");
	private javax.swing.JButton botao_editar = new JButton("EDITAR");
	private javax.swing.JButton botao_excluir = new JButton("EXCLUIR");
	ArrayList<Disciplina> disc_Lista; // Array List para cadastrar disciplinas
	private JTable tabela_aluno;	// Tabela para guardar as aluno
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7; 
	private JTextField textField_8;
	private javax.swing.JButton botao_salvar_1 = new JButton("SALVAR");
	private javax.swing.JButton botao_cancelar_1 = new JButton("CANCELAR");
	private javax.swing.JButton botao_novo_1 = new JButton("NOVO");
	private javax.swing.JButton botao_editar_1 = new JButton("EDITAR");
	private javax.swing.JButton botao_excluir_1 = new JButton("EXCLUIR");
	ArrayList<Aluno> aluno_Lista; //Array List para cadastrar alunos
	private JTable tabela_curso; // Tabela para guardar os cursos
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private javax.swing.JButton botao_salvar_2 = new JButton("SALVAR");
	private javax.swing.JButton botao_cancelar_2 = new JButton("CANCELAR");
	private javax.swing.JButton botao_novo_2 = new JButton("NOVO");
	private javax.swing.JButton botao_editar_2 = new JButton("EDITAR");
	private javax.swing.JButton botao_excluir_2 = new JButton("EXCLUIR");
	ArrayList<Curso> curso_Lista; //Array List para cadastrar cursos
	//FIM DA DECLARAÇÃO DE VARIÁVEIS GLOBAIS


	// Carrega dados na tabela disciplina.
	public void carregar_Tabela_Disc() {

		DefaultTableModel modelo = new DefaultTableModel(new Object[] { "Nome", "Sigla", "C\u00F3digo", "Docente", "Aulas" },
				0);

		//Laço para ir adicionando novas linhas na tabela a medida que a mesma é povoada
		for (int i = 0; i < disc_Lista.size(); i++) {
			Object linha[] = new Object[] { disc_Lista.get(i).getNome(), disc_Lista.get(i).getSigla(),
					disc_Lista.get(i).getCod_Disc(), disc_Lista.get(i).getDocente(), disc_Lista.get(i).getQtd_Aulas() };

			modelo.addRow(linha);
		}
		
		//Metodos para padronizar as colunas da tabela durante a adição de dados
		tabela_disc.setModel(modelo);
		tabela_disc.getColumnModel().getColumn(0).setPreferredWidth(50);
		tabela_disc.getColumnModel().getColumn(1).setPreferredWidth(200);
	}

	// Carrega dados na tabela Alunos.
	public void carregar_Tabela_Alunos() {

		DefaultTableModel modelo = new DefaultTableModel(
				new Object[] { "Nome", "Código Do Aluno", "Carga Horária em Horas", "Disciplinas" }, 0);

		//Laço para ir adicionando novas linhas na tabela a medida que a mesma é povoada
		for (int i = 0; i < aluno_Lista.size(); i++) {
			Object linha[] = new Object[] { aluno_Lista.get(i).getNome(), aluno_Lista.get(i).getCod_Aluno(),
					aluno_Lista.get(i).getCarga_Horaria(), aluno_Lista.get(i).getCod_Disciplina() };

			modelo.addRow(linha);
		}
		
		//Metodos para padronizar as colunas da tabela durante a adição de dados
		tabela_aluno.setModel(modelo);
		tabela_aluno.getColumnModel().getColumn(0).setPreferredWidth(50);
		tabela_aluno.getColumnModel().getColumn(1).setPreferredWidth(200);
	}
	
	//Carrega dados na tabela Curso
	public void carregar_Tabela_Cursos() {

		DefaultTableModel modelo = new DefaultTableModel(new Object[] { "Nome  Curso", "C\u00F3digo Curso", "Quantidade Disciplinas", "Quantidade de Alunos", "Dura\u00E7\u00E3o Do Curso" },
				0);

		//Laço para ir adicionando novas linhas na tabela a medida que a mesma é povoada
		for (int i = 0; i < curso_Lista.size(); i++) {
			Object linha[] = new Object[] { curso_Lista.get(i).getNome(), curso_Lista.get(i).getCod_Curso(),
					curso_Lista.get(i).getQtd_Disciplinas(), curso_Lista.get(i).getQtd_Alunos(), curso_Lista.get(i).getDuracao_Em_Horas() };

			modelo.addRow(linha);
		}
		
		//Metodos para padronizar as colunas da tabela durante a adição de dados
		tabela_curso.setModel(modelo);
		tabela_curso.getColumnModel().getColumn(0).setPreferredWidth(50);
		tabela_curso.getColumnModel().getColumn(1).setPreferredWidth(200);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Prova_Questao2 window = new Tela_Prova_Questao2();
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
	public Tela_Prova_Questao2() {
		initialize();
		disc_Lista = new ArrayList<Disciplina>(); //instanciando os arraylists de cada classe utilizada;
		aluno_Lista = new ArrayList<Aluno>();
		curso_Lista = new ArrayList<Curso>();
		status = "Navegar"; // Variável que passo para as funções de manipulação de interface, ela demonstra o status atual da minha tela;
		
		manipulaInterfaceDisc();
		manipulaInterfaceAluno(); // Cabeçalho das Funções de status para cada interface presente
		manipulaInterfaceCurso();

	}

	// Função para manipular os botões da interface de Disciplinas
	public void manipulaInterfaceDisc() {

		switch (status) {
		case "Navegar":
			botao_salvar.setEnabled(false);
			botao_cancelar.setEnabled(false);
			textField.setEnabled(false);
			textField_1.setEnabled(false);
			textField_2.setEnabled(false);
			textField_3.setEnabled(false);
			textField_4.setEnabled(false);
			botao_novo.setEnabled(true);
			botao_editar.setEnabled(false);
			botao_excluir.setEnabled(false);
			break;

		case "Novo":
			botao_salvar.setEnabled(true);
			botao_cancelar.setEnabled(true);
			textField.setEnabled(true);
			textField_1.setEnabled(true);
			textField_2.setEnabled(true);
			textField_3.setEnabled(true);
			textField_4.setEnabled(true);
			botao_novo.setEnabled(false);
			botao_editar.setEnabled(false);
			botao_excluir.setEnabled(false);
			break;

		case "Editar":
			botao_salvar.setEnabled(true);
			botao_cancelar.setEnabled(true);
			textField.setEnabled(true);
			textField_1.setEnabled(true);
			textField_2.setEnabled(true);
			textField_3.setEnabled(true);
			textField_4.setEnabled(true);
			botao_novo.setEnabled(true);
			botao_editar.setEnabled(false);
			botao_excluir.setEnabled(false);
			break;

		case "Excluir":
			botao_salvar.setEnabled(false);
			botao_cancelar.setEnabled(false);
			textField.setEnabled(false);
			textField_1.setEnabled(false);
			textField_2.setEnabled(false);
			textField_3.setEnabled(false);
			textField_4.setEnabled(false);
			botao_novo.setEnabled(true);
			botao_editar.setEnabled(false);
			botao_excluir.setEnabled(false);
			break;

		case "Selecao":
			botao_salvar.setEnabled(false);
			botao_cancelar.setEnabled(false);
			textField.setEnabled(false);
			textField_1.setEnabled(false);
			textField_2.setEnabled(false);
			textField_3.setEnabled(false);
			textField_4.setEnabled(false);
			botao_novo.setEnabled(true);
			botao_editar.setEnabled(true);
			botao_excluir.setEnabled(true);
			break;
		default:
			System.out.println("Inválido");
		}
	}

	// Função para manipular os botões da interface de Alunos
	public void manipulaInterfaceAluno() {

		switch (status) {
		case "Navegar":
			botao_salvar_1.setEnabled(false);
			botao_cancelar_1.setEnabled(false);
			textField_5.setEnabled(false);
			textField_6.setEnabled(false);
			textField_7.setEnabled(false);
			textField_8.setEnabled(false);
			botao_novo_1.setEnabled(true);
			botao_editar_1.setEnabled(false);
			botao_excluir_1.setEnabled(false);
			break;

		case "Novo":
			botao_salvar_1.setEnabled(true);
			botao_cancelar_1.setEnabled(true);
			textField_5.setEnabled(true);
			textField_6.setEnabled(true);
			textField_7.setEnabled(true);
			textField_8.setEnabled(true);
			botao_novo_1.setEnabled(false);
			botao_editar_1.setEnabled(false);
			botao_excluir_1.setEnabled(false);
			break;

		case "Editar":
			botao_salvar_1.setEnabled(true);
			botao_cancelar_1.setEnabled(true);
			textField_5.setEnabled(true);
			textField_6.setEnabled(true);
			textField_7.setEnabled(true);
			textField_8.setEnabled(true);
			botao_novo_1.setEnabled(true);
			botao_editar_1.setEnabled(false);
			botao_excluir_1.setEnabled(false);
			break;

		case "Excluir":
			botao_salvar_1.setEnabled(false);
			botao_cancelar_1.setEnabled(false);
			textField_5.setEnabled(false);
			textField_6.setEnabled(false);
			textField_7.setEnabled(false);
			textField_8.setEnabled(false);
			botao_novo_1.setEnabled(true);
			botao_editar_1.setEnabled(false);
			botao_excluir_1.setEnabled(false);
			break;

		case "Selecao":
			botao_salvar_1.setEnabled(false);
			botao_cancelar_1.setEnabled(false);
			textField_5.setEnabled(false);
			textField_6.setEnabled(false);
			textField_7.setEnabled(false);
			textField_8.setEnabled(false);
			botao_novo_1.setEnabled(true);
			botao_editar_1.setEnabled(true);
			botao_excluir_1.setEnabled(true);
			break;
		default:
			System.out.println("Inválido");
		}
	}
	
	// Função para manipular os botões da interface de Cursos
	public void manipulaInterfaceCurso() {

			switch (status) {
			case "Navegar":
				botao_salvar_2.setEnabled(false);
				botao_cancelar_2.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				botao_novo_2.setEnabled(true);
				botao_editar_2.setEnabled(false);
				botao_excluir_2.setEnabled(false);
				break;

			case "Novo":
				botao_salvar_2.setEnabled(true);
				botao_cancelar_2.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(true);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(true);
				botao_novo_2.setEnabled(false);
				botao_editar_2.setEnabled(false);
				botao_excluir_2.setEnabled(false);
				break;

			case "Editar":
				botao_salvar_2.setEnabled(true);
				botao_cancelar_2.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(true);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(true);
				botao_novo_2.setEnabled(true);
				botao_editar_2.setEnabled(false);
				botao_excluir_2.setEnabled(false);
				break;

			case "Excluir":
				botao_salvar_2.setEnabled(false);
				botao_cancelar_2.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				botao_novo_2.setEnabled(true);
				botao_editar_2.setEnabled(false);
				botao_excluir_2.setEnabled(false);
				break;

			case "Selecao":
				botao_salvar_2.setEnabled(false);
				botao_cancelar_2.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				botao_novo_2.setEnabled(true);
				botao_editar_2.setEnabled(true);
				botao_excluir_2.setEnabled(true);
				break;
			default:
				System.out.println("Inválido");
			}
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Disciplina", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome Disciplina");
		lblNewLabel.setBounds(10, 44, 113, 13);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sigla Disciplina");
		lblNewLabel_1.setBounds(10, 67, 113, 13);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo Disciplina");
		lblNewLabel_2.setBounds(10, 90, 113, 13);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Docente");
		lblNewLabel_3.setBounds(10, 113, 113, 13);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Quantidade de Aulas");
		lblNewLabel_4.setBounds(10, 136, 122, 13);
		panel.add(lblNewLabel_4);

		textField = new JTextField();
		textField.setBounds(131, 41, 145, 19);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(131, 64, 145, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(131, 87, 145, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(131, 110, 145, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(131, 133, 145, 19);
		panel.add(textField_4);
		textField_4.setColumns(10);

		botao_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Conversão de atributo que está em string para um int
				int aux = Integer.parseInt(textField_4.getText());

				//Caso você aperte o botão novo, o status novo será enquadrado, permitindo um novo cadastro;
				if (status.equals("Novo")) {

					//instanciando uma variável para manipular o arraylist de disciplinas
					Disciplina d = new Disciplina(textField.getText(), textField_1.getText(), textField_2.getText(),
							textField_3.getText(), aux);
					disc_Lista.add(d);
					//toda vez que adicionar dados na tabela, a função de carregar será invocada para as informações serem adicionadas a uma linha da tabela;
					carregar_Tabela_Disc();
					JOptionPane.showMessageDialog(botao_salvar,
							"Disciplina Cadastrada Com Sucesso - Consulte O Menu Listar");

				//Caso opte por editar algum campo da tabela, o status será modificado para editar;
				} else if (status.equals("Editar")) {
					
					//pega a linha que você deseja editar;
					int index = tabela_disc.getSelectedRow();
					//pega as informações daquela linha e traz de volta para os textfields, onde você poderá edita-las;
					disc_Lista.get(index).setNome(textField.getText());
					disc_Lista.get(index).setSigla(textField_1.getText());
					disc_Lista.get(index).setCod_Disc(textField_2.getText());
					disc_Lista.get(index).setDocente(textField_3.getText());				
					disc_Lista.get(index).setQtd_Aulas(aux);
					JOptionPane.showMessageDialog(botao_salvar,
							"Disciplina Editada Com Sucesso - Consulte O Menu Listar");
				}

				//após as modificações, retorna ao status de navegação e os campos ficam em branco novamente;
				status = "Navegar";
				manipulaInterfaceDisc();

				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");

			}
		});
		botao_salvar.setBounds(162, 181, 103, 21);
		panel.add(botao_salvar);

		botao_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Quando aperta o botão cancelar, os campos são deixados em branco e logo depois o status passa para navegação novamente
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");

				status = "Navegar";
				manipulaInterfaceDisc();

			}
		});
		botao_cancelar.setBounds(308, 181, 113, 21);
		panel.add(botao_cancelar);

		botao_novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				////Quando aperta o botão novo, os campos são deixados em branco e logo depois o status passa para novo, podendo assim adicionar novas informações;
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");

				status = "Novo";
				manipulaInterfaceDisc();

			}
		});
		botao_novo.setBounds(3, 181, 97, 21);
		panel.add(botao_novo);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Listar Disciplinas", null, panel_3, null);
		panel_3.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 411, 152);
		panel_3.add(scrollPane_1);

		tabela_disc = new JTable();
		tabela_disc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Evento que reconhece a seleção de linhas numa tabela através do click do mouse, permitindo assim, o usuário editar ou excluir a linha;
				int index = tabela_disc.getSelectedRow();

				//Verifica se a linha selecionada é uma linha válida (existente)
				if (index >= 0 && index < disc_Lista.size()) {
					
					//Leva as informações da linha selecionada para os seus respectivos textsFields
					Disciplina d = disc_Lista.get(index);
					textField.setText(d.getNome());
					textField_1.setText(d.getSigla());
					textField_2.setText(d.getCod_Disc());
					textField_3.setText(d.getDocente());
					textField_4.setText(String.valueOf(d.getQtd_Aulas()));
					status = "Selecao";
					manipulaInterfaceDisc();

				}
			}
		});
		tabela_disc.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Nome", "Sigla", "C\u00F3digo", "Docente", "Aulas" }));
		scrollPane_1.setViewportView(tabela_disc);
		botao_editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Ativa o status editar
				status = "Editar";
				manipulaInterfaceDisc();
				JOptionPane.showMessageDialog(botao_editar,
						"Retorne Ao Menu Disciplina Para Alterar o Campo Selecionado");

			}
		});

		botao_editar.setBounds(89, 172, 85, 21);
		panel_3.add(botao_editar);
		botao_excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Exclui uma linha da tabela
				//É selecionada a linha e depois removida com o devido metodo;
				int index = tabela_disc.getSelectedRow();
				if (index >= 0 && index < disc_Lista.size()) {
					disc_Lista.remove(index);
				}
				//Atualiza os dados da tabela em que foi removida a linha
				carregar_Tabela_Disc();
			}
		});

		//A PARTIR DAQUI, OS CÓDIGOS SE REPETEM, MUDANDO APENAS OS TIPOS DOS ARRAYSLISTS E INTERFACE PRESENTE;
		
		botao_excluir.setBounds(221, 172, 101, 21);
		panel_3.add(botao_excluir);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Aluno", null, panel_1, null);
		panel_1.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 431, 236);
		panel_1.add(panel_4);

		JLabel lblNewLabel_5 = new JLabel("Nome Aluno");
		lblNewLabel_5.setBounds(10, 44, 113, 13);
		panel_4.add(lblNewLabel_5);

		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo Aluno");
		lblNewLabel_1_1.setBounds(10, 67, 113, 13);
		panel_4.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Carga Hor\u00E1ria");
		lblNewLabel_2_1.setBounds(10, 90, 113, 13);
		panel_4.add(lblNewLabel_2_1);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(131, 41, 145, 19);
		panel_4.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(131, 64, 145, 19);
		panel_4.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(131, 87, 145, 19);
		panel_4.add(textField_7);
		botao_salvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (status.equals("Novo")) {

					Aluno A = new Aluno(textField_5.getText(), textField_6.getText(), textField_7.getText(),
							textField_8.getText());
					aluno_Lista.add(A);
					carregar_Tabela_Alunos();
					JOptionPane.showMessageDialog(botao_salvar_1,
							"Aluno Cadastrado Com Sucesso - Consulte O Menu Listar");

				} else if (status.equals("Editar")) {

					int index = tabela_aluno.getSelectedRow();
					aluno_Lista.get(index).setNome(textField_5.getText());
					aluno_Lista.get(index).setCod_Aluno(textField_6.getText());
					aluno_Lista.get(index).setCarga_Horaria(textField_7.getText());
					aluno_Lista.get(index).setCarga_Horaria(textField_8.getSelectedText());

					JOptionPane.showMessageDialog(botao_salvar_1, "Aluno Editado Com Sucesso - Consulte O Menu Listar");
				}

				status = "Navegar";
				manipulaInterfaceAluno();

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
			}
		});

		botao_salvar_1.setBounds(162, 144, 103, 21);
		panel_4.add(botao_salvar_1);
		botao_cancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");

				status = "Navegar";
				manipulaInterfaceAluno();
			}
		});

		botao_cancelar_1.setBounds(308, 144, 113, 21);
		panel_4.add(botao_cancelar_1);
		botao_novo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");

				status = "Novo";
				manipulaInterfaceAluno();
			}
		});

		botao_novo_1.setBounds(0, 144, 97, 21);
		panel_4.add(botao_novo_1);

		textField_8 = new JTextField();
		textField_8.setBounds(131, 110, 145, 19);
		panel_4.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Disciplinas");
		lblNewLabel_6.setBounds(10, 113, 87, 13);
		panel_4.add(lblNewLabel_6);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Listar Alunos", null, panel_5, null);
		panel_5.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 411, 147);
		panel_5.add(scrollPane);

		tabela_aluno = new JTable();
		tabela_aluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int index = tabela_aluno.getSelectedRow();

				if (index >= 0 && index < aluno_Lista.size()) {

					Aluno A = aluno_Lista.get(index);
					textField_5.setText(A.getNome());
					textField_6.setText(A.getCod_Aluno());
					textField_7.setText(A.getCarga_Horaria());
					textField_8.setText(A.getCod_Disciplina());
					
					status = "Selecao";
					manipulaInterfaceAluno();

				}
			}
		});
		tabela_aluno.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "C\u00F3digo do Aluno", "Carga Hor\u00E1ria em Horas", "Disciplinas"
			}
		));
		scrollPane.setViewportView(tabela_aluno);
		botao_editar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				status = "Editar";
				manipulaInterfaceAluno();
				JOptionPane.showMessageDialog(botao_editar_1, "Retorne Ao Menu Aluno Para Alterar o Campo Selecionado");

			}
		});

		botao_editar_1.setBounds(10, 177, 85, 21);
		panel_5.add(botao_editar_1);
		botao_excluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int index = tabela_aluno.getSelectedRow();
				if (index >= 0 && index < aluno_Lista.size()) {
					aluno_Lista.remove(index);
				}
				carregar_Tabela_Alunos();
			}
		});

		botao_excluir_1.setBounds(134, 177, 85, 21);
		panel_5.add(botao_excluir_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 431, 236);
		panel_2.add(panel_6);
		
		JLabel lblNomeCurso = new JLabel("Nome Curso");
		lblNomeCurso.setBounds(10, 44, 113, 13);
		panel_6.add(lblNomeCurso);
		
		JLabel lblNewLabel_1_2 = new JLabel("C\u00F3digo do Curso");
		lblNewLabel_1_2.setBounds(10, 67, 113, 13);
		panel_6.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Quantidade Disciplinas");
		lblNewLabel_2_2.setBounds(10, 90, 113, 13);
		panel_6.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quantidade Alunos");
		lblNewLabel_3_1.setBounds(10, 113, 113, 13);
		panel_6.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Dura\u00E7\u00E3o Total em Horas");
		lblNewLabel_4_1.setBounds(10, 136, 122, 13);
		panel_6.add(lblNewLabel_4_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(131, 41, 145, 19);
		panel_6.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(131, 64, 145, 19);
		panel_6.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(131, 87, 145, 19);
		panel_6.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(131, 110, 145, 19);
		panel_6.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(131, 133, 145, 19);
		panel_6.add(textField_13);
		botao_salvar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int aux = Integer.parseInt(textField_11.getText());
				int aux2 = Integer.parseInt(textField_12.getText());
				int aux3 =Integer.parseInt(textField_13.getText());	
				
				if (status.equals("Novo")) {

					Curso c = new Curso(textField_9.getText(), textField_10.getText(), aux, aux2, aux3);
					curso_Lista.add(c);
					carregar_Tabela_Cursos();
					JOptionPane.showMessageDialog(botao_salvar_2,
							"Curso Cadastrado Com Sucesso - Consulte O Menu Listar");

				} else if (status.equals("Editar")) {

					int index = tabela_curso.getSelectedRow();
					curso_Lista.get(index).setNome(textField_9.getText());
					curso_Lista.get(index).setCod_Curso(textField_10.getText());
					curso_Lista.get(index).setQtd_Disciplinas(aux);
					curso_Lista.get(index).setQtd_Alunos(aux2);;				
					curso_Lista.get(index).setDuracao_Em_Horas(aux3);
					JOptionPane.showMessageDialog(botao_salvar_2,
							"Curso Editado Com Sucesso - Consulte O Menu Listar");
				}

				status = "Navegar";
				manipulaInterfaceCurso();

				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
			}
		});
		
		botao_salvar_2.setBounds(162, 181, 103, 21);
		panel_6.add(botao_salvar_2);
		botao_cancelar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");

				status = "Navegar";
				manipulaInterfaceCurso();
			}
		});
		
		botao_cancelar_2.setBounds(308, 181, 113, 21);
		panel_6.add(botao_cancelar_2);
		botao_novo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");

				status = "Novo";
				manipulaInterfaceCurso();
			}
		});
		
		botao_novo_2.setBounds(3, 181, 97, 21);
		panel_6.add(botao_novo_2);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Listar Cursos", null, panel_7, null);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 10, 411, 127);
		panel_7.add(scrollPane_2);
		
		tabela_curso = new JTable();
		tabela_curso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = tabela_curso.getSelectedRow();

				if (index >= 0 && index < curso_Lista.size()) {

					Curso c = curso_Lista.get(index);
					textField_9.setText(c.getNome());
					textField_10.setText(c.getCod_Curso());
					textField_11.setText(String.valueOf(c.getQtd_Disciplinas()));
					textField_12.setText(String.valueOf(c.getQtd_Alunos()));
					textField_13.setText(String.valueOf(c.getDuracao_Em_Horas()));
					status = "Selecao";
					manipulaInterfaceCurso();
				}
			}
		});
		tabela_curso.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome  Curso", "C\u00F3digo Curso", "Quantidade Disciplinas", "Quantidade de Alunos", "Dura\u00E7\u00E3o Do Curso"
			}
		));
		scrollPane_2.setViewportView(tabela_curso);
		botao_editar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status = "Editar";
				manipulaInterfaceCurso();
				JOptionPane.showMessageDialog(botao_editar_2,
						"Retorne Ao Menu Cursos Para Alterar o Campo Selecionado");
			}
		});
		
		botao_editar_2.setBounds(79, 177, 85, 21);
		panel_7.add(botao_editar_2);
		botao_excluir_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = tabela_curso.getSelectedRow();
				if (index >= 0 && index < curso_Lista.size()) {
					curso_Lista.remove(index);
				}
				carregar_Tabela_Alunos();
			}
		});
		
		botao_excluir_2.setBounds(246, 177, 85, 21);
		panel_7.add(botao_excluir_2);

	}
}
