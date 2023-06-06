package zxc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class BaseFrame extends JFrame {
	protected JPanel contentPane;
	protected AboutDashboard aboutdashboard;
	protected HobbiesDashboard hobbiesdashboard;
	protected AchievementsDashboard achievementsdashboard;

	public BaseFrame() {
		initializeUI();
	}

	private void initializeUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\iamed\\Documents\\ICONSSSS CODE\\NU.png"));
		setTitle("Welcome (My Portfolio)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		aboutdashboard = new AboutDashboard();
		hobbiesdashboard = new HobbiesDashboard();
		achievementsdashboard = new AchievementsDashboard();

		JLabel lblNewLabel_6 = new JLabel("Photographer and Web Designer");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(775, 329, 418, 41);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel = new JLabel("I'm Edson P. Dimagiba");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(765, 180, 457, 138);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_5 = new JLabel("profile");
		lblNewLabel_5.setIcon(new ImageIcon(Home.class.getResource("/zxc/images/profile.jpg")));
		lblNewLabel_5.setBounds(599, 371, 771, 655);
		contentPane.add(lblNewLabel_5);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 183, 49);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutdashboard.setVisible(true);
				hobbiesdashboard.setVisible(false);
				achievementsdashboard.setVisible(false);
			}
		});
		btnAbout.setBackground(new Color(0, 0, 0));
		btnAbout.setForeground(new Color(255, 0, 0));
		btnAbout.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAbout.setBounds(0, 0, 183, 49);
		panel.add(btnAbout);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(203, 11, 183, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnHobbies = new JButton("Hobbies");
		btnHobbies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutdashboard.setVisible(false);
				hobbiesdashboard.setVisible(true);
				achievementsdashboard.setVisible(false);
			}
		});
		btnHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		btnHobbies.setFont(new Font("Arial", Font.PLAIN, 20));
		btnHobbies.setBackground(new Color(0, 0, 0));
		btnHobbies.setForeground(new Color(255, 0, 0));
		btnHobbies.setBounds(0, 0, 183, 49);
		panel_1.add(btnHobbies);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(396, 11, 183, 49);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton btnAchievements = new JButton("Achievements");
		btnAchievements.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutdashboard.setVisible(false);
				hobbiesdashboard.setVisible(false);
				achievementsdashboard.setVisible(true);
			}
		});
		btnAchievements.setBounds(0, 0, 183, 49);
		btnAchievements.setHorizontalAlignment(SwingConstants.CENTER);
		btnAchievements.setForeground(Color.RED);
		btnAchievements.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAchievements.setBackground(Color.BLACK);
		panel_2.add(btnAchievements);

		setLocationRelativeTo(null);
	}
}
