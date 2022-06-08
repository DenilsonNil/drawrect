package br.com.kualit.printrect.core;

import java.awt.*;
import javax.swing.*;

public final class Rectangle extends JFrame {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawRect(100, 100, this.width, this.height);
    }


}
