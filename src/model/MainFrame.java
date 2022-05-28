package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Level1
public class MainFrame extends JFrame implements ActionListener, Runnable {
	//Chon row col theo level
	//Vi du cho truoc row col=4
	private int row = 4;
	private int col = 4;
	private int width = 700;
	private int height = 500;
	private ButtonEvent graphicsPanel;
	private JPanel mainPanel;
      
	public MainFrame() {
		add(mainPanel = createMainPanel());
		setTitle("Matching Game");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		setVisible(true);
                
	}

	private JPanel createMainPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(createGraphicsPanel(), BorderLayout.CENTER);
		return panel;
	}


	private JPanel createGraphicsPanel() {
		graphicsPanel = new ButtonEvent( row, col);
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBackground(Color.gray);
		panel.add(graphicsPanel);
		return panel;
	}
    @Override
	public void actionPerformed(ActionEvent e) {   
	}


	@Override
	public void run() {
	}
}