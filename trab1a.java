import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class trab1a extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;
	private JTextField User;
	private JTextField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trab1a frame = new trab1a();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trab1a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Username = new JLabel("Login:");
		Username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Username.setBounds(27, 11, 58, 19);
		contentPane.add(Username);
		
		JLabel Password = new JLabel("Senha:");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Password.setBounds(25, 41, 60, 19);
		contentPane.add(Password);
		
		User = new JTextField();
		User.setBounds(95, 12, 86, 20);
		contentPane.add(User);
		User.setColumns(10);
		
		Pass = new JTextField();
		Pass.setBounds(95, 42, 86, 20);
		contentPane.add(Pass);
		Pass.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String use = User.getText();
				String pas = Pass.getText();
				
				if(use.equals("admin") && pas.equals("swordfish")) {
					
					JOptionPane.showMessageDialog(contentPane, "Bem vindo");
				}
				else
					JOptionPane.showMessageDialog(contentPane, "Usuário ou senha inválidos");
			
			}
		});
		btnNewButton.setBounds(51, 125, 89, 23);
		contentPane.add(btnNewButton);
	}
}
