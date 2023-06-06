package zxc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HobbiesDashboard extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HobbiesDashboard frame = new HobbiesDashboard();
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
	public HobbiesDashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HobbiesDashboard.class.getResource("/zxc/images/NU.png")));
		setTitle("MyHobbies:D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 571);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 351, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Hobbies:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(50, 0, 224, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_animeicon = new JLabel("");
		lblNewLabel_animeicon.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/anime.png")));
		lblNewLabel_animeicon.setBounds(10, 58, 331, 238);
		lblNewLabel_animeicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_animeicon.setVerticalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_animeicon);
		
		JLabel lblNewLabel_Dark = new JLabel("");
		lblNewLabel_Dark.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/tvseries.jpg")));
		lblNewLabel_Dark.setBounds(10, 307, 331, 225);
		lblNewLabel_Dark.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_Dark.setVerticalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_Dark);
		
		JLabel lblNewLabel_TV = new JLabel("");
		lblNewLabel_TV.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/watching.png")));
		lblNewLabel_TV.setBounds(893, 0, 153, 150);
		lblNewLabel_TV.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_TV.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_TV);
		
		JLabel lblNewLabel_watchinganime = new JLabel("I love spending time watching anime.");
		lblNewLabel_watchinganime.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_watchinganime.setForeground(Color.RED);
		lblNewLabel_watchinganime.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_watchinganime.setBounds(411, 11, 511, 62);
		contentPane.add(lblNewLabel_watchinganime);
		
		JLabel lblNewLabel_JapaneseMusic = new JLabel("Listening to Japanese Music even though i cant i understand it well.");
		lblNewLabel_JapaneseMusic.setForeground(Color.RED);
		lblNewLabel_JapaneseMusic.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_JapaneseMusic.setBounds(411, 81, 511, 69);
		contentPane.add(lblNewLabel_JapaneseMusic);
		
		JLabel lblNewLabel_PopMusic = new JLabel("Listening to Rock, Country, Pop Music on Spotify.");
		lblNewLabel_PopMusic.setForeground(Color.RED);
		lblNewLabel_PopMusic.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_PopMusic.setBounds(411, 150, 511, 80);
		contentPane.add(lblNewLabel_PopMusic);
		
		JLabel lblNewLabel_TvSeries = new JLabel("I also love watching TV Series and Movies Most likely Hollywoods.");
		lblNewLabel_TvSeries.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_TvSeries.setForeground(Color.RED);
		lblNewLabel_TvSeries.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_TvSeries.setBounds(411, 302, 543, 62);
		contentPane.add(lblNewLabel_TvSeries);
		
		JLabel lblNewLabel_Traveling = new JLabel("I also love traveling but it sucks because i have low vision, so i can't enjoy the view.");
		lblNewLabel_Traveling.setForeground(Color.RED);
		lblNewLabel_Traveling.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_Traveling.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_Traveling.setBounds(411, 375, 548, 62);
		contentPane.add(lblNewLabel_Traveling);
		
		JLabel lblNewLabel_fav1 = new JLabel("");
		lblNewLabel_fav1.addMouseListener(new MouseAdapter() {
			
		});
		lblNewLabel_fav1.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/fav.png")));
		lblNewLabel_fav1.setBounds(358, 18, 53, 51);
		contentPane.add(lblNewLabel_fav1);
		
		JLabel lblNewLabel_fav2 = new JLabel("");
		lblNewLabel_fav2.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/fav.png")));
		lblNewLabel_fav2.setBounds(358, 95, 53, 51);
		contentPane.add(lblNewLabel_fav2);
		
		JLabel lblNewLabel_fav3 = new JLabel("");
		lblNewLabel_fav3.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/fav.png")));
		lblNewLabel_fav3.setBounds(361, 168, 53, 51);
		contentPane.add(lblNewLabel_fav3);
		
		JLabel lblNewLabel_fav4 = new JLabel("");
		lblNewLabel_fav4.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/fav.png")));
		lblNewLabel_fav4.setBounds(358, 313, 53, 51);
		contentPane.add(lblNewLabel_fav4);
		
		JLabel lblNewLabel_fav5 = new JLabel("");
		lblNewLabel_fav5.setIcon(new ImageIcon(HobbiesDashboard.class.getResource("/zxc/images/fav.png")));
		lblNewLabel_fav5.setBounds(358, 386, 53, 51);
		contentPane.add(lblNewLabel_fav5);
	}
}
