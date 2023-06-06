package zxc;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class AboutDashboard extends JFrame {

	private JPanel contentPane;

	private Image img_profile = new ImageIcon(AboutDashboard.class.getResource("images/profile.jpg")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutDashboard frame = new AboutDashboard();
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
	public AboutDashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutDashboard.class.getResource("/zxc/images/NU.png")));
		setTitle("AboutMe!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 571);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 316, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(32, 96, 250, 235);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img_profile));
		
		JLabel lblNewLabel_1 = new JLabel("About Me:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(44, 23, 220, 54);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_school = new JLabel("Studies at National University Philippines");
		lblNewLabel_school.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_school.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_school.setForeground(Color.RED);
		lblNewLabel_school.setBounds(376, 11, 710, 137);
		contentPane.add(lblNewLabel_school);
		
		JLabel lblNewLabel_location = new JLabel("Lives in Sapang Palay Proper, Bulacan, Philippines");
		lblNewLabel_location.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_location.setForeground(Color.RED);
		lblNewLabel_location.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_location.setBounds(373, 134, 713, 155);
		contentPane.add(lblNewLabel_location);
		
		JLabel lblNewLabel_contact = new JLabel("+63 921 678 6492");
		lblNewLabel_contact.setFont(new Font("Arial", Font.PLAIN, 29));
		lblNewLabel_contact.setForeground(Color.RED);
		lblNewLabel_contact.setBounds(373, 272, 710, 137);
		contentPane.add(lblNewLabel_contact);
		
		JLabel lblNewLabel_email = new JLabel("iamedsondimagiba@gmail.com");
		lblNewLabel_email.setFont(new Font("Arial", Font.PLAIN, 29));
		lblNewLabel_email.setForeground(Color.RED);
		lblNewLabel_email.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_email.setBounds(373, 392, 710, 129);
		contentPane.add(lblNewLabel_email);
		
		JLabel lblNewLabel_locationicon = new JLabel("");
		lblNewLabel_locationicon.setIcon(new ImageIcon(AboutDashboard.class.getResource("/zxc/images/location.png")));
		lblNewLabel_locationicon.setBounds(314, 194, 50, 47);
		contentPane.add(lblNewLabel_locationicon);
		
		JLabel lblNewLabel_contacticon = new JLabel("");
		lblNewLabel_contacticon.setIcon(new ImageIcon(AboutDashboard.class.getResource("/zxc/images/contact.png")));
		lblNewLabel_contacticon.setBounds(317, 320, 46, 47);
		contentPane.add(lblNewLabel_contacticon);
		
		JLabel lblNewLabel_emailicon = new JLabel("");
		lblNewLabel_emailicon.setIcon(new ImageIcon(AboutDashboard.class.getResource("/zxc/images/email.png")));
		lblNewLabel_emailicon.setBounds(317, 442, 46, 47);
		contentPane.add(lblNewLabel_emailicon);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(AboutDashboard.class.getResource("/zxc/images/school.png")));
		lblNewLabel_10.setBounds(318, 61, 57, 44);
		contentPane.add(lblNewLabel_10);
		
		
	}
}
