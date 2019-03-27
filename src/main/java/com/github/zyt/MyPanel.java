package com.github.zyt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

/**
 * @Author: zyt
 * @Date: 2019/3/26 16:02
 * @Description:
 */
public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {

    int nMouseX = -1, nMouseY = -1;
    int nMouseShiftX = -1, nMouseShiftY = -1;
    List<Ball> ballList;
    int x, y, xr, yr;

    MyPanel(List<Ball> ballList) {
        this.setBounds(0, 0, (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()
                , (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        this.setBackground(null);
        this.setOpaque(false);
        this.ballList = ballList;
        System.out.println("Panel已创建！");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < ballList.size(); i++) {
            x = (int) (ballList.get(i).x - (ballList.get(i).r / 2));
            y = (int) (ballList.get(i).y - (ballList.get(i).r / 2));
            xr = (int) ballList.get(i).r;
            yr = (int) ballList.get(i).r;
            g.drawImage(ballList.get(i).images.get((int) ballList.get(i).nowimg), x, y, xr, yr, null);
        }
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击");
        System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按压");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标退出");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("鼠标拖拽");
        System.exit(0);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (this.nMouseX < 0 || this.nMouseY < 0) {
            this.nMouseX = e.getX();
            this.nMouseY = e.getY();
        } else {
            this.nMouseShiftX = Math.abs(e.getX() - this.nMouseX);
            this.nMouseShiftY = Math.abs(e.getY() - this.nMouseY);
            System.out.println("鼠标移动:" + "x=" + this.nMouseShiftX + "y=" + this.nMouseShiftY);
            if ((this.nMouseShiftX + this.nMouseShiftY) >= 2) {
                System.exit(0);
            }
        }
    }

}
