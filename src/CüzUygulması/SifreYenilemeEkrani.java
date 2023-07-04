package CüzUygulması;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class SifreYenilemeEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SifreYenilemeEkrani frame = new SifreYenilemeEkrani();
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
	public SifreYenilemeEkrani() {
		
		UserFileHandler handler = new UserFileHandler("resources/login.txt");
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Şifre Yenileme");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setBounds(81, 11, 280, 55);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("SORU1: Furkan'ın en sevdiği yazarın adı nedir? (tüm harfler küçük olmalı)");
		lblNewLabel_1.setBounds(10, 77, 454, 40);
		
		JLabel lblNewLabel_2 = new JLabel("SORU2: Furkan'ın oyunlarda kullandığı nick nedir? (tüm harfler küçük olmalı)");
		lblNewLabel_2.setBounds(10, 159, 454, 40);
		
		textField = new JTextField();
		textField.setBounds(70, 111, 167, 40);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 197, 167, 46);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CEVAP1:");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(10, 111, 107, 40);
		
		JLabel lblNewLabel_4 = new JLabel("CEVAP2:");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(10, 203, 84, 40);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(248, 248, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(194, 281, 219, 55);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(textField);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("KAPAT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginEkrani login = new LoginEkrani();
				login.setVisible(true);
			}
		});
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(353, 11, 89, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("KONTROL");
		btnNewButton_4.setForeground(new Color(153, 50, 204));
		
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.setBounds(10, 281, 136, 65);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("Kullanici Adi:");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setBounds(10, 368, 84, 34);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		textField_2.setBounds(114, 368, 126, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Yeni şifre:");
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setBounds(10, 413, 84, 34);
		contentPane.add(lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setVisible(false);
		passwordField.setBounds(114, 413, 126, 34);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_8 = new JLabel("Yeni şifre tekrar:");
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setBounds(10, 461, 107, 34);
		contentPane.add(lblNewLabel_8);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setVisible(false);
		passwordField_1.setBounds(114, 461, 126, 34);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("KONTROL");
		
		btnNewButton.setVisible(false);
		btnNewButton.setForeground(new Color(153, 50, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(306, 368, 136, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("KAYDET");
		
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setForeground(new Color(153, 50, 204));
		btnNewButton_1.setBounds(306, 440, 136, 55);
		contentPane.add(btnNewButton_1);
		

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("dostoyevski") && textField_1.getText().equals("fhurky")) {
					  lblNewLabel_6.setVisible(true);
					  lblNewLabel_7.setVisible(true);
					  lblNewLabel_8.setVisible(true);
					  textField_2.setVisible(true);
					  passwordField.setVisible(true);
					  passwordField_1.setVisible(true);
					  btnNewButton.setVisible(true);
			    	  lblNewLabel_5.setText("Sorular Doğru !!!");
			    	  
			    	  
			      }
			      else {
			    	  lblNewLabel_5.setText("Sorulardan en az bir tanesi hatalı !!! :(");
			    	  lblNewLabel_6.setVisible(false);
					  lblNewLabel_7.setVisible(false);
					  lblNewLabel_8.setVisible(false);
					  textField_2.setVisible(false);
					  passwordField.setVisible(false);
					  passwordField_1.setVisible(false);
					  btnNewButton.setVisible(false);
			      }
			}
		});
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!passwordField.getText().equals("") && passwordField.getText().equals(passwordField_1.getText()) && textField_2.getText().equals(handler.getUsername()) ) { 
					btnNewButton_1.setVisible(true);
					lblNewLabel_5.setText("Bilgiler geçerli...");
				}
				else if(!passwordField.getText().equals("") && !passwordField.getText().equals(passwordField_1.getText()) && textField_2.getText().equals(handler.getUsername())){
					btnNewButton_1.setVisible(false);
					lblNewLabel_5.setText("Şifreler eşleşmedi...");
				}
				else if(!passwordField.getText().equals("") && passwordField.getText().equals(passwordField_1.getText()) && !textField_2.getText().equals(handler.getUsername())) {
					btnNewButton_1.setVisible(false);
					lblNewLabel_5.setText("Kullanıcı adı hatali...");
				}
				else {
					btnNewButton_1.setVisible(false);
					lblNewLabel_5.setText("Bilgiler geçersiz...");
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!passwordField.getText().equals("") && passwordField.getText().equals(passwordField_1.getText()) && textField_2.getText().equals(handler.getUsername()) ) { 
					handler.updatePassword(passwordField.getText());
					lblNewLabel_5.setText("Şifre değiştirildi...");				
				}
				else {
					lblNewLabel_5.setText("Hatali işlem...");
				}
			}
		});
		
		
	}
}
