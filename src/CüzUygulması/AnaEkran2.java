package CüzUygulması;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AnaEkran2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaEkran2 frame = new AnaEkran2();
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
	public AnaEkran2() {
		setResizable(false);
		
		NumberFileProcessor verilenCuz = new NumberFileProcessor("resources/verilenCuzler.txt");
		NumberFileProcessor verilenCuzNext1 = new NumberFileProcessor("resources/verilenCuzlerNext1.txt");
		NumberFileProcessor verilenCuzNext2 = new NumberFileProcessor("resources/verilenCuzlerNext2.txt");
		NumberFileProcessor verilenCuzLast1 = new NumberFileProcessor("resources/verilenCuzlerLast1.txt");
		NumberFileProcessor verilenCuzLast2 = new NumberFileProcessor("resources/verilenCuzlerLast2.txt");
		
		List<Integer> numbers = verilenCuz.getNumbers();
		List<Integer> numbersNext1 = verilenCuzNext1.getNumbers();	
		List<Integer> numbersNext2 = verilenCuzNext2.getNumbers();
		List<Integer> numbersLast1 = verilenCuzLast1.getNumbers();
		List<Integer> numbersLast2 = verilenCuzLast2.getNumbers();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 140, 691, 505);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Current", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("NextWEEK1", null, panel_1, null);
		panel_1.setLayout(null);
				
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("NextWEEK2", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("LastWEEK1", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("LastWEEK2", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("EKLE\r\n");
		btnNewButton_9.setForeground(new Color(148, 0, 211));
		
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_9.setBounds(557, 31, 99, 415);
		panel_3.add(btnNewButton_9);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(10, 97, 158, 32);
		contentPane.add(lblNewLabel_1);
		

		

		JToggleButton tglbtnNewToggleButton = new JToggleButton("1");
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton.setBounds(40, 31, 74, 60);
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("2");
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_1.setBounds(145, 31, 74, 60);
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("3");
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_2.setBounds(250, 31, 74, 60);
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("4");
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_3.setBounds(355, 31, 74, 60);
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("5");
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_4.setBounds(460, 31, 74, 60);
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("6");
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_5.setBounds(40, 102, 74, 60);
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("7");
		tglbtnNewToggleButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_6.setBounds(145, 102, 74, 60);
		panel.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("8");
		tglbtnNewToggleButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_7.setBounds(250, 102, 74, 60);
		panel.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("9");
		tglbtnNewToggleButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_8.setBounds(355, 102, 74, 60);
		panel.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("10");
		tglbtnNewToggleButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_9.setBounds(460, 102, 74, 60);
		panel.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("11");
		tglbtnNewToggleButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_10.setBounds(40, 173, 74, 60);
		panel.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("12");
		tglbtnNewToggleButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_11.setBounds(145, 173, 74, 60);
		panel.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("13");
		tglbtnNewToggleButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_12.setBounds(250, 173, 74, 60);
		panel.add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("14");
		tglbtnNewToggleButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_13.setBounds(355, 173, 74, 60);
		panel.add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("15");
		tglbtnNewToggleButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_14.setBounds(460, 173, 74, 60);
		panel.add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("16");
		tglbtnNewToggleButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_15.setBounds(40, 244, 74, 60);
		panel.add(tglbtnNewToggleButton_15);
		
		JToggleButton tglbtnNewToggleButton_16 = new JToggleButton("17");
		tglbtnNewToggleButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_16.setBounds(145, 244, 74, 60);
		panel.add(tglbtnNewToggleButton_16);
		
		JToggleButton tglbtnNewToggleButton_17 = new JToggleButton("18");
		tglbtnNewToggleButton_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_17.setBounds(250, 244, 74, 60);
		panel.add(tglbtnNewToggleButton_17);
		
		JToggleButton tglbtnNewToggleButton_18 = new JToggleButton("19");
		tglbtnNewToggleButton_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_18.setBounds(355, 244, 74, 60);
		panel.add(tglbtnNewToggleButton_18);
		
		JToggleButton tglbtnNewToggleButton_19 = new JToggleButton("20");
		tglbtnNewToggleButton_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_19.setBounds(460, 244, 74, 60);
		panel.add(tglbtnNewToggleButton_19);
		
		JToggleButton tglbtnNewToggleButton_20 = new JToggleButton("21");
		tglbtnNewToggleButton_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_20.setBounds(40, 315, 74, 60);
		panel.add(tglbtnNewToggleButton_20);
		
		JToggleButton tglbtnNewToggleButton_21 = new JToggleButton("22");
		tglbtnNewToggleButton_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_21.setBounds(145, 315, 74, 60);
		panel.add(tglbtnNewToggleButton_21);
		
		JToggleButton tglbtnNewToggleButton_22 = new JToggleButton("23");
		tglbtnNewToggleButton_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_22.setBounds(250, 315, 74, 60);
		panel.add(tglbtnNewToggleButton_22);
		
		JToggleButton tglbtnNewToggleButton_23 = new JToggleButton("24");
		tglbtnNewToggleButton_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_23.setBounds(355, 315, 74, 60);
		panel.add(tglbtnNewToggleButton_23);
		
		JToggleButton tglbtnNewToggleButton_24 = new JToggleButton("25");
		tglbtnNewToggleButton_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_24.setBounds(460, 315, 74, 60);
		panel.add(tglbtnNewToggleButton_24);
		
		JToggleButton tglbtnNewToggleButton_25 = new JToggleButton("26");
		tglbtnNewToggleButton_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_25.setBounds(40, 386, 74, 60);
		panel.add(tglbtnNewToggleButton_25);
		
		JToggleButton tglbtnNewToggleButton_26 = new JToggleButton("27");
		tglbtnNewToggleButton_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_26.setBounds(145, 386, 74, 60);
		panel.add(tglbtnNewToggleButton_26);
		
		JToggleButton tglbtnNewToggleButton_27 = new JToggleButton("28");
		tglbtnNewToggleButton_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_27.setBounds(250, 386, 74, 60);
		panel.add(tglbtnNewToggleButton_27);
		
		JToggleButton tglbtnNewToggleButton_28 = new JToggleButton("29");
		tglbtnNewToggleButton_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_28.setBounds(355, 386, 74, 60);
		panel.add(tglbtnNewToggleButton_28);
		
		JToggleButton tglbtnNewToggleButton_29 = new JToggleButton("30");
		tglbtnNewToggleButton_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_29.setBounds(460, 386, 74, 60);
		panel.add(tglbtnNewToggleButton_29);
		
		JButton btnNewButton_1 = new JButton("EKLE");
		btnNewButton_1.setForeground(new Color(148, 0, 211));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Cüzler eklendi...");
				numbers.clear();
				
	            if(tglbtnNewToggleButton.isSelected()) {
	            	verilenCuz.addNumber(1);
	            }
	            if(tglbtnNewToggleButton_1.isSelected()){
	            	verilenCuz.addNumber(2);
	            }
	            if(tglbtnNewToggleButton_2.isSelected()){
	            	verilenCuz.addNumber(3);
	            }
	            if(tglbtnNewToggleButton_3.isSelected()){
	            	verilenCuz.addNumber(4);
	            }
	            if(tglbtnNewToggleButton_4.isSelected()){
	            	verilenCuz.addNumber(5);
	            }
	            if(tglbtnNewToggleButton_5.isSelected()){
	            	verilenCuz.addNumber(6);
	            }
	            if(tglbtnNewToggleButton_6.isSelected()){
	            	verilenCuz.addNumber(7);
	            }
	            if(tglbtnNewToggleButton_7.isSelected()){
	            	verilenCuz.addNumber(8);
	            }
	            if(tglbtnNewToggleButton_8.isSelected()){
	            	verilenCuz.addNumber(9);
	            }
	            if(tglbtnNewToggleButton_9.isSelected()){
	            	verilenCuz.addNumber(10);
	            }
	            if(tglbtnNewToggleButton_10.isSelected()){
	            	verilenCuz.addNumber(11);
	            }
	            if(tglbtnNewToggleButton_11.isSelected()){
	            	verilenCuz.addNumber(12);
	            }
	            if(tglbtnNewToggleButton_12.isSelected()){
	            	verilenCuz.addNumber(13);
	            }
	            if(tglbtnNewToggleButton_13.isSelected()){
	            	verilenCuz.addNumber(14);
	            }
	            if(tglbtnNewToggleButton_14.isSelected()){
	            	verilenCuz.addNumber(15);
	            }
	            if(tglbtnNewToggleButton_15.isSelected()){
	            	verilenCuz.addNumber(16);
	            }
	            if(tglbtnNewToggleButton_16.isSelected()){
	            	verilenCuz.addNumber(17);
	            }
	            if(tglbtnNewToggleButton_17.isSelected()){
	            	verilenCuz.addNumber(18);
	            }
	            if(tglbtnNewToggleButton_18.isSelected()){
	            	verilenCuz.addNumber(19);
	            }
	            if(tglbtnNewToggleButton_19.isSelected()){
	            	verilenCuz.addNumber(20);
	            }
	            if(tglbtnNewToggleButton_20.isSelected()){
	            	verilenCuz.addNumber(21);
	            }
	            if(tglbtnNewToggleButton_21.isSelected()){
	            	verilenCuz.addNumber(22);
	            }
	            if(tglbtnNewToggleButton_22.isSelected()){
	            	verilenCuz.addNumber(23);
	            }
	            if(tglbtnNewToggleButton_23.isSelected()){
	            	verilenCuz.addNumber(24);
	            }
	            if(tglbtnNewToggleButton_24.isSelected()){
	            	verilenCuz.addNumber(25);
	            }
	            if(tglbtnNewToggleButton_25.isSelected()){
	            	verilenCuz.addNumber(26);
	            }
	            if(tglbtnNewToggleButton_26.isSelected()){
	            	verilenCuz.addNumber(27);
	            }
	            if(tglbtnNewToggleButton_27.isSelected()){
	            	verilenCuz.addNumber(28);
	            }
	            if(tglbtnNewToggleButton_28.isSelected()){
	            	verilenCuz.addNumber(29);
	            }
	            if(tglbtnNewToggleButton_29.isSelected()) {
	            	verilenCuz.addNumber(30);
	            }
	            verilenCuz.clearFileContents();
	            verilenCuz.writeNumbersToFile();
			}
		});
		
		
		
		// NEXT WEEK 2
		
		JToggleButton tglbtnNewToggleButton_30 = new JToggleButton("1");
		tglbtnNewToggleButton_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30.setBounds(40, 31, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30);
		
		JToggleButton tglbtnNewToggleButton_30_2 = new JToggleButton("2");
		tglbtnNewToggleButton_30_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_2.setBounds(145, 31, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_2);
		
		JToggleButton tglbtnNewToggleButton_30_3 = new JToggleButton("3");
		tglbtnNewToggleButton_30_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_3.setBounds(250, 31, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_3);
		
		JToggleButton tglbtnNewToggleButton_30_4 = new JToggleButton("4");
		tglbtnNewToggleButton_30_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_4.setBounds(355, 31, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_4);
		
		JToggleButton tglbtnNewToggleButton_30_5 = new JToggleButton("5");
		tglbtnNewToggleButton_30_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_5.setBounds(460, 31, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_5);
		
		JToggleButton tglbtnNewToggleButton_30_6 = new JToggleButton("6");
		tglbtnNewToggleButton_30_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_6.setBounds(40, 102, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_6);
		
		JToggleButton tglbtnNewToggleButton_30_7 = new JToggleButton("7");
		tglbtnNewToggleButton_30_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_7.setBounds(145, 102, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_7);
		
		JToggleButton tglbtnNewToggleButton_30_8 = new JToggleButton("8");
		tglbtnNewToggleButton_30_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_8.setBounds(250, 102, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_8);
		
		JToggleButton tglbtnNewToggleButton_30_9 = new JToggleButton("9");
		tglbtnNewToggleButton_30_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_9.setBounds(355, 102, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_9);
		
		JToggleButton tglbtnNewToggleButton_30_10 = new JToggleButton("10");
		tglbtnNewToggleButton_30_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_10.setBounds(460, 102, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_10);
		
		JToggleButton tglbtnNewToggleButton_30_11 = new JToggleButton("11");
		tglbtnNewToggleButton_30_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_11.setBounds(40, 173, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_11);
		
		JToggleButton tglbtnNewToggleButton_30_12 = new JToggleButton("12");
		tglbtnNewToggleButton_30_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_12.setBounds(145, 173, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_12);
		
		JToggleButton tglbtnNewToggleButton_30_13 = new JToggleButton("13");
		tglbtnNewToggleButton_30_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_13.setBounds(250, 173, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_13);
		
		JToggleButton tglbtnNewToggleButton_30_14 = new JToggleButton("14");
		tglbtnNewToggleButton_30_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_14.setBounds(355, 173, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_14);
		
		JToggleButton tglbtnNewToggleButton_30_15 = new JToggleButton("15");
		tglbtnNewToggleButton_30_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_15.setBounds(460, 173, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_15);
		
		JToggleButton tglbtnNewToggleButton_30_16 = new JToggleButton("16");
		tglbtnNewToggleButton_30_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_16.setBounds(40, 244, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_16);
		
		JToggleButton tglbtnNewToggleButton_30_17 = new JToggleButton("17");
		tglbtnNewToggleButton_30_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_17.setBounds(145, 244, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_17);
		
		JToggleButton tglbtnNewToggleButton_30_18 = new JToggleButton("18");
		tglbtnNewToggleButton_30_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_18.setBounds(250, 244, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_18);
		
		JToggleButton tglbtnNewToggleButton_30_19 = new JToggleButton("19");
		tglbtnNewToggleButton_30_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_19.setBounds(355, 244, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_19);
		
		JToggleButton tglbtnNewToggleButton_30_20 = new JToggleButton("20");
		tglbtnNewToggleButton_30_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_20.setBounds(460, 244, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_20);
		
		JToggleButton tglbtnNewToggleButton_30_21 = new JToggleButton("21");
		tglbtnNewToggleButton_30_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_21.setBounds(40, 315, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_21);
		
		JToggleButton tglbtnNewToggleButton_30_22 = new JToggleButton("22");
		tglbtnNewToggleButton_30_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_22.setBounds(145, 315, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_22);
		
		JToggleButton tglbtnNewToggleButton_30_23 = new JToggleButton("23");
		tglbtnNewToggleButton_30_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_23.setBounds(250, 315, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_23);
		
		JToggleButton tglbtnNewToggleButton_30_24 = new JToggleButton("24");
		tglbtnNewToggleButton_30_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_24.setBounds(355, 315, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_24);
		
		JToggleButton tglbtnNewToggleButton_30_25 = new JToggleButton("25");
		tglbtnNewToggleButton_30_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_25.setBounds(460, 315, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_25);
		
		JToggleButton tglbtnNewToggleButton_30_26 = new JToggleButton("26");
		tglbtnNewToggleButton_30_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_26.setBounds(40, 386, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_26);
		
		JToggleButton tglbtnNewToggleButton_30_27 = new JToggleButton("27");
		tglbtnNewToggleButton_30_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_27.setBounds(145, 386, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_27);
		
		JToggleButton tglbtnNewToggleButton_30_28 = new JToggleButton("28");
		tglbtnNewToggleButton_30_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_28.setBounds(250, 386, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_28);
		
		JToggleButton tglbtnNewToggleButton_30_29 = new JToggleButton("29");
		tglbtnNewToggleButton_30_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_29.setBounds(355, 386, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_29);
		
		JToggleButton tglbtnNewToggleButton_30_30 = new JToggleButton("30");
		tglbtnNewToggleButton_30_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_30.setBounds(460, 386, 74, 60);
		panel_2.add(tglbtnNewToggleButton_30_30);
		
		JButton btnNewButton_6 = new JButton("EKLE");
		btnNewButton_6.setForeground(new Color(148, 0, 211));
		
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_6.setBounds(557, 31, 99, 415);
		panel_2.add(btnNewButton_6);
		
		
		verilenCuzNext2.readNumbersFromFile();
		
		for (int number : numbersNext2) {
            if(number == 1) {
            	tglbtnNewToggleButton_30.setSelected(true);
            }
            else if(number == 2){
            	tglbtnNewToggleButton_30_2.setSelected(true);
            }
            else if(number == 3){
            	tglbtnNewToggleButton_30_3.setSelected(true);
            }
            else if(number == 4){
            	tglbtnNewToggleButton_30_4.setSelected(true);
            }
            else if(number == 5){
            	tglbtnNewToggleButton_30_5.setSelected(true);
            }
            else if(number == 6){
            	tglbtnNewToggleButton_30_6.setSelected(true);
            }
            else if(number == 7){
            	tglbtnNewToggleButton_30_7.setSelected(true);
            }
            else if(number == 8){
            	tglbtnNewToggleButton_30_8.setSelected(true);
            }
            else if(number == 9){
            	tglbtnNewToggleButton_30_9.setSelected(true);
            }
            else if(number == 10){
            	tglbtnNewToggleButton_30_10.setSelected(true);
            }
            else if(number == 11){
            	tglbtnNewToggleButton_30_11.setSelected(true);
            }
            else if(number == 12){
            	tglbtnNewToggleButton_30_12.setSelected(true);
            }
            else if(number == 13){
            	tglbtnNewToggleButton_30_13.setSelected(true);
            }
            else if(number == 14){
            	tglbtnNewToggleButton_30_14.setSelected(true);
            }
            else if(number == 15){
            	tglbtnNewToggleButton_30_15.setSelected(true);
            }
            else if(number == 16){
            	tglbtnNewToggleButton_30_16.setSelected(true);
            }
            else if(number == 17){
            	tglbtnNewToggleButton_30_17.setSelected(true);
            }
            else if(number == 18){
            	tglbtnNewToggleButton_30_18.setSelected(true);
            }
            else if(number == 19){
            	tglbtnNewToggleButton_30_19.setSelected(true);
            }
            else if(number == 20){
            	tglbtnNewToggleButton_30_20.setSelected(true);
            }
            else if(number == 21){
            	tglbtnNewToggleButton_30_21.setSelected(true);
            }
            else if(number == 22){
            	tglbtnNewToggleButton_30_22.setSelected(true);
            }
            else if(number == 23){
            	tglbtnNewToggleButton_30_23.setSelected(true);
            }
            else if(number == 24){
            	tglbtnNewToggleButton_30_24.setSelected(true);
            }
            else if(number == 25){
            	tglbtnNewToggleButton_30_25.setSelected(true);
            }
            else if(number == 26){
            	tglbtnNewToggleButton_30_26.setSelected(true);
            }
            else if(number == 27){
            	tglbtnNewToggleButton_30_27.setSelected(true);
            }
            else if(number == 28){
            	tglbtnNewToggleButton_30_28.setSelected(true);
            }
            else if(number == 29){
            	tglbtnNewToggleButton_30_29.setSelected(true);
            }
            else if(number == 30) {
            	tglbtnNewToggleButton_30_30.setSelected(true);
            }          
        }
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Cüzler eklendi...");
                numbersNext2.clear();
				
	            if(tglbtnNewToggleButton_30.isSelected()) {
	            	verilenCuzNext2.addNumber(1);
	            }
	            if(tglbtnNewToggleButton_30_2.isSelected()){
	            	verilenCuzNext2.addNumber(2);
	            }
	            if(tglbtnNewToggleButton_30_3.isSelected()){
	            	verilenCuzNext2.addNumber(3);
	            }
	            if(tglbtnNewToggleButton_30_4.isSelected()){
	            	verilenCuzNext2.addNumber(4);
	            }
	            if(tglbtnNewToggleButton_30_5.isSelected()){
	            	verilenCuzNext2.addNumber(5);
	            }
	            if(tglbtnNewToggleButton_30_6.isSelected()){
	            	verilenCuzNext2.addNumber(6);
	            }
	            if(tglbtnNewToggleButton_30_7.isSelected()){
	            	verilenCuzNext2.addNumber(7);
	            }
	            if(tglbtnNewToggleButton_30_8.isSelected()){
	            	verilenCuzNext2.addNumber(8);
	            }
	            if(tglbtnNewToggleButton_30_9.isSelected()){
	            	verilenCuzNext2.addNumber(9);
	            }
	            if(tglbtnNewToggleButton_30_10.isSelected()){
	            	verilenCuzNext2.addNumber(10);
	            }
	            if(tglbtnNewToggleButton_30_11.isSelected()){
	            	verilenCuzNext2.addNumber(11);
	            }
	            if(tglbtnNewToggleButton_30_12.isSelected()){
	            	verilenCuzNext2.addNumber(12);
	            }
	            if(tglbtnNewToggleButton_30_13.isSelected()){
	            	verilenCuzNext2.addNumber(13);
	            }
	            if(tglbtnNewToggleButton_30_14.isSelected()){
	            	verilenCuzNext2.addNumber(14);
	            }
	            if(tglbtnNewToggleButton_30_15.isSelected()){
	            	verilenCuzNext2.addNumber(15);
	            }
	            if(tglbtnNewToggleButton_30_16.isSelected()){
	            	verilenCuzNext2.addNumber(16);
	            }
	            if(tglbtnNewToggleButton_30_17.isSelected()){
	            	verilenCuzNext2.addNumber(17);
	            }
	            if(tglbtnNewToggleButton_30_18.isSelected()){
	            	verilenCuzNext2.addNumber(18);
	            }
	            if(tglbtnNewToggleButton_30_19.isSelected()){
	            	verilenCuzNext2.addNumber(19);
	            }
	            if(tglbtnNewToggleButton_30_20.isSelected()){
	            	verilenCuzNext2.addNumber(20);
	            }
	            if(tglbtnNewToggleButton_30_21.isSelected()){
	            	verilenCuzNext2.addNumber(21);
	            }
	            if(tglbtnNewToggleButton_30_22.isSelected()){
	            	verilenCuzNext2.addNumber(22);
	            }
	            if(tglbtnNewToggleButton_30_23.isSelected()){
	            	verilenCuzNext2.addNumber(23);
	            }
	            if(tglbtnNewToggleButton_30_24.isSelected()){
	            	verilenCuzNext2.addNumber(24);
	            }
	            if(tglbtnNewToggleButton_30_25.isSelected()){
	            	verilenCuzNext2.addNumber(25);
	            }
	            if(tglbtnNewToggleButton_30_26.isSelected()){
	            	verilenCuzNext2.addNumber(26);
	            }
	            if(tglbtnNewToggleButton_30_27.isSelected()){
	            	verilenCuzNext2.addNumber(27);
	            }
	            if(tglbtnNewToggleButton_30_28.isSelected()){
	            	verilenCuzNext2.addNumber(28);
	            }
	            if(tglbtnNewToggleButton_30_29.isSelected()){
	            	verilenCuzNext2.addNumber(29);
	            }
	            if(tglbtnNewToggleButton_30_30.isSelected()) {
	            	verilenCuzNext2.addNumber(30);
	            }
	            verilenCuzNext2.clearFileContents();
	            verilenCuzNext2.writeNumbersToFile();
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		// LAST WEEK 1
		
		JToggleButton tglbtnNewToggleButton_31 = new JToggleButton("1");
		tglbtnNewToggleButton_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31.setBounds(40, 31, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31);
		
		JToggleButton tglbtnNewToggleButton_31_1 = new JToggleButton("2");
		tglbtnNewToggleButton_31_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_1.setBounds(145, 31, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_1);
		
		JToggleButton tglbtnNewToggleButton_31_2 = new JToggleButton("3");
		tglbtnNewToggleButton_31_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_2.setBounds(250, 31, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_2);
		
		JToggleButton tglbtnNewToggleButton_31_3 = new JToggleButton("4");
		tglbtnNewToggleButton_31_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_3.setBounds(355, 31, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_3);
		
		JToggleButton tglbtnNewToggleButton_31_4 = new JToggleButton("5");
		tglbtnNewToggleButton_31_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_4.setBounds(460, 31, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_4);
		
		JToggleButton tglbtnNewToggleButton_31_5 = new JToggleButton("6");
		tglbtnNewToggleButton_31_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_5.setBounds(40, 102, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_5);
		
		JToggleButton tglbtnNewToggleButton_31_6 = new JToggleButton("7");
		tglbtnNewToggleButton_31_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_6.setBounds(145, 102, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_6);
		
		JToggleButton tglbtnNewToggleButton_31_7 = new JToggleButton("8");
		tglbtnNewToggleButton_31_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_7.setBounds(250, 102, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_7);
		
		JToggleButton tglbtnNewToggleButton_31_8 = new JToggleButton("9");
		tglbtnNewToggleButton_31_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_8.setBounds(355, 102, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_8);
		
		JToggleButton tglbtnNewToggleButton_31_9 = new JToggleButton("10");
		tglbtnNewToggleButton_31_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_9.setBounds(460, 102, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_9);
		
		JToggleButton tglbtnNewToggleButton_31_10 = new JToggleButton("11");
		tglbtnNewToggleButton_31_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_10.setBounds(40, 173, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_10);
		
		JToggleButton tglbtnNewToggleButton_31_11 = new JToggleButton("12");
		tglbtnNewToggleButton_31_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_11.setBounds(145, 173, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_11);
		
		JToggleButton tglbtnNewToggleButton_31_12 = new JToggleButton("13");
		tglbtnNewToggleButton_31_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_12.setBounds(250, 173, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_12);
		
		JToggleButton tglbtnNewToggleButton_31_13 = new JToggleButton("14");
		tglbtnNewToggleButton_31_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_13.setBounds(355, 173, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_13);
		
		JToggleButton tglbtnNewToggleButton_31_14 = new JToggleButton("15");
		tglbtnNewToggleButton_31_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_14.setBounds(460, 173, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_14);
		
		JToggleButton tglbtnNewToggleButton_31_15 = new JToggleButton("16");
		tglbtnNewToggleButton_31_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_15.setBounds(40, 244, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_15);
		
		JToggleButton tglbtnNewToggleButton_31_16 = new JToggleButton("17");
		tglbtnNewToggleButton_31_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_16.setBounds(145, 244, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_16);
		
		JToggleButton tglbtnNewToggleButton_31_17 = new JToggleButton("18");
		tglbtnNewToggleButton_31_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_17.setBounds(250, 244, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_17);
		
		JToggleButton tglbtnNewToggleButton_31_18 = new JToggleButton("19");
		tglbtnNewToggleButton_31_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_18.setBounds(355, 244, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_18);
		
		JToggleButton tglbtnNewToggleButton_31_19 = new JToggleButton("20");
		tglbtnNewToggleButton_31_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_19.setBounds(460, 244, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_19);
		
		JToggleButton tglbtnNewToggleButton_31_20 = new JToggleButton("21");
		tglbtnNewToggleButton_31_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_20.setBounds(40, 315, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_20);
		
		JToggleButton tglbtnNewToggleButton_31_21 = new JToggleButton("22");
		tglbtnNewToggleButton_31_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_21.setBounds(145, 315, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_21);
		
		JToggleButton tglbtnNewToggleButton_31_22 = new JToggleButton("23");
		tglbtnNewToggleButton_31_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_22.setBounds(250, 315, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_22);
		
		JToggleButton tglbtnNewToggleButton_31_23 = new JToggleButton("24");
		tglbtnNewToggleButton_31_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_23.setBounds(355, 315, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_23);
		
		JToggleButton tglbtnNewToggleButton_31_24 = new JToggleButton("25");
		tglbtnNewToggleButton_31_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_24.setBounds(460, 315, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_24);
		
		JToggleButton tglbtnNewToggleButton_31_25 = new JToggleButton("26");
		tglbtnNewToggleButton_31_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_25.setBounds(40, 386, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_25);
		
		JToggleButton tglbtnNewToggleButton_31_26 = new JToggleButton("27");
		tglbtnNewToggleButton_31_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_26.setBounds(145, 386, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_26);
		
		JToggleButton tglbtnNewToggleButton_31_27 = new JToggleButton("28");
		tglbtnNewToggleButton_31_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_27.setBounds(250, 386, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_27);
		
		JToggleButton tglbtnNewToggleButton_31_28 = new JToggleButton("29");
		tglbtnNewToggleButton_31_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_28.setBounds(355, 386, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_28);
		
		JToggleButton tglbtnNewToggleButton_31_29 = new JToggleButton("30");
		tglbtnNewToggleButton_31_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31_29.setBounds(460, 386, 74, 60);
		panel_3.add(tglbtnNewToggleButton_31_29);
		
		verilenCuzLast1.readNumbersFromFile();		
		
		for (int number : numbersLast1) {
            if(number == 1) {
            	tglbtnNewToggleButton_31.setSelected(true);
            }
            else if(number == 2){
            	tglbtnNewToggleButton_31_1.setSelected(true);
            }
            else if(number == 3){
            	tglbtnNewToggleButton_31_2.setSelected(true);
            }
            else if(number == 4){
            	tglbtnNewToggleButton_31_3.setSelected(true);
            }
            else if(number == 5){
            	tglbtnNewToggleButton_31_4.setSelected(true);
            }
            else if(number == 6){
            	tglbtnNewToggleButton_31_5.setSelected(true);
            }
            else if(number == 7){
            	tglbtnNewToggleButton_31_6.setSelected(true);
            }
            else if(number == 8){
            	tglbtnNewToggleButton_31_7.setSelected(true);
            }
            else if(number == 9){
            	tglbtnNewToggleButton_31_8.setSelected(true);
            }
            else if(number == 10){
            	tglbtnNewToggleButton_31_9.setSelected(true);
            }
            else if(number == 11){
            	tglbtnNewToggleButton_31_10.setSelected(true);
            }
            else if(number == 12){
            	tglbtnNewToggleButton_31_11.setSelected(true);
            }
            else if(number == 13){
            	tglbtnNewToggleButton_31_12.setSelected(true);
            }
            else if(number == 14){
            	tglbtnNewToggleButton_31_13.setSelected(true);
            }
            else if(number == 15){
            	tglbtnNewToggleButton_31_14.setSelected(true);
            }
            else if(number == 16){
            	tglbtnNewToggleButton_31_15.setSelected(true);
            }
            else if(number == 17){
            	tglbtnNewToggleButton_31_16.setSelected(true);
            }
            else if(number == 18){
            	tglbtnNewToggleButton_31_17.setSelected(true);
            }
            else if(number == 19){
            	tglbtnNewToggleButton_31_18.setSelected(true);
            }
            else if(number == 20){
            	tglbtnNewToggleButton_31_19.setSelected(true);
            }
            else if(number == 21){
            	tglbtnNewToggleButton_31_20.setSelected(true);
            }
            else if(number == 22){
            	tglbtnNewToggleButton_31_21.setSelected(true);
            }
            else if(number == 23){
            	tglbtnNewToggleButton_31_22.setSelected(true);
            }
            else if(number == 24){
            	tglbtnNewToggleButton_31_23.setSelected(true);
            }
            else if(number == 25){
            	tglbtnNewToggleButton_31_24.setSelected(true);
            }
            else if(number == 26){
            	tglbtnNewToggleButton_31_25.setSelected(true);
            }
            else if(number == 27){
            	tglbtnNewToggleButton_31_26.setSelected(true);
            }
            else if(number == 28){
            	tglbtnNewToggleButton_31_27.setSelected(true);
            }
            else if(number == 29){
            	tglbtnNewToggleButton_31_28.setSelected(true);
            }
            else if(number == 30) {
            	tglbtnNewToggleButton_31_29.setSelected(true);
            }          
        }
		
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Cüzler eklendi...");
                numbersLast1.clear();
				
	            if(tglbtnNewToggleButton_31.isSelected()) {
	            	verilenCuzLast1.addNumber(1);
	            }
	            if(tglbtnNewToggleButton_31_1.isSelected()){
	            	verilenCuzLast1.addNumber(2);
	            }
	            if(tglbtnNewToggleButton_31_2.isSelected()){
	            	verilenCuzLast1.addNumber(3);
	            }
	            if(tglbtnNewToggleButton_31_3.isSelected()){
	            	verilenCuzLast1.addNumber(4);
	            }
	            if(tglbtnNewToggleButton_31_4.isSelected()){
	            	verilenCuzLast1.addNumber(5);
	            }
	            if(tglbtnNewToggleButton_31_5.isSelected()){
	            	verilenCuzLast1.addNumber(6);
	            }
	            if(tglbtnNewToggleButton_31_6.isSelected()){
	            	verilenCuzLast1.addNumber(7);
	            }
	            if(tglbtnNewToggleButton_31_7.isSelected()){
	            	verilenCuzLast1.addNumber(8);
	            }
	            if(tglbtnNewToggleButton_31_8.isSelected()){
	            	verilenCuzLast1.addNumber(9);
	            }
	            if(tglbtnNewToggleButton_31_9.isSelected()){
	            	verilenCuzLast1.addNumber(10);
	            }
	            if(tglbtnNewToggleButton_31_10.isSelected()){
	            	verilenCuzLast1.addNumber(11);
	            }
	            if(tglbtnNewToggleButton_31_11.isSelected()){
	            	verilenCuzLast1.addNumber(12);
	            }
	            if(tglbtnNewToggleButton_31_12.isSelected()){
	            	verilenCuzLast1.addNumber(13);
	            }
	            if(tglbtnNewToggleButton_31_13.isSelected()){
	            	verilenCuzLast1.addNumber(14);
	            }
	            if(tglbtnNewToggleButton_31_14.isSelected()){
	            	verilenCuzLast1.addNumber(15);
	            }
	            if(tglbtnNewToggleButton_31_15.isSelected()){
	            	verilenCuzLast1.addNumber(16);
	            }
	            if(tglbtnNewToggleButton_31_16.isSelected()){
	            	verilenCuzLast1.addNumber(17);
	            }
	            if(tglbtnNewToggleButton_31_17.isSelected()){
	            	verilenCuzLast1.addNumber(18);
	            }
	            if(tglbtnNewToggleButton_31_18.isSelected()){
	            	verilenCuzLast1.addNumber(19);
	            }
	            if(tglbtnNewToggleButton_31_19.isSelected()){
	            	verilenCuzLast1.addNumber(20);
	            }
	            if(tglbtnNewToggleButton_31_20.isSelected()){
	            	verilenCuzLast1.addNumber(21);
	            }
	            if(tglbtnNewToggleButton_31_21.isSelected()){
	            	verilenCuzLast1.addNumber(22);
	            }
	            if(tglbtnNewToggleButton_31_22.isSelected()){
	            	verilenCuzLast1.addNumber(23);
	            }
	            if(tglbtnNewToggleButton_31_23.isSelected()){
	            	verilenCuzLast1.addNumber(24);
	            }
	            if(tglbtnNewToggleButton_31_24.isSelected()){
	            	verilenCuzLast1.addNumber(25);
	            }
	            if(tglbtnNewToggleButton_31_25.isSelected()){
	            	verilenCuzLast1.addNumber(26);
	            }
	            if(tglbtnNewToggleButton_31_26.isSelected()){
	            	verilenCuzLast1.addNumber(27);
	            }
	            if(tglbtnNewToggleButton_31_27.isSelected()){
	            	verilenCuzLast1.addNumber(28);
	            }
	            if(tglbtnNewToggleButton_31_28.isSelected()){
	            	verilenCuzLast1.addNumber(29);
	            }
	            if(tglbtnNewToggleButton_31_29.isSelected()) {
	            	verilenCuzLast1.addNumber(30);
	            }
	            verilenCuzLast1.clearFileContents();
	            verilenCuzLast1.writeNumbersToFile();
			}
		});
		
		
		
		
		
		
		
		// LAST WEEK 2
		
		JToggleButton tglbtnNewToggleButton_32 = new JToggleButton("1");
		tglbtnNewToggleButton_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32.setBounds(40, 31, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32);
		
		JToggleButton tglbtnNewToggleButton_32_1 = new JToggleButton("2");
		tglbtnNewToggleButton_32_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_1.setBounds(145, 31, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_1);
		
		JToggleButton tglbtnNewToggleButton_32_2 = new JToggleButton("3");
		tglbtnNewToggleButton_32_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_2.setBounds(250, 31, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_2);
		
		JToggleButton tglbtnNewToggleButton_32_3 = new JToggleButton("4");
		tglbtnNewToggleButton_32_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_3.setBounds(355, 31, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_3);
		
		JToggleButton tglbtnNewToggleButton_32_4 = new JToggleButton("5");
		tglbtnNewToggleButton_32_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_4.setBounds(460, 31, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_4);
		
		JToggleButton tglbtnNewToggleButton_32_5 = new JToggleButton("6");
		tglbtnNewToggleButton_32_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_5.setBounds(40, 102, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_5);
		
		JToggleButton tglbtnNewToggleButton_32_6 = new JToggleButton("7");
		tglbtnNewToggleButton_32_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_6.setBounds(145, 102, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_6);
		
		JToggleButton tglbtnNewToggleButton_32_7 = new JToggleButton("8");
		tglbtnNewToggleButton_32_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_7.setBounds(250, 102, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_7);
		
		JToggleButton tglbtnNewToggleButton_32_8 = new JToggleButton("9");
		tglbtnNewToggleButton_32_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_8.setBounds(355, 102, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_8);
		
		JToggleButton tglbtnNewToggleButton_32_9 = new JToggleButton("10");
		tglbtnNewToggleButton_32_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_9.setBounds(460, 102, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_9);
		
		JToggleButton tglbtnNewToggleButton_32_10 = new JToggleButton("11");
		tglbtnNewToggleButton_32_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_10.setBounds(40, 173, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_10);
		
		JToggleButton tglbtnNewToggleButton_32_11 = new JToggleButton("12");
		tglbtnNewToggleButton_32_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_11.setBounds(145, 173, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_11);
		
		JToggleButton tglbtnNewToggleButton_32_12 = new JToggleButton("13");
		tglbtnNewToggleButton_32_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_12.setBounds(250, 173, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_12);
		
		JToggleButton tglbtnNewToggleButton_32_13 = new JToggleButton("14");
		tglbtnNewToggleButton_32_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_13.setBounds(355, 173, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_13);
		
		JToggleButton tglbtnNewToggleButton_32_14 = new JToggleButton("15");
		tglbtnNewToggleButton_32_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_14.setBounds(460, 173, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_14);
		
		JToggleButton tglbtnNewToggleButton_32_15 = new JToggleButton("16");
		tglbtnNewToggleButton_32_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_15.setBounds(40, 244, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_15);
		
		JToggleButton tglbtnNewToggleButton_32_16 = new JToggleButton("17");
		tglbtnNewToggleButton_32_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_16.setBounds(145, 244, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_16);
		
		JToggleButton tglbtnNewToggleButton_32_17 = new JToggleButton("18");
		tglbtnNewToggleButton_32_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_17.setBounds(250, 244, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_17);
		
		JToggleButton tglbtnNewToggleButton_32_18 = new JToggleButton("19");
		tglbtnNewToggleButton_32_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_18.setBounds(355, 244, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_18);
		
		JToggleButton tglbtnNewToggleButton_32_19 = new JToggleButton("20");
		tglbtnNewToggleButton_32_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_19.setBounds(460, 244, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_19);
		
		JToggleButton tglbtnNewToggleButton_32_20 = new JToggleButton("21");
		tglbtnNewToggleButton_32_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_20.setBounds(40, 315, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_20);
		
		JToggleButton tglbtnNewToggleButton_32_21 = new JToggleButton("22");
		tglbtnNewToggleButton_32_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_21.setBounds(145, 315, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_21);
		
		JToggleButton tglbtnNewToggleButton_32_22 = new JToggleButton("23");
		tglbtnNewToggleButton_32_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_22.setBounds(250, 315, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_22);
		
		JToggleButton tglbtnNewToggleButton_32_23 = new JToggleButton("24");
		tglbtnNewToggleButton_32_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_23.setBounds(355, 315, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_23);
		
		JToggleButton tglbtnNewToggleButton_32_24 = new JToggleButton("25");
		tglbtnNewToggleButton_32_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_24.setBounds(460, 315, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_24);
		
		JToggleButton tglbtnNewToggleButton_32_25 = new JToggleButton("26");
		tglbtnNewToggleButton_32_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_25.setBounds(40, 386, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_25);
		
		JToggleButton tglbtnNewToggleButton_32_26 = new JToggleButton("27");
		tglbtnNewToggleButton_32_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_26.setBounds(145, 386, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_26);
		
		JToggleButton tglbtnNewToggleButton_32_27 = new JToggleButton("28");
		tglbtnNewToggleButton_32_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_27.setBounds(250, 386, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_27);
		
		JToggleButton tglbtnNewToggleButton_32_28 = new JToggleButton("29");
		tglbtnNewToggleButton_32_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_28.setBounds(355, 386, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_28);
		
		JToggleButton tglbtnNewToggleButton_32_29 = new JToggleButton("30");
		tglbtnNewToggleButton_32_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32_29.setBounds(460, 386, 74, 60);
		panel_4.add(tglbtnNewToggleButton_32_29);
		
		JButton btnNewButton_11 = new JButton("EKLE");
		btnNewButton_11.setForeground(new Color(148, 0, 211));
		
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_11.setBounds(557, 31, 99, 415);
		panel_4.add(btnNewButton_11);
		
		verilenCuzLast2.readNumbersFromFile();
		
		for (int number : numbersLast2) {
            if(number == 1) {
            	tglbtnNewToggleButton_32.setSelected(true);
            }
            else if(number == 2){
            	tglbtnNewToggleButton_32_1.setSelected(true);
            }
            else if(number == 3){
            	tglbtnNewToggleButton_32_2.setSelected(true);
            }
            else if(number == 4){
            	tglbtnNewToggleButton_32_3.setSelected(true);
            }
            else if(number == 5){
            	tglbtnNewToggleButton_32_4.setSelected(true);
            }
            else if(number == 6){
            	tglbtnNewToggleButton_32_5.setSelected(true);
            }
            else if(number == 7){
            	tglbtnNewToggleButton_32_6.setSelected(true);
            }
            else if(number == 8){
            	tglbtnNewToggleButton_32_7.setSelected(true);
            }
            else if(number == 9){
            	tglbtnNewToggleButton_32_8.setSelected(true);
            }
            else if(number == 10){
            	tglbtnNewToggleButton_32_9.setSelected(true);
            }
            else if(number == 11){
            	tglbtnNewToggleButton_32_10.setSelected(true);
            }
            else if(number == 12){
            	tglbtnNewToggleButton_32_11.setSelected(true);
            }
            else if(number == 13){
            	tglbtnNewToggleButton_32_12.setSelected(true);
            }
            else if(number == 14){
            	tglbtnNewToggleButton_32_13.setSelected(true);
            }
            else if(number == 15){
            	tglbtnNewToggleButton_32_14.setSelected(true);
            }
            else if(number == 16){
            	tglbtnNewToggleButton_32_15.setSelected(true);
            }
            else if(number == 17){
            	tglbtnNewToggleButton_32_16.setSelected(true);
            }
            else if(number == 18){
            	tglbtnNewToggleButton_32_17.setSelected(true);
            }
            else if(number == 19){
            	tglbtnNewToggleButton_32_18.setSelected(true);
            }
            else if(number == 20){
            	tglbtnNewToggleButton_32_19.setSelected(true);
            }
            else if(number == 21){
            	tglbtnNewToggleButton_32_20.setSelected(true);
            }
            else if(number == 22){
            	tglbtnNewToggleButton_32_21.setSelected(true);
            }
            else if(number == 23){
            	tglbtnNewToggleButton_32_22.setSelected(true);
            }
            else if(number == 24){
            	tglbtnNewToggleButton_32_23.setSelected(true);
            }
            else if(number == 25){
            	tglbtnNewToggleButton_32_24.setSelected(true);
            }
            else if(number == 26){
            	tglbtnNewToggleButton_32_25.setSelected(true);
            }
            else if(number == 27){
            	tglbtnNewToggleButton_32_26.setSelected(true);
            }
            else if(number == 28){
            	tglbtnNewToggleButton_32_27.setSelected(true);
            }
            else if(number == 29){
            	tglbtnNewToggleButton_32_28.setSelected(true);
            }
            else if(number == 30) {
            	tglbtnNewToggleButton_32_29.setSelected(true);
            }          
        }
		
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Cüzler eklendi...");
                numbersLast2.clear();
				
	            if(tglbtnNewToggleButton_32.isSelected()) {
	            	verilenCuzLast2.addNumber(1);
	            }
	            if(tglbtnNewToggleButton_32_1.isSelected()){
	            	verilenCuzLast2.addNumber(2);
	            }
	            if(tglbtnNewToggleButton_32_2.isSelected()){
	            	verilenCuzLast2.addNumber(3);
	            }
	            if(tglbtnNewToggleButton_32_3.isSelected()){
	            	verilenCuzLast2.addNumber(4);
	            }
	            if(tglbtnNewToggleButton_32_4.isSelected()){
	            	verilenCuzLast2.addNumber(5);
	            }
	            if(tglbtnNewToggleButton_32_5.isSelected()){
	            	verilenCuzLast2.addNumber(6);
	            }
	            if(tglbtnNewToggleButton_32_6.isSelected()){
	            	verilenCuzLast2.addNumber(7);
	            }
	            if(tglbtnNewToggleButton_32_7.isSelected()){
	            	verilenCuzLast2.addNumber(8);
	            }
	            if(tglbtnNewToggleButton_32_8.isSelected()){
	            	verilenCuzLast2.addNumber(9);
	            }
	            if(tglbtnNewToggleButton_32_9.isSelected()){
	            	verilenCuzLast2.addNumber(10);
	            }
	            if(tglbtnNewToggleButton_32_10.isSelected()){
	            	verilenCuzLast2.addNumber(11);
	            }
	            if(tglbtnNewToggleButton_32_11.isSelected()){
	            	verilenCuzLast2.addNumber(12);
	            }
	            if(tglbtnNewToggleButton_32_12.isSelected()){
	            	verilenCuzLast2.addNumber(13);
	            }
	            if(tglbtnNewToggleButton_32_13.isSelected()){
	            	verilenCuzLast2.addNumber(14);
	            }
	            if(tglbtnNewToggleButton_32_14.isSelected()){
	            	verilenCuzLast2.addNumber(15);
	            }
	            if(tglbtnNewToggleButton_32_15.isSelected()){
	            	verilenCuzLast2.addNumber(16);
	            }
	            if(tglbtnNewToggleButton_32_16.isSelected()){
	            	verilenCuzLast2.addNumber(17);
	            }
	            if(tglbtnNewToggleButton_32_17.isSelected()){
	            	verilenCuzLast2.addNumber(18);
	            }
	            if(tglbtnNewToggleButton_32_18.isSelected()){
	            	verilenCuzLast2.addNumber(19);
	            }
	            if(tglbtnNewToggleButton_32_19.isSelected()){
	            	verilenCuzLast2.addNumber(20);
	            }
	            if(tglbtnNewToggleButton_32_20.isSelected()){
	            	verilenCuzLast2.addNumber(21);
	            }
	            if(tglbtnNewToggleButton_32_21.isSelected()){
	            	verilenCuzLast2.addNumber(22);
	            }
	            if(tglbtnNewToggleButton_32_22.isSelected()){
	            	verilenCuzLast2.addNumber(23);
	            }
	            if(tglbtnNewToggleButton_32_23.isSelected()){
	            	verilenCuzLast2.addNumber(24);
	            }
	            if(tglbtnNewToggleButton_32_24.isSelected()){
	            	verilenCuzLast2.addNumber(25);
	            }
	            if(tglbtnNewToggleButton_31_25.isSelected()){
	            	verilenCuzLast2.addNumber(26);
	            }
	            if(tglbtnNewToggleButton_32_26.isSelected()){
	            	verilenCuzLast2.addNumber(27);
	            }
	            if(tglbtnNewToggleButton_32_27.isSelected()){
	            	verilenCuzLast2.addNumber(28);
	            }
	            if(tglbtnNewToggleButton_32_28.isSelected()){
	            	verilenCuzLast2.addNumber(29);
	            }
	            if(tglbtnNewToggleButton_32_29.isSelected()) {
	            	verilenCuzLast2.addNumber(30);
	            }
	            verilenCuzLast2.clearFileContents();
	            verilenCuzLast2.writeNumbersToFile();
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(557, 31, 99, 415);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("EKLE");
		btnNewButton_5.setForeground(new Color(148, 0, 211));
		
		
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_5.setBounds(557, 31, 99, 415);
		panel_1.add(btnNewButton_5);
		

		
		
		

		
		verilenCuz.readNumbersFromFile();	
		
		for (int number : numbers) {
            if(number == 1) {
            	tglbtnNewToggleButton.setSelected(true);
            }
            else if(number == 2){
            	tglbtnNewToggleButton_1.setSelected(true);
            }
            else if(number == 3){
            	tglbtnNewToggleButton_2.setSelected(true);
            }
            else if(number == 4){
            	tglbtnNewToggleButton_3.setSelected(true);
            }
            else if(number == 5){
            	tglbtnNewToggleButton_4.setSelected(true);
            }
            else if(number == 6){
            	tglbtnNewToggleButton_5.setSelected(true);
            }
            else if(number == 7){
            	tglbtnNewToggleButton_6.setSelected(true);
            }
            else if(number == 8){
            	tglbtnNewToggleButton_7.setSelected(true);
            }
            else if(number == 9){
            	tglbtnNewToggleButton_8.setSelected(true);
            }
            else if(number == 10){
            	tglbtnNewToggleButton_9.setSelected(true);
            }
            else if(number == 11){
            	tglbtnNewToggleButton_10.setSelected(true);
            }
            else if(number == 12){
            	tglbtnNewToggleButton_11.setSelected(true);
            }
            else if(number == 13){
            	tglbtnNewToggleButton_12.setSelected(true);
            }
            else if(number == 14){
            	tglbtnNewToggleButton_13.setSelected(true);
            }
            else if(number == 15){
            	tglbtnNewToggleButton_14.setSelected(true);
            }
            else if(number == 16){
            	tglbtnNewToggleButton_15.setSelected(true);
            }
            else if(number == 17){
            	tglbtnNewToggleButton_16.setSelected(true);
            }
            else if(number == 18){
            	tglbtnNewToggleButton_17.setSelected(true);
            }
            else if(number == 19){
            	tglbtnNewToggleButton_18.setSelected(true);
            }
            else if(number == 20){
            	tglbtnNewToggleButton_19.setSelected(true);
            }
            else if(number == 21){
            	tglbtnNewToggleButton_20.setSelected(true);
            }
            else if(number == 22){
            	tglbtnNewToggleButton_21.setSelected(true);
            }
            else if(number == 23){
            	tglbtnNewToggleButton_22.setSelected(true);
            }
            else if(number == 24){
            	tglbtnNewToggleButton_23.setSelected(true);
            }
            else if(number == 25){
            	tglbtnNewToggleButton_24.setSelected(true);
            }
            else if(number == 26){
            	tglbtnNewToggleButton_25.setSelected(true);
            }
            else if(number == 27){
            	tglbtnNewToggleButton_26.setSelected(true);
            }
            else if(number == 28){
            	tglbtnNewToggleButton_27.setSelected(true);
            }
            else if(number == 29){
            	tglbtnNewToggleButton_28.setSelected(true);
            }
            else if(number == 30) {
            	tglbtnNewToggleButton_29.setSelected(true);
            }
            
        }
		
		// NEXT WEEK 1------------------------------------------------------------------------------------
		
		JToggleButton tglbtnNewToggleButton_30_1 = new JToggleButton("1");
		tglbtnNewToggleButton_30_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1.setBounds(40, 31, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1);
		
		JToggleButton tglbtnNewToggleButton_30_1_0 = new JToggleButton("2");
		tglbtnNewToggleButton_30_1_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_0.setBounds(145, 31, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_0);
		
		JToggleButton tglbtnNewToggleButton_30_1_1 = new JToggleButton("3");
		tglbtnNewToggleButton_30_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_1.setBounds(250, 31, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_1);
		
		JToggleButton tglbtnNewToggleButton_30_1_2 = new JToggleButton("4");
		tglbtnNewToggleButton_30_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_2.setBounds(355, 31, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_2);
		
		JToggleButton tglbtnNewToggleButton_30_1_3 = new JToggleButton("5");
		tglbtnNewToggleButton_30_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_3.setBounds(460, 31, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_3);
		
		JToggleButton tglbtnNewToggleButton_30_1_4 = new JToggleButton("6");
		tglbtnNewToggleButton_30_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_4.setBounds(40, 102, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_4);
		
		JToggleButton tglbtnNewToggleButton_30_1_5 = new JToggleButton("7");
		tglbtnNewToggleButton_30_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_5.setBounds(145, 102, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_5);
		
		JToggleButton tglbtnNewToggleButton_30_1_6 = new JToggleButton("8");
		tglbtnNewToggleButton_30_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_6.setBounds(250, 102, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_6);
		
		JToggleButton tglbtnNewToggleButton_30_1_7 = new JToggleButton("9");
		tglbtnNewToggleButton_30_1_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_7.setBounds(355, 102, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_7);
		
		JToggleButton tglbtnNewToggleButton_30_1_8 = new JToggleButton("10");
		tglbtnNewToggleButton_30_1_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_8.setBounds(460, 102, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_8);
		
		JToggleButton tglbtnNewToggleButton_30_1_9 = new JToggleButton("11");
		tglbtnNewToggleButton_30_1_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_9.setBounds(40, 173, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_9);
		
		JToggleButton tglbtnNewToggleButton_30_1_10 = new JToggleButton("12");
		tglbtnNewToggleButton_30_1_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_10.setBounds(145, 173, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_10);
		
		JToggleButton tglbtnNewToggleButton_30_1_11 = new JToggleButton("13");
		tglbtnNewToggleButton_30_1_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_11.setBounds(250, 173, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_11);
		
		JToggleButton tglbtnNewToggleButton_30_1_12 = new JToggleButton("14");
		tglbtnNewToggleButton_30_1_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_12.setBounds(355, 173, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_12);
		
		JToggleButton tglbtnNewToggleButton_30_1_13 = new JToggleButton("15");
		tglbtnNewToggleButton_30_1_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_13.setBounds(460, 173, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_13);
		
		JToggleButton tglbtnNewToggleButton_30_1_14 = new JToggleButton("16");
		tglbtnNewToggleButton_30_1_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_14.setBounds(40, 244, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_14);
		
		JToggleButton tglbtnNewToggleButton_30_1_15 = new JToggleButton("17");
		tglbtnNewToggleButton_30_1_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_15.setBounds(145, 244, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_15);
		
		JToggleButton tglbtnNewToggleButton_30_1_16 = new JToggleButton("18");
		tglbtnNewToggleButton_30_1_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_16.setBounds(250, 244, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_16);
		
		JToggleButton tglbtnNewToggleButton_30_1_17 = new JToggleButton("19");
		tglbtnNewToggleButton_30_1_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_17.setBounds(355, 244, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_17);
		
		JToggleButton tglbtnNewToggleButton_30_1_18 = new JToggleButton("20");
		tglbtnNewToggleButton_30_1_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_18.setBounds(460, 244, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_18);
		
		JToggleButton tglbtnNewToggleButton_30_1_19 = new JToggleButton("21");
		tglbtnNewToggleButton_30_1_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_19.setBounds(40, 315, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_19);
		
		JToggleButton tglbtnNewToggleButton_30_1_20 = new JToggleButton("22");
		tglbtnNewToggleButton_30_1_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_20.setBounds(145, 315, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_20);
		
		JToggleButton tglbtnNewToggleButton_30_1_21 = new JToggleButton("23");
		tglbtnNewToggleButton_30_1_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_21.setBounds(250, 315, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_21);
		
		JToggleButton tglbtnNewToggleButton_30_1_22 = new JToggleButton("24");
		tglbtnNewToggleButton_30_1_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_22.setBounds(355, 315, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_22);
		
		JToggleButton tglbtnNewToggleButton_30_1_23 = new JToggleButton("25");
		tglbtnNewToggleButton_30_1_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_23.setBounds(460, 315, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_23);
		
		JToggleButton tglbtnNewToggleButton_30_1_24 = new JToggleButton("26");
		tglbtnNewToggleButton_30_1_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_24.setBounds(40, 386, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_24);
		
		JToggleButton tglbtnNewToggleButton_30_1_25 = new JToggleButton("27");
		tglbtnNewToggleButton_30_1_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_25.setBounds(145, 386, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_25);
		
		JToggleButton tglbtnNewToggleButton_30_1_26 = new JToggleButton("28");
		tglbtnNewToggleButton_30_1_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_26.setBounds(250, 386, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_26);
		
		JToggleButton tglbtnNewToggleButton_30_1_27 = new JToggleButton("29");
		tglbtnNewToggleButton_30_1_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_27.setBounds(355, 386, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_27);
		
		JToggleButton tglbtnNewToggleButton_30_1_28 = new JToggleButton("30");
		tglbtnNewToggleButton_30_1_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30_1_28.setBounds(460, 386, 74, 60);
		panel_1.add(tglbtnNewToggleButton_30_1_28);
		

		verilenCuzNext1.readNumbersFromFile();	

		
		for (int number : numbersNext1) {
            if(number == 1) {
            	tglbtnNewToggleButton_30_1.setSelected(true);
            }
            else if(number == 2){
            	tglbtnNewToggleButton_30_1_0.setSelected(true);
            }
            else if(number == 3){
            	tglbtnNewToggleButton_30_1_1.setSelected(true);
            }
            else if(number == 4){
            	tglbtnNewToggleButton_30_1_2.setSelected(true);
            }
            else if(number == 5){
            	tglbtnNewToggleButton_30_1_3.setSelected(true);
            }
            else if(number == 6){
            	tglbtnNewToggleButton_30_1_4.setSelected(true);
            }
            else if(number == 7){
            	tglbtnNewToggleButton_30_1_5.setSelected(true);
            }
            else if(number == 8){
            	tglbtnNewToggleButton_30_1_6.setSelected(true);
            }
            else if(number == 9){
            	tglbtnNewToggleButton_30_1_7.setSelected(true);
            }
            else if(number == 10){
            	tglbtnNewToggleButton_30_1_8.setSelected(true);
            }
            else if(number == 11){
            	tglbtnNewToggleButton_30_1_9.setSelected(true);
            }
            else if(number == 12){
            	tglbtnNewToggleButton_30_1_10.setSelected(true);
            }
            else if(number == 13){
            	tglbtnNewToggleButton_30_1_11.setSelected(true);
            }
            else if(number == 14){
            	tglbtnNewToggleButton_30_1_12.setSelected(true);
            }
            else if(number == 15){
            	tglbtnNewToggleButton_30_1_13.setSelected(true);
            }
            else if(number == 16){
            	tglbtnNewToggleButton_30_1_14.setSelected(true);
            }
            else if(number == 17){
            	tglbtnNewToggleButton_30_1_15.setSelected(true);
            }
            else if(number == 18){
            	tglbtnNewToggleButton_30_1_16.setSelected(true);
            }
            else if(number == 19){
            	tglbtnNewToggleButton_30_1_17.setSelected(true);
            }
            else if(number == 20){
            	tglbtnNewToggleButton_30_1_18.setSelected(true);
            }
            else if(number == 21){
            	tglbtnNewToggleButton_30_1_19.setSelected(true);
            }
            else if(number == 22){
            	tglbtnNewToggleButton_30_1_20.setSelected(true);
            }
            else if(number == 23){
            	tglbtnNewToggleButton_30_1_21.setSelected(true);
            }
            else if(number == 24){
            	tglbtnNewToggleButton_30_1_22.setSelected(true);
            }
            else if(number == 25){
            	tglbtnNewToggleButton_30_1_23.setSelected(true);
            }
            else if(number == 26){
            	tglbtnNewToggleButton_30_1_24.setSelected(true);
            }
            else if(number == 27){
            	tglbtnNewToggleButton_30_1_25.setSelected(true);
            }
            else if(number == 28){
            	tglbtnNewToggleButton_30_1_26.setSelected(true);
            }
            else if(number == 29){
            	tglbtnNewToggleButton_30_1_27.setSelected(true);
            }
            else if(number == 30) {
            	tglbtnNewToggleButton_30_1_28.setSelected(true);
            }
            
        }
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Cüzler eklendi...");
                numbersNext1.clear();                
				
	            if(tglbtnNewToggleButton_30_1.isSelected()) {
	            	verilenCuzNext1.addNumber(1);
	            }
	            if(tglbtnNewToggleButton_30_1_0.isSelected()){
	            	verilenCuzNext1.addNumber(2);
	            }
	            if(tglbtnNewToggleButton_30_1_1.isSelected()){
	            	verilenCuzNext1.addNumber(3);
	            }
	            if(tglbtnNewToggleButton_30_1_2.isSelected()){
	            	verilenCuzNext1.addNumber(4);
	            }
	            if(tglbtnNewToggleButton_30_1_3.isSelected()){
	            	verilenCuzNext1.addNumber(5);
	            }
	            if(tglbtnNewToggleButton_30_1_4.isSelected()){
	            	verilenCuzNext1.addNumber(6);
	            }
	            if(tglbtnNewToggleButton_30_1_5.isSelected()){
	            	verilenCuzNext1.addNumber(7);
	            }
	            if(tglbtnNewToggleButton_30_1_6.isSelected()){
	            	verilenCuzNext1.addNumber(8);
	            }
	            if(tglbtnNewToggleButton_30_1_7.isSelected()){
	            	verilenCuzNext1.addNumber(9);
	            }
	            if(tglbtnNewToggleButton_30_1_8.isSelected()){
	            	verilenCuzNext1.addNumber(10);
	            }
	            if(tglbtnNewToggleButton_30_1_9.isSelected()){
	            	verilenCuzNext1.addNumber(11);
	            }
	            if(tglbtnNewToggleButton_30_1_10.isSelected()){
	            	verilenCuzNext1.addNumber(12);
	            }
	            if(tglbtnNewToggleButton_30_1_11.isSelected()){
	            	verilenCuzNext1.addNumber(13);
	            }
	            if(tglbtnNewToggleButton_30_1_12.isSelected()){
	            	verilenCuzNext1.addNumber(14);
	            }
	            if(tglbtnNewToggleButton_30_1_13.isSelected()){
	            	verilenCuzNext1.addNumber(15);
	            }
	            if(tglbtnNewToggleButton_30_1_14.isSelected()){
	            	verilenCuzNext1.addNumber(16);
	            }
	            if(tglbtnNewToggleButton_30_1_15.isSelected()){
	            	verilenCuzNext1.addNumber(17);
	            }
	            if(tglbtnNewToggleButton_30_1_16.isSelected()){
	            	verilenCuzNext1.addNumber(18);
	            }
	            if(tglbtnNewToggleButton_30_1_17.isSelected()){
	            	verilenCuzNext1.addNumber(19);
	            }
	            if(tglbtnNewToggleButton_30_1_18.isSelected()){
	            	verilenCuzNext1.addNumber(20);
	            }
	            if(tglbtnNewToggleButton_30_1_19.isSelected()){
	            	verilenCuzNext1.addNumber(21);
	            }
	            if(tglbtnNewToggleButton_30_1_20.isSelected()){
	            	verilenCuzNext1.addNumber(22);
	            }
	            if(tglbtnNewToggleButton_30_1_21.isSelected()){
	            	verilenCuzNext1.addNumber(23);
	            }
	            if(tglbtnNewToggleButton_30_1_22.isSelected()){
	            	verilenCuzNext1.addNumber(24);
	            }
	            if(tglbtnNewToggleButton_30_1_23.isSelected()){
	            	verilenCuzNext1.addNumber(25);
	            }
	            if(tglbtnNewToggleButton_30_1_24.isSelected()){
	            	verilenCuzNext1.addNumber(26);
	            }
	            if(tglbtnNewToggleButton_30_1_25.isSelected()){
	            	verilenCuzNext1.addNumber(27);
	            }
	            if(tglbtnNewToggleButton_30_1_26.isSelected()){
	            	verilenCuzNext1.addNumber(28);
	            }
	            if(tglbtnNewToggleButton_30_1_27.isSelected()){
	            	verilenCuzNext1.addNumber(29);
	            }
	            if(tglbtnNewToggleButton_30_1_28.isSelected()) {
	            	verilenCuzNext1.addNumber(30);
	            }
	            verilenCuzNext1.clearFileContents();
	            verilenCuzNext1.writeNumbersToFile();
				
			}
		});
				
		
		JLabel lblNewLabel = new JLabel("Cüz Uygulaması");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 25, 508, 82);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(583, 10, 118, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Settings");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BilgiYenileme settings = new BilgiYenileme();
				settings.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(583, 60, 113, 39);
		contentPane.add(btnNewButton_3);
		

		
		JButton btnNewButton_12 = new JButton("WEEK");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DosyaKopyalama kopya0 = new DosyaKopyalama("resources/verilenCuzlerLast1.txt","resources/verilenCuzlerLast2.txt");
				kopya0.kopyala();
				DosyaKopyalama kopya1 = new DosyaKopyalama("resources/verilenCuzler.txt","resources/verilenCuzlerLast1.txt");
				kopya1.kopyala();
				DosyaKopyalama kopya2 = new DosyaKopyalama("resources/verilenCuzlerNext1.txt","resources/verilenCuzler.txt");
				kopya2.kopyala();
				DosyaKopyalama kopya3 = new DosyaKopyalama("resources/verilenCuzlerNext2.txt","resources/verilenCuzlerNext1.txt");
				kopya3.kopyala();
				kopya3.sil("resources/verilenCuzlerNext2.txt");
				lblNewLabel_1.setText("Hafta ileri alındı...");
				
				
			}
		});
		
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBounds(10, 11, 118, 39);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton = new JButton("REFRESH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AnaEkran2 refresh = new AnaEkran2();
				refresh.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 60, 118, 32);
		contentPane.add(btnNewButton);
		
		
	}
}
