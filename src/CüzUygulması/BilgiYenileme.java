package CüzUygulması;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class BilgiYenileme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BilgiYenileme frame = new BilgiYenileme();
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
	public BilgiYenileme() {
		
		UserFileHandler handler = new UserFileHandler("resources/login.txt");
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Güncellemek istediğiniz bilgiyi seçin");
		lblNewLabel.setBounds(10, 66, 369, 34);
		contentPane.add(lblNewLabel);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Kullanici Adi");
		
		
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton.setBounds(10, 107, 174, 44);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Şifre");
		
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_1.setBounds(193, 107, 186, 44);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Yeni Kullanici Adi:");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setBounds(10, 162, 122, 44);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setBounds(142, 167, 121, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Yeni Şifre:");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setBounds(10, 271, 122, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Yeni Şifre tekrar:");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setBounds(10, 316, 122, 28);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setVisible(false);
		passwordField.setBounds(142, 268, 121, 34);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setVisible(false);
		passwordField_1.setBounds(142, 313, 121, 34);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("KONTROL");
		
		btnNewButton.setVisible(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(273, 276, 106, 71);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(10, 376, 253, 59);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("KAYDET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     if(tglbtnNewToggleButton.isSelected() && !tglbtnNewToggleButton_1.isSelected()) {
			    	 if(textField.getText().equals(textField_1.getText())) {
			    		 handler.updateUsername(textField.getText());
			    		 lblNewLabel_2.setText("KA güncellendi...");
			    	 }
			    	 else {
			    		 lblNewLabel_2.setText("KA hatali...");
			    	 }
			     }
			     else if(!tglbtnNewToggleButton.isSelected() && tglbtnNewToggleButton_1.isSelected()) {
			    	 if(passwordField.getText().equals(passwordField_1)) {
			    		 handler.updatePassword(passwordField.getText());
			    		 lblNewLabel_2.setText("ŞŞifre güncellendi...");
			    	 }
			    	 else {
			    		 lblNewLabel_2.setText("Sifre hatali...");
			    	 }
			     }
			     else {
			    	 if(textField.getText().equals(textField_1.getText()) && passwordField.getText().equals(passwordField_1.getText()) ){
			    		 if(!passwordField.getText().equals("")) {
			    			 handler.updatePassword(passwordField.getText());
			    		 }
			    		 if(!textField.getText().equals("")) {
			    			 handler.updateUsername(textField.getText());
			    		 }			    		 
			    		 lblNewLabel_2.setText("Bilgiler Güncellendi...");
			    	 }
			    	 else {
			    		 lblNewLabel_2.setText("Bilgiler hatali...");
			    	 }
			     }
			}
		});
		
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(274, 358, 106, 77);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Yeni KA tekrar:");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setBounds(10, 212, 122, 34);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setVisible(false);
		textField_1.setBounds(142, 212, 121, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("KONTROL");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals("") && textField.getText().equals(textField_1.getText())) { // GİRİLİN İKİ KULLANICI ADI UYUŞUYORSA
					btnNewButton_1.setVisible(true);
					lblNewLabel_2.setText("Bilgiler uyuşuyor...");
				}
				else {
					btnNewButton_1.setVisible(false);
					lblNewLabel_2.setText("Bilgiler uyuşmadı...");
				}
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!passwordField.getText().equals("") && passwordField.getText().equals(passwordField_1.getText())) {  // GİRİLEN İKİ ŞİFRE UYUŞUYORSA
					btnNewButton_1.setVisible(true);
					lblNewLabel_2.setText("Bilgiler uyuşuyor...");
				}
				else {
					btnNewButton_1.setVisible(false);
					lblNewLabel_2.setText("Bilgiler uyuşmadı...");
				}
			}
		});
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(273, 180, 107, 71);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Bilgi Yenileme");
		lblNewLabel_6.setForeground(new Color(153, 50, 204));
		lblNewLabel_6.setBackground(new Color(248, 248, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(62, 11, 274, 44);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_3 = new JButton("Kapat");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3.setBounds(309, 11, 71, 44);
		contentPane.add(btnNewButton_3);
		
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton.isSelected()) {
					textField.setVisible(true);
					textField_1.setVisible(true);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_5.setVisible(true);
					btnNewButton_2.setVisible(true);
				}
				else {
					textField.setVisible(false);
					textField_1.setVisible(false);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_5.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_1.setVisible(false);
				}
			}
		});
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton_1.isSelected()) {
					passwordField.setVisible(true);
					passwordField_1.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
					btnNewButton.setVisible(true);
				}
				else {
					passwordField.setVisible(false);
					passwordField_1.setVisible(false);
					lblNewLabel_3.setVisible(false);
					lblNewLabel_4.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
				}
			}
		});
		
	}

}
