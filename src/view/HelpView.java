package view;

import model.HelpModel;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class HelpView extends JFrame {

    private JPanel contentPane;
    private String title;
    private String content;
    private final String FONT_DEFAULT = "VNI-Ariston";

    /**
     * Create the frame.
     */
    public HelpView(HelpModel model) {
        this.title = model.getTitle();
        this.content = model.getContent();
    }


    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 475, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel(this.title);
        lblTitle.setForeground(Color.RED);
        lblTitle.setBackground(Color.BLUE);
        lblTitle.setFont(new Font(FONT_DEFAULT, Font.PLAIN, 23));
        lblTitle.setBounds(10, 0, 211, 49);
        contentPane.add(lblTitle);

        JLabel lblContent = new JLabel(this.content);
        lblContent.setForeground(Color.MAGENTA);
        lblContent.setBounds(10, 43, 443, 85);
        contentPane.add(lblContent);
    }

}
