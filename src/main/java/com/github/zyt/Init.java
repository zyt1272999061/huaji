package com.github.zyt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zyt
 * @Date: 2019/3/26 16:01
 * @Description:
 */
public class Init {

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        List<Image> images = new ArrayList<>();
        try {
            images.add(ImageIO.read(new File("D:\\IdeaProjects\\huaji\\src\\main\\resources\\images\\huaji2.png")));
            images.add(ImageIO.read(new File("D:\\IdeaProjects\\huaji\\src\\main\\resources\\images\\huaji3.png")));
            images.add(ImageIO.read(new File("D:\\IdeaProjects\\huaji\\src\\main\\resources\\images\\huaji4.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyFrame myFrame = new MyFrame(0, 0, balls);
       // myFrame.setType(MyFrame.Type.UTILITY);
       // GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(myFrame);
        for (int i = 0; i < 15; i++) {
            int ballSize = (int) (Math.random() * (300 - 30) + 30);
            balls.add(new NpcBall(
                    (int) (Math.random() * (MyFrame.width - ballSize / 2 - 15 - ballSize / 2) + ballSize / 2),
                    (int) (Math.random() * (MyFrame.height - ballSize / 2 - 35 - ballSize / 2) + ballSize / 2),
                    images,
                    ballSize,
                    (Math.random() * (5 - 4) + 1),
                    Math.random() * (90),
                    (Math.random() * 1000) % 2 == 0 ? 1 : -1,
                    (Math.random() * 1000) % 2 == 0 ? 1 : -1));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
