package com.github.zyt;

import java.awt.*;
import java.util.List;

/**
 * @Author: zyt
 * @Date: 2019/3/26 15:58
 * @Description:
 */
public class Ball {
    /**
     * 横坐标
     */
    double x;
    /**
     * 纵坐标
     */
    double y;
    /**
     * 半径
     */
    double r;
    /**
     * 当前贴图代数
     */
    double nowimg;
    /**
     * 贴图集合
     */
    List<Image> images;

    public Ball(double x, double y, List<Image> images, double r, double nowimg) {
        this.x = x;
        this.y = y;
        this.images = images;
        this.r = r;
        this.nowimg = nowimg;
    }
}
