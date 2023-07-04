package CüzUygulması;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JProgressBar;

public class anaEkran extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anaEkran frame = new anaEkran();
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
	public anaEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 497, 361);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("ThisWeek", null, panel, null);
		panel.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton_0 = new JToggleButton("1");
		tglbtnNewToggleButton_0.setForeground(Color.BLACK);
		tglbtnNewToggleButton_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_0.setBounds(10, 11, 70, 52);
		panel.add(tglbtnNewToggleButton_0);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("2");
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_1.setBounds(90, 11, 70, 52);
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("3");
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_2.setBounds(170, 11, 70, 52);
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("4");
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_3.setBounds(250, 11, 70, 52);
		panel.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("5");
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_4.setBounds(330, 11, 70, 52);
		panel.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("6");
		tglbtnNewToggleButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_5.setBounds(410, 11, 70, 52);
		panel.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("7");
		tglbtnNewToggleButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_6.setBounds(10, 74, 70, 52);
		panel.add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("8");
		tglbtnNewToggleButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_7.setBounds(90, 74, 70, 52);
		panel.add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("9");
		tglbtnNewToggleButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_8.setBounds(170, 74, 70, 52);
		panel.add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("10");
		tglbtnNewToggleButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_9.setBounds(250, 74, 70, 52);
		panel.add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("11");
		tglbtnNewToggleButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_10.setBounds(330, 74, 70, 52);
		panel.add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("12");
		tglbtnNewToggleButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_11.setBounds(410, 74, 70, 52);
		panel.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("13");
		tglbtnNewToggleButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_12.setBounds(10, 137, 70, 52);
		panel.add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("14");
		tglbtnNewToggleButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_13.setBounds(90, 137, 70, 52);
		panel.add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("15");
		tglbtnNewToggleButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_14.setBounds(170, 137, 70, 52);
		panel.add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("16");
		tglbtnNewToggleButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_15.setBounds(250, 137, 70, 52);
		panel.add(tglbtnNewToggleButton_15);
		
		JToggleButton tglbtnNewToggleButton_16 = new JToggleButton("17");
		tglbtnNewToggleButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_16.setBounds(330, 137, 70, 52);
		panel.add(tglbtnNewToggleButton_16);
		
		JToggleButton tglbtnNewToggleButton_17 = new JToggleButton("18");
		tglbtnNewToggleButton_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_17.setBounds(410, 137, 70, 52);
		panel.add(tglbtnNewToggleButton_17);
		
		JToggleButton tglbtnNewToggleButton_18 = new JToggleButton("19");
		tglbtnNewToggleButton_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_18.setBounds(10, 200, 70, 52);
		panel.add(tglbtnNewToggleButton_18);
		
		JToggleButton tglbtnNewToggleButton_19 = new JToggleButton("20");
		tglbtnNewToggleButton_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_19.setBounds(90, 200, 70, 52);
		panel.add(tglbtnNewToggleButton_19);
		
		JToggleButton tglbtnNewToggleButton_20 = new JToggleButton("21");
		tglbtnNewToggleButton_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_20.setBounds(170, 200, 70, 52);
		panel.add(tglbtnNewToggleButton_20);
		
		JToggleButton tglbtnNewToggleButton_21 = new JToggleButton("22");
		tglbtnNewToggleButton_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_21.setBounds(250, 200, 70, 52);
		panel.add(tglbtnNewToggleButton_21);
		
		JToggleButton tglbtnNewToggleButton_22 = new JToggleButton("23");
		tglbtnNewToggleButton_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_22.setBounds(330, 200, 70, 52);
		panel.add(tglbtnNewToggleButton_22);
		
		JToggleButton tglbtnNewToggleButton_23 = new JToggleButton("24");
		tglbtnNewToggleButton_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_23.setBounds(410, 200, 70, 52);
		panel.add(tglbtnNewToggleButton_23);
		
		JToggleButton tglbtnNewToggleButton_24 = new JToggleButton("25");
		tglbtnNewToggleButton_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_24.setBounds(10, 263, 70, 52);
		panel.add(tglbtnNewToggleButton_24);
		
		JToggleButton tglbtnNewToggleButton_25 = new JToggleButton("26");
		tglbtnNewToggleButton_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_25.setBounds(90, 263, 70, 52);
		panel.add(tglbtnNewToggleButton_25);
		
		JToggleButton tglbtnNewToggleButton_26 = new JToggleButton("27");
		tglbtnNewToggleButton_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_26.setBounds(170, 263, 70, 52);
		panel.add(tglbtnNewToggleButton_26);
		
		JToggleButton tglbtnNewToggleButton_27 = new JToggleButton("28");
		tglbtnNewToggleButton_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_27.setBounds(250, 263, 70, 52);
		panel.add(tglbtnNewToggleButton_27);
		
		JToggleButton tglbtnNewToggleButton_28 = new JToggleButton("29");
		tglbtnNewToggleButton_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_28.setBounds(330, 263, 70, 52);
		panel.add(tglbtnNewToggleButton_28);
		
		JToggleButton tglbtnNewToggleButton_29 = new JToggleButton("30");
		tglbtnNewToggleButton_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_29.setBounds(410, 263, 70, 52);
		panel.add(tglbtnNewToggleButton_29);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("LastWeek", null, panel_2, null);
		panel_2.setLayout(null);
		

		
		JToggleButton tglbtnNewToggleButton_30 = new JToggleButton("1");
		tglbtnNewToggleButton_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_30.setBounds(10, 11, 70, 52);
		panel_2.add(tglbtnNewToggleButton_30);
		
		JToggleButton tglbtnNewToggleButton_31 = new JToggleButton("2");
		tglbtnNewToggleButton_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_31.setBounds(90, 11, 70, 52);
		panel_2.add(tglbtnNewToggleButton_31);
		
		JToggleButton tglbtnNewToggleButton_32 = new JToggleButton("3");
		tglbtnNewToggleButton_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_32.setBounds(170, 11, 70, 52);
		panel_2.add(tglbtnNewToggleButton_32);
		
		JToggleButton tglbtnNewToggleButton_33 = new JToggleButton("4");
		tglbtnNewToggleButton_33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_33.setBounds(250, 11, 70, 52);
		panel_2.add(tglbtnNewToggleButton_33);
		
		JToggleButton tglbtnNewToggleButton_34 = new JToggleButton("5");
		tglbtnNewToggleButton_34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_34.setBounds(330, 11, 70, 52);
		panel_2.add(tglbtnNewToggleButton_34);
		
		JToggleButton tglbtnNewToggleButton_35 = new JToggleButton("6");
		tglbtnNewToggleButton_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_35.setBounds(410, 11, 70, 52);
		panel_2.add(tglbtnNewToggleButton_35);
		
		JToggleButton tglbtnNewToggleButton_36 = new JToggleButton("7");
		tglbtnNewToggleButton_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_36.setBounds(10, 74, 70, 52);
		panel_2.add(tglbtnNewToggleButton_36);
		
		JToggleButton tglbtnNewToggleButton_37 = new JToggleButton("8");
		tglbtnNewToggleButton_37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_37.setBounds(90, 74, 70, 52);
		panel_2.add(tglbtnNewToggleButton_37);
		
		JToggleButton tglbtnNewToggleButton_38 = new JToggleButton("9");
		tglbtnNewToggleButton_38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_38.setBounds(170, 74, 70, 52);
		panel_2.add(tglbtnNewToggleButton_38);
		
		JToggleButton tglbtnNewToggleButton_39 = new JToggleButton("10");
		tglbtnNewToggleButton_39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_39.setBounds(250, 74, 70, 52);
		panel_2.add(tglbtnNewToggleButton_39);
		
		JToggleButton tglbtnNewToggleButton_40 = new JToggleButton("11");
		tglbtnNewToggleButton_40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_40.setBounds(330, 74, 70, 52);
		panel_2.add(tglbtnNewToggleButton_40);
		
		JToggleButton tglbtnNewToggleButton_41 = new JToggleButton("12");
		tglbtnNewToggleButton_41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_41.setBounds(410, 74, 70, 52);
		panel_2.add(tglbtnNewToggleButton_41);
		
		JToggleButton tglbtnNewToggleButton_42 = new JToggleButton("13");
		tglbtnNewToggleButton_42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_42.setBounds(10, 137, 70, 52);
		panel_2.add(tglbtnNewToggleButton_42);
		
		JToggleButton tglbtnNewToggleButton_43 = new JToggleButton("14");
		tglbtnNewToggleButton_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_43.setBounds(90, 137, 70, 52);
		panel_2.add(tglbtnNewToggleButton_43);
		
		JToggleButton tglbtnNewToggleButton_44 = new JToggleButton("15");
		tglbtnNewToggleButton_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_44.setBounds(170, 137, 70, 52);
		panel_2.add(tglbtnNewToggleButton_44);
		
		JToggleButton tglbtnNewToggleButton_45 = new JToggleButton("16");
		tglbtnNewToggleButton_45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_45.setBounds(250, 137, 70, 52);
		panel_2.add(tglbtnNewToggleButton_45);
		
		JToggleButton tglbtnNewToggleButton_46 = new JToggleButton("17");
		tglbtnNewToggleButton_46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_46.setBounds(330, 137, 70, 52);
		panel_2.add(tglbtnNewToggleButton_46);
		
		JToggleButton tglbtnNewToggleButton_47 = new JToggleButton("18");
		tglbtnNewToggleButton_47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_47.setBounds(410, 137, 70, 52);
		panel_2.add(tglbtnNewToggleButton_47);
		
		JToggleButton tglbtnNewToggleButton_48 = new JToggleButton("19");
		tglbtnNewToggleButton_48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_48.setBounds(10, 200, 70, 52);
		panel_2.add(tglbtnNewToggleButton_48);
		
		JToggleButton tglbtnNewToggleButton_49 = new JToggleButton("20");
		tglbtnNewToggleButton_49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_49.setBounds(90, 200, 70, 52);
		panel_2.add(tglbtnNewToggleButton_49);
		
		JToggleButton tglbtnNewToggleButton_50 = new JToggleButton("21");
		tglbtnNewToggleButton_50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_50.setBounds(170, 200, 70, 52);
		panel_2.add(tglbtnNewToggleButton_50);
		
		JToggleButton tglbtnNewToggleButton_51 = new JToggleButton("22");
		tglbtnNewToggleButton_51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_51.setBounds(250, 200, 70, 52);
		panel_2.add(tglbtnNewToggleButton_51);
		
		JToggleButton tglbtnNewToggleButton_52 = new JToggleButton("23");
		tglbtnNewToggleButton_52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_52.setBounds(330, 200, 70, 52);
		panel_2.add(tglbtnNewToggleButton_52);
		
		JToggleButton tglbtnNewToggleButton_53 = new JToggleButton("24");
		tglbtnNewToggleButton_53.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_53.setBounds(410, 200, 70, 52);
		panel_2.add(tglbtnNewToggleButton_53);
		
		JToggleButton tglbtnNewToggleButton_54 = new JToggleButton("25");
		tglbtnNewToggleButton_54.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_54.setBounds(10, 263, 70, 52);
		panel_2.add(tglbtnNewToggleButton_54);
		
		JToggleButton tglbtnNewToggleButton_55 = new JToggleButton("26");
		tglbtnNewToggleButton_55.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_55.setBounds(90, 263, 70, 52);
		panel_2.add(tglbtnNewToggleButton_55);
		
		JToggleButton tglbtnNewToggleButton_56 = new JToggleButton("27");
		tglbtnNewToggleButton_56.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_56.setBounds(170, 263, 70, 52);
		panel_2.add(tglbtnNewToggleButton_56);
		
		JToggleButton tglbtnNewToggleButton_57 = new JToggleButton("28");
		tglbtnNewToggleButton_57.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_57.setBounds(250, 263, 70, 52);
		panel_2.add(tglbtnNewToggleButton_57);
			
		JToggleButton tglbtnNewToggleButton_58 = new JToggleButton("29");
		tglbtnNewToggleButton_58.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_58.setBounds(330, 263, 70, 52);
		panel_2.add(tglbtnNewToggleButton_58);
		
		JToggleButton tglbtnNewToggleButton_59 = new JToggleButton("30");
		tglbtnNewToggleButton_59.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tglbtnNewToggleButton_59.setBounds(410, 263, 70, 52);
		panel_2.add(tglbtnNewToggleButton_59);
		
		
		
		
		
		
		
		
		
		JToggleButton tglbtnNewToggleButton_60_0 = new JToggleButton("A");
		tglbtnNewToggleButton_60_0.setBounds(10, 417, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_0);
		
		JToggleButton tglbtnNewToggleButton_60_1 = new JToggleButton("B");
		tglbtnNewToggleButton_60_1.setBounds(133, 417, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_1);
		
		JToggleButton tglbtnNewToggleButton_60_2 = new JToggleButton("C");
		tglbtnNewToggleButton_60_2.setBounds(271, 417, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_2);
		
		JToggleButton tglbtnNewToggleButton_60_3 = new JToggleButton("D");
		tglbtnNewToggleButton_60_3.setBounds(394, 417, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_3);
		
		JToggleButton tglbtnNewToggleButton_60_4 = new JToggleButton("E");
		tglbtnNewToggleButton_60_4.setBounds(10, 461, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_4);
		
		JToggleButton tglbtnNewToggleButton_60_5 = new JToggleButton("F");
		tglbtnNewToggleButton_60_5.setBounds(133, 461, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_5);
		
		JToggleButton tglbtnNewToggleButton_60_6 = new JToggleButton("G");
		tglbtnNewToggleButton_60_6.setBounds(271, 461, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_6);
		
		JToggleButton tglbtnNewToggleButton_60_7 = new JToggleButton("H");
		tglbtnNewToggleButton_60_7.setBounds(394, 461, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_7);
		
		JToggleButton tglbtnNewToggleButton_60_8 = new JToggleButton("I");
		tglbtnNewToggleButton_60_8.setBounds(10, 505, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_8);
		
		JToggleButton tglbtnNewToggleButton_60_9 = new JToggleButton("J");
		tglbtnNewToggleButton_60_9.setBounds(133, 505, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_9);
		
		JToggleButton tglbtnNewToggleButton_60_10 = new JToggleButton("K");
		tglbtnNewToggleButton_60_10.setBounds(271, 505, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_10);
		
		JToggleButton tglbtnNewToggleButton_60_11 = new JToggleButton("L");
		tglbtnNewToggleButton_60_11.setBounds(394, 505, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_11);
		
		JToggleButton tglbtnNewToggleButton_60_12 = new JToggleButton("M");
		tglbtnNewToggleButton_60_12.setBounds(10, 549, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_12);
		
		JToggleButton tglbtnNewToggleButton_60_13 = new JToggleButton("N");
		tglbtnNewToggleButton_60_13.setBounds(133, 549, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_13);
		
		JToggleButton tglbtnNewToggleButton_60_14 = new JToggleButton("O");
		tglbtnNewToggleButton_60_14.setBounds(271, 549, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_14);
		
		JToggleButton tglbtnNewToggleButton_60_15 = new JToggleButton("P");
		tglbtnNewToggleButton_60_15.setBounds(394, 549, 113, 33);
		contentPane.add(tglbtnNewToggleButton_60_15);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 378, 497, 28);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(616, 33, 102, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(740, 33, 102, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton_59.isSelected()) {
					System.out.println("30");
				}
			}
		});
		btnNewButton_2.setBounds(517, 33, 89, 546);
		contentPane.add(btnNewButton_2);
		

		
		
	}
}
