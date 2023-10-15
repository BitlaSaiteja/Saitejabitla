import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class calculator implements ActionListener {
    static  String s1,s2,s3;
    static   Button beq,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,bc,bd1,sqrt,per;
    static JTextField t;
    calculator(){
        s1=s2=s3="";
    }
    public static void main(String[] args) {
        calculator c=new calculator();
        JFrame f=new JFrame("Saiteja's Calculator");
        per=new Button("%");
        per.setBackground(Color.GREEN);
        per.addActionListener(c);
        per.setFont(new Font("Courier",Font.BOLD,40));
        sqrt=new Button("√");
        sqrt.setBackground(Color.GREEN);
        sqrt.addActionListener(c);
        sqrt.setFont(new Font("Courier",Font.BOLD,40));
        b1=new Button("1");
        b1.setBackground(Color.GREEN);
        b1.addActionListener(c);
        b1.setFont(new Font("Courier",Font.BOLD,40));
        Button cb=new Button("^");
        cb.setBackground(Color.GREEN);
        cb.addActionListener(c);
        cb.setFont(new Font("Courier",Font.BOLD,40));
        b2=new Button("2");
        b2.setBackground(Color.GREEN);
        b2.addActionListener(c);
        b2.setFont(new Font("Courier",Font.BOLD,40));

        b3=new Button("3");
        b3.setBackground(Color.GREEN);
        b3.addActionListener(c);
        b3.setFont(new Font("Aria",Font.BOLD,40));

        b4=new Button("4");
        b4.setBackground(Color.GREEN);
        b4.addActionListener(c);
        b4.setFont(new Font("Aria",Font.BOLD,40));

        b5=new Button("5");
        b5.setBackground(Color.GREEN);
        b5.addActionListener(c);
        b5.setFont(new Font("Aria",Font.BOLD,40));

        b6=new Button("6");
        b6.setBackground(Color.GREEN);
        b6.addActionListener(c);
        b6.setFont(new Font("Aria",Font.BOLD,40));

        b7=new Button("7");
        b7.setBackground(Color.GREEN);
        b7.addActionListener(c);
        b7.setFont(new Font("Aria",Font.BOLD,40));

        b8=new Button("8");
        b8.setBackground(Color.GREEN);
        b8.addActionListener(c);
        b8.setFont(new Font("Aria",Font.BOLD,40));

        b9=new Button("9");
        b9.setBackground(Color.GREEN);
        b9.addActionListener(c);
        b9.setFont(new Font("Aria",Font.BOLD,40));

        b0=new Button("0");
        b0.setBackground(Color.GREEN);
        b0.addActionListener(c);
        b0.setFont(new Font("Aria",Font.BOLD,40));

        ba=new Button("+");
        ba.setBackground(Color.GREEN);
        ba.addActionListener(c);
        ba.setFont(new Font("Aria",Font.BOLD,40));

        bs=new Button("-");
        bs.setBackground(Color.GREEN);
        bs.addActionListener(c);
        bs.setFont(new Font("Aria",Font.BOLD,40));

        bm=new Button("*");
        bm.setBackground(Color.GREEN);
        bm.addActionListener(c);
        bm.setFont(new Font("Aria",Font.BOLD,40));

        bd=new Button("/");
        bd.setBackground(Color.GREEN);
        bd.addActionListener(c);
        bd.setFont(new Font("Aria",Font.BOLD,40));

        bd1=new Button(".");
        bd1.setBackground(Color.GREEN);
        bd1.addActionListener(c);
        bd1.setFont(new Font("Aria",Font.BOLD,40));

        bc=new Button("Clear");
        bc.setBackground(Color.GREEN);
        bc.addActionListener(c);
        bc.setFont(new Font("Aria",Font.BOLD,40));

        beq=new Button("=");
        beq.setBackground(Color.BLUE);
        beq.addActionListener(c);
        beq.setFont(new Font("Aria",Font.BOLD,40));
        beq.setSize(100,20);

        t=new JTextField();
        t.setEditable(false);
        t.setFont(new Font("Aria",Font.BOLD,25));
        t.setSize(1000,20);
        t.setBackground(Color.CYAN);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(ba);
        f.add(bs);
        f.add(bm);
        f.add(bd);
        f.add(bd1);
        f.add(cb);
        f.add(sqrt);
        f.add(per);
        f.add(bc);
        f.add(beq);
        f.setLayout(new GridLayout(6,4));
        f.setSize(600,350);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.charAt(0)>='0'&&s.charAt(0)<='9'||s.charAt(0)=='.'){
            if(!s2.equals(""))
                s3=s3+s;
            else
                s1=s1+s;

            t.setText(s1 + s2 + s3);
        }else if(s.charAt(0)=='C')
        {
            s1=s2=s3="";
            t.setText(s1+s2+s3);
        }
        else if(s.charAt(0)=='='){
            double result;
            if(s2.equals("+"))
                result=Double.parseDouble(s1)+Double.parseDouble(s3);
            else if(s2.equals("-"))
                result=Double.parseDouble(s1)-Double.parseDouble(s3);
            else if(s2.equals("%"))
                result=Double.parseDouble(s1)%Double.parseDouble(s3);
            else if (s2.equals("*"))
                result=Double.parseDouble(s1)*Double.parseDouble(s3);
            else if (s2.equals("^")) {
                result = Double.parseDouble(String.valueOf(Math.pow(Double.parseDouble(s1),Double.parseDouble(s3)))) ;
            }
            else if (s2.equals("√")) {
                result = Double.parseDouble(String.valueOf(Math.sqrt(Double.parseDouble(s1))));
            }else
                result=Double.parseDouble(s1)/Double.parseDouble(s3);
            t.setText(s1+s2+s3+"="+result);
            s1=Double.toString(result);
            s2=s3="";
        }else{
            if(Objects.equals(s2, "") || s3.isEmpty())
            {
                s2=s;
            }else{
                double result;
                if(s2.equals("+"))
                    result=Double.parseDouble(s1)+Double.parseDouble(s3);
                else if(s2.equals("-"))
                    result=Double.parseDouble(s1)-Double.parseDouble(s3);
                else if (s2.equals("*"))
                    result=Double.parseDouble(s1)*Double.parseDouble(s3);
                else if (s2.equals("^")) {
                    result = Double.parseDouble(String.valueOf(Math.pow(Double.parseDouble(s1),Double.parseDouble(s3)))) ;
                } else if (s2.equals("√")) {
                    result = Double.parseDouble(String.valueOf(Math.sqrt(Double.parseDouble(s1))));
                }else if(s2.equals("%"))
                    result=Double.parseDouble(s1)%Double.parseDouble(s3);
                else
                    result=Double.parseDouble(s1)/Double.parseDouble(s3);
                t.setText(s1+s2+s3+"="+result);
                s1=Double.toString(result);
                s2=s;
                s3="";
            }
            t.setText(s1+s2+s3);
        }
    }
}

