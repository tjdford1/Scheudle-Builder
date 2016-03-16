package scheduleGUI;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import schedule.Catalog;
import schedule.CourseCatalog;
import javax.swing.JButton;
import javax.swing.ListModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ScheduleBuilderGUI {

	private JFrame frmSelectClasses;
	private Catalog catalog;
	private DefaultListModel<String> model = new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleBuilderGUI window = new ScheduleBuilderGUI();
					window.frmSelectClasses.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScheduleBuilderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectClasses = new JFrame();
		frmSelectClasses.setTitle("Course Selection");
		frmSelectClasses.setResizable(false);
		frmSelectClasses.setBounds(100, 100, 726, 334);
		frmSelectClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectClasses.getContentPane().setLayout(null);
		
		catalog = new Catalog("select distinct subject from Catalog");

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				fillClass(comboBox.getSelectedItem());
			
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(catalog.getList()));
		comboBox.setToolTipText("Select Subject");
		comboBox.setBounds(16, 0, 200, 50);
		frmSelectClasses.getContentPane().add(comboBox);
		
		JList<String> subject = new JList<String>(model);
		subject.setBounds(16, 72, 192, 194);
		frmSelectClasses.getContentPane().add(subject);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(44, 269, 117, 29);
		frmSelectClasses.getContentPane().add(btnAdd);
		
		JList<String> list = new JList<String>((ListModel) null);
		list.setBounds(223, 72, 192, 194);
		frmSelectClasses.getContentPane().add(list);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemove.setBounds(252, 269, 117, 29);
		frmSelectClasses.getContentPane().add(btnRemove);
		
		JCheckBox chckbx8 = new JCheckBox("8 am");
		chckbx8.setSelected(true);
		chckbx8.setBounds(635, 27, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx8);
		
		JCheckBox chckbx9 = new JCheckBox("9 am");
		chckbx9.setSelected(true);
		chckbx9.setBounds(635, 50, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx9);
		
		JCheckBox chckbx10 = new JCheckBox("10 am");
		chckbx10.setSelected(true);
		chckbx10.setBounds(635, 73, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx10);
		
		JCheckBox chckbx11 = new JCheckBox("11 am");
		chckbx11.setSelected(true);
		chckbx11.setBounds(635, 96, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx11);
		
		JCheckBox chckbx12 = new JCheckBox("12 pm");
		chckbx12.setSelected(true);
		chckbx12.setBounds(635, 119, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx12);
		
		JCheckBox chckbx1 = new JCheckBox("1 pm");
		chckbx1.setSelected(true);
		chckbx1.setBounds(635, 142, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("2 pm");
		chckbx2.setSelected(true);
		chckbx2.setBounds(635, 165, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("3 pm");
		chckbx3.setSelected(true);
		chckbx3.setBounds(635, 188, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx3);
		
		JCheckBox chckbx4 = new JCheckBox("4 pm");
		chckbx4.setSelected(true);
		chckbx4.setBounds(635, 211, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx4);
		
		JCheckBox chckbx5 = new JCheckBox("5pm");
		chckbx5.setSelected(true);
		chckbx5.setBounds(635, 234, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx5);
		
		JCheckBox chckbx6 = new JCheckBox("6pm");
		chckbx6.setSelected(true);
		chckbx6.setBounds(635, 257, 85, 23);
		frmSelectClasses.getContentPane().add(chckbx6);
		
		JList<String> list_1 = new JList<String>((ListModel) null);
		list_1.setBounds(430, 74, 192, 194);
		frmSelectClasses.getContentPane().add(list_1);
		
		JLabel lblAddCourse = new JLabel("Add Course");
		lblAddCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCourse.setBounds(70, 50, 79, 16);
		frmSelectClasses.getContentPane().add(lblAddCourse);
		
		JLabel lblSelectedCourse = new JLabel("Selected Course");
		lblSelectedCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedCourse.setBounds(252, 50, 117, 16);
		frmSelectClasses.getContentPane().add(lblSelectedCourse);
		
		JLabel lblProfessors = new JLabel("Professors");
		lblProfessors.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessors.setBounds(491, 50, 79, 16);
		frmSelectClasses.getContentPane().add(lblProfessors);
	}
	
	public void fillClass(Object subject){
		
		CourseCatalog catalog = new CourseCatalog("select distinct course, title from Catalog where subject = '" + subject + "'");

		Object[] str = catalog.getList();
		
		for(Object obj : str)
			model.addElement((String) obj);
	}
}
