package zxc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class AchievementsDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AchievementsDashboard frame = new AchievementsDashboard();
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
	public AchievementsDashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AchievementsDashboard.class.getResource("/zxc/images/NU.png")));
		setTitle("My Achievements:)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 20, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 351, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAchievements = new JLabel("My Achievements as a Gamer:");
		lblAchievements.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievements.setForeground(Color.WHITE);
		lblAchievements.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAchievements.setBounds(0, 11, 341, 68);
		panel.add(lblAchievements);
		
		JLabel lblstRunnerUp = new JLabel("1st Runner up SJDM Valorant Tournament");
		lblstRunnerUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblstRunnerUp.setForeground(Color.WHITE);
		lblstRunnerUp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblstRunnerUp.setBounds(0, 71, 361, 119);
		panel.add(lblstRunnerUp);
		
		JLabel lblChampionTncMuzon = new JLabel("Champion TNC Muzon Valorant Tournament");
		lblChampionTncMuzon.setHorizontalAlignment(SwingConstants.CENTER);
		lblChampionTncMuzon.setForeground(Color.WHITE);
		lblChampionTncMuzon.setFont(new Font("Arial", Font.PLAIN, 15));
		lblChampionTncMuzon.setBounds(0, 175, 361, 119);
		panel.add(lblChampionTncMuzon);
		
		JLabel lblChampionGarayValorant = new JLabel("Champion Garay Valorant Tournament");
		lblChampionGarayValorant.setHorizontalAlignment(SwingConstants.CENTER);
		lblChampionGarayValorant.setForeground(Color.WHITE);
		lblChampionGarayValorant.setFont(new Font("Arial", Font.PLAIN, 15));
		lblChampionGarayValorant.setBounds(0, 289, 361, 119);
		panel.add(lblChampionGarayValorant);
		
		JLabel lblNewLabel = new JLabel("And More....");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 404, 320, 96);
		panel.add(lblNewLabel);
		
		JLabel lblsjdm = new JLabel("");
		lblsjdm.setIcon(new ImageIcon(AchievementsDashboard.class.getResource("/zxc/images/tncsapangpalay.png")));
		lblsjdm.setBounds(361, 11, 359, 265);
		contentPane.add(lblsjdm);
		
		JLabel lblmuzon = new JLabel("");
		lblmuzon.setIcon(new ImageIcon(AchievementsDashboard.class.getResource("/zxc/images/tncmuzonn.jpg")));
		lblmuzon.setBounds(361, 280, 209, 252);
		contentPane.add(lblmuzon);
		
		JLabel lblgaray = new JLabel("");
		lblgaray.setIcon(new ImageIcon(AchievementsDashboard.class.getResource("/zxc/images/garayy.jpg")));
		lblgaray.setBounds(573, 278, 429, 254);
		contentPane.add(lblgaray);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AchievementsDashboard.class.getResource("/zxc/images/valoranticon.png")));
		lblNewLabel_1.setBounds(777, 11, 225, 225);
		contentPane.add(lblNewLabel_1);
	}
}
