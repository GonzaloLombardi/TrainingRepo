package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestFrame extends JFrame {

	private JPanel contentPane;

	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblText = new JLabel("TEXT");
		lblText.setBounds(166, 159, 89, 14);
		contentPane.add(lblText);
		lblText.setText("");

		JButton btnHola = new JButton("Hola");
		btnHola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblText.setText("Hola hola");
			}
		});
		btnHola.setBounds(166, 71, 89, 23);
		contentPane.add(btnHola);
		this.setVisible(true);
	}
}
