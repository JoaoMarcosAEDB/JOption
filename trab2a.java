import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class trab2a extends JFrame {

	private JPanel contentPane;
	private JTextField numerosA;
	private JTextField numerosB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trab2a frame = new trab2a();
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
	public trab2a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel N1 = new JLabel("A:");
		N1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		N1.setBounds(124, 75, 38, 42);
		contentPane.add(N1);
		
		JLabel N2 = new JLabel("B:");
		N2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		N2.setBounds(124, 128, 38, 42);
		contentPane.add(N2);
		
		numerosA = new JTextField();
		numerosA.setBounds(172, 90, 132, 28);
		contentPane.add(numerosA);
		numerosA.setColumns(10);
		
		numerosB = new JTextField();
		numerosB.setBounds(172, 143, 132, 28);
		contentPane.add(numerosB);
		numerosB.setColumns(10);
		
		JButton mostra = new JButton("Mostrar");
		mostra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numA = numerosA.getText();
				String numB = numerosB.getText();
				int A = Integer.parseInt(numA);
				int B = Integer.parseInt(numB);
				
				String value = "";
		        
		        for(int x = A; x <= B; x++){
		            if (x > A && x < B){
		                value =  value + ", " +x ;
		                
		            }
		            
		        }
		        JOptionPane.showMessageDialog(contentPane,"Os valores entre "+ A + " e " + B +"são:" + value);
					
				
				
			}
		});
		mostra.setBounds(182, 212, 89, 23);
		contentPane.add(mostra);
	}

}
