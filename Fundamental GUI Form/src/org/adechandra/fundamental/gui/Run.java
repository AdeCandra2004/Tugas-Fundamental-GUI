package org.adechandra.fundamental.gui;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Data Pengguna");
        jFrame.setContentPane(new FormDataBank().getRootP());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700,500);
        jFrame.setVisible(true);
    }
}
