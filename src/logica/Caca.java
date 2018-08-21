package logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;

public class Caca extends JFrame {

	private JPanel contentPane;

	public Caca() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComoEstanLos = new JLabel("COMO ESTAN LOS HUEVOS DE TU TIO?");
		lblComoEstanLos.setBounds(102, 32, 267, 14);
		contentPane.add(lblComoEstanLos);
		
		JRadioButton rdbtnRicos = new JRadioButton("RICOS");
		rdbtnRicos.setBounds(19, 85, 109, 23);
		contentPane.add(rdbtnRicos);
		
		JRadioButton rdbtnSabrosos = new JRadioButton("SABROSOS");
		rdbtnSabrosos.setBounds(19, 127, 109, 23);
		contentPane.add(rdbtnSabrosos);
		
		JRadioButton rdbtnOtro = new JRadioButton("OTRO (Especifique abajo)");
		rdbtnOtro.setBounds(19, 165, 225, 23);
		contentPane.add(rdbtnOtro);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(NORMAL);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(29, 187, 139, 63);
		contentPane.add(editorPane);
	}
}
