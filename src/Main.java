import javax.swing.*;

/*/
Author: Jacob Loucks
description: this code is meant to be a mess around session, the plan is to build a "fluid sim"
in java, this entails quite a few things and may change during the course of the next few weeks.
mainly, this is a coding exercise to write concise and not broken code. -JL
 /*/
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("PhysSim");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setSize(500,500);

        frame.setVisible(true);
    }
}