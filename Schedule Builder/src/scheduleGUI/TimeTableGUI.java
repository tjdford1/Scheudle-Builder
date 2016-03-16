package scheduleGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TimeTableGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeTableGUI frame = new TimeTableGUI();
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
	public TimeTableGUI() {
		
		setTitle("Schedule Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Day panel = new Day();
		panel.setBounds(53, 50, 160, 300);
		contentPane.add(panel);
		
		Day drawSSCCE = new Day();
		drawSSCCE.setBounds(213, 50, 160, 300);
		contentPane.add(drawSSCCE);
		
		Day drawSSCCE_1 = new Day();
		drawSSCCE_1.setBounds(373, 50, 160, 300);
		contentPane.add(drawSSCCE_1);
		
		Day drawSSCCE_2 = new Day();
		drawSSCCE_2.setBounds(533, 50, 160, 300);
		contentPane.add(drawSSCCE_2);
		
		Day drawSSCCE_3 = new Day();
		drawSSCCE_3.setBounds(693, 50, 160, 300);
		contentPane.add(drawSSCCE_3);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(91, 30, 79, 21);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(253, 30, 79, 21);
		contentPane.add(lblTuesday);
		
		JLabel lblWednesay = new JLabel("Wednesday");
		lblWednesay.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesay.setBounds(416, 30, 79, 21);
		contentPane.add(lblWednesay);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(575, 30, 79, 21);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setBounds(733, 30, 79, 21);
		contentPane.add(lblFriday);
		
		JButton btnProperties = new JButton("Properties");
		btnProperties.setBounds(736, 362, 117, 29);
		contentPane.add(btnProperties);
		
		JLabel lblAm = new JLabel("8 am");
		lblAm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAm.setBounds(6, 59, 41, 21);
		contentPane.add(lblAm);
		
		JLabel lblAm_1 = new JLabel("9 am");
		lblAm_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAm_1.setBounds(6, 86, 41, 21);
		contentPane.add(lblAm_1);
		
		JLabel lblAm_2 = new JLabel("10 am");
		lblAm_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAm_2.setBounds(6, 113, 41, 21);
		contentPane.add(lblAm_2);
		
		JLabel lblPm = new JLabel("1 pm");
		lblPm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPm.setBounds(6, 194, 41, 21);
		contentPane.add(lblPm);
		
		JLabel lblAm_3 = new JLabel("11 am");
		lblAm_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAm_3.setBounds(6, 140, 41, 21);
		contentPane.add(lblAm_3);
		
		JLabel lblAm_4 = new JLabel("12 am");
		lblAm_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAm_4.setBounds(6, 167, 41, 21);
		contentPane.add(lblAm_4);
		
		JLabel lblPm_3 = new JLabel("4 pm");
		lblPm_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPm_3.setBounds(6, 275, 41, 21);
		contentPane.add(lblPm_3);
		
		JLabel lblPm_1 = new JLabel("2 pm");
		lblPm_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPm_1.setBounds(6, 221, 41, 21);
		contentPane.add(lblPm_1);
		
		JLabel lblPm_2 = new JLabel("3 pm");
		lblPm_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPm_2.setBounds(6, 248, 41, 21);
		contentPane.add(lblPm_2);
		
		JLabel lblPm_4 = new JLabel("5 pm");
		lblPm_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPm_4.setBounds(6, 302, 41, 21);
		contentPane.add(lblPm_4);
		
		JLabel lblPm_5 = new JLabel("6 pm");
		lblPm_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPm_5.setBounds(6, 329, 41, 21);
		contentPane.add(lblPm_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/TJ/git/ScheduleBuilder/ScheduleBuilder/neverland4.gif"));
		lblNewLabel.setBounds(324, -23, 468, 559);
		contentPane.add(lblNewLabel);
	}
}
