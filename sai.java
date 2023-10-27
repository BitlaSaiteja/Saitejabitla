// Java program to create a simple calculator
// with basic +, -, /, * using java swing elements

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class w  implements ActionListener {
    static JFrame p;

    static JTextField l;

    String s0, s1, s2;

    w()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[])
    {
        p = new JFrame("calculator");


        w c = new w();

        l = new JTextField();

        l.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

        b0 = new JButton("0");
        b0.setBackground(Color.BLUE);
        b1 = new JButton("1");
        b0.setBackground(Color.BLUE);

        b2 = new JButton("2");
        b0.setBackground(Color.BLUE);

        b3 = new JButton("3");
        b0.setBackground(Color.BLUE);

        b4 = new JButton("4");
        b0.setBackground(Color.BLUE);

        b5 = new JButton("5");
        b0.setBackground(Color.BLUE);

        b6 = new JButton("6");
        b0.setBackground(Color.BLUE);

        b7 = new JButton("7");
        b0.setBackground(Color.BLUE);

        b8 = new JButton("8");
        b0.setBackground(Color.BLUE);

        b9 = new JButton("9");

        b0.setBackground(Color.BLUE);

        beq1 = new JButton("=");

        ba = new JButton("+");
        b0.setBackground(Color.CYAN);

        bs = new JButton("-");
        b0.setBackground(Color.CYAN);

        bd = new JButton("/");
        b0.setBackground(Color.CYAN);

        bm = new JButton("*");
        b0.setBackground(Color.CYAN);

        beq = new JButton("C");
        b0.setBackground(Color.CYAN);

        be = new JButton(".");
        b0.setBackground(Color.CYAN);


        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);

        // add elements to panel
        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);

        p.setBackground(Color.blue);

        p.add(p);
        p.setLayout(new GridLayout(4,4));
        p.setSize(1920, 1080);
        p.setVisible(true);    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";

            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            // set the value of text
            l.setText(s0 + s1 + s2 + "=" + te);

            // convert it to string
            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
                // else evaluate
            else {
                double te;

                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                // convert it to string
                s0 = Double.toString(te);

                // place the operator
                s1 = s;

                // make the operand blank
                s2 = "";
            }

            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
}