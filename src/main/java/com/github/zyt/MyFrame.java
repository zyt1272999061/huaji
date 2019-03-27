package com.github.zyt;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @Author: zyt
 * @Date: 2019/3/26 16:02
 * @Description:
 */
public class MyFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private MyPanel myPanel;
    public static final int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static final int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    private ImageIcon backGround;
    private JLabel backGroundLabel;
    private JFrame jFrame = new JFrame("滑稽屏保");

    public MyFrame(int x, int y, List<Ball> ballList) {
        backGround = new ImageIcon("D:\\IdeaProjects\\huaji\\src\\main\\resources\\images\\Husky.jpg");
        backGroundLabel = new JLabel(backGround);
        backGroundLabel.setLayout(null);
        backGroundLabel.setBounds(0, 0, backGround.getIconWidth(), backGround.getIconHeight());
        JLayeredPane backGroundLayeredPane = this.getLayeredPane();
        backGroundLayeredPane.add(backGroundLabel);
        backGroundLayeredPane.setLayer(backGroundLabel, -1000);
        this.setUndecorated(true);
        this.setBounds(x, y, width, height);
        myPanel = new MyPanel(ballList);
        myPanel.setLocation(0, 0);
        this.add(myPanel);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(0, 0);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(backGroundLabel);
        //this.getContentPane().setVisible(false);
        // this.addMouseListener(myPanel);
        //this.addMouseMotionListener(myPanel);
    }
}
