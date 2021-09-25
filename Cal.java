import java.awt.*;

class myframe extends Frame {
    Panel p;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bclr, bdot;
    Button badd, bsub, bmul, bdiv, bmod, bcal, bback, bac;
    TextField tf1;
    Font f ;
    

    {
        setBackground(Color.pink);
        setForeground(Color.white);
        setLayout(null);


        tf1 = new TextField(40);
        tf1.setBounds(40,50,280,40);
        p = new Panel();
        p.setBackground(Color.gray);
        p.setBounds(30,110,300,270);
        p.setLayout(new GridLayout(4,4,5,5));
        f= new Font("Arial",Font.BOLD,5);

        b1=new Button("1");
        b1.setBounds(50,130,50,50);
        b1.setBackground(Color.darkGray);
        b2=new Button("2");
        b2.setBounds(120,130,50,50);
        b2.setBackground(Color.darkGray);
        b3=new Button("3");
        b3.setBounds(190,130,50,50);
        b3.setBackground(Color.darkGray);
        b4=new Button("4");
        b4.setBounds(245,190,50,50);
        b4.setBackground(Color.darkGray);
        badd = new Button("=");
        badd.setBounds(260,130,50, 50);
        badd.setBackground(Color.GRAY);
        b5 = new Button("5");
        b5.setBounds(50,190,50,50);
        b5.setBackground(Color.DARK_GRAY);
        b6 = new Button("6");
        b6.setBounds(120,190,50,50);
        b6.setBackground(Color.DARK_GRAY);
        b7 = new Button("7");
        b7.setBounds(190,190,50,50);
        b7.setBackground(Color.DARK_GRAY);
        b8 = new Button("8");
        b8.setBounds(245,190,50,50);
        b8.setBackground(Color.DARK_GRAY);
        bsub = new Button("-");
        bsub.setBounds(260,190,50,50);
        bsub.setBackground(Color.GRAY);
        b9 = new Button("9");
        b9.setBounds(50, 250, 50, 50);
        b9.setBackground(Color.darkGray);
        b0 = new Button("0");
        b0.setBounds(120, 250, 50, 50);
        b0.setBackground(Color.darkGray);
        bclr = new Button("Clear");
        bclr.setBounds(190, 250, 50, 50);
        bclr.setBackground(Color.darkGray);
        bcal = new Button("=");
        bcal.setBounds(240, 250, 50, 50);
        bcal.setBackground(Color.darkGray);
        bac = new Button("AC");
        bac.setBounds(260, 250, 50, 50);
        bac.setBackground(Color.GRAY);
        bmod = new Button("%");
        bmod.setBounds(50, 300, 50, 50);
        bmod.setBackground(Color.gray);
        bmul = new Button("x");
        bmul.setBounds(120, 300, 50, 50);
        bmul.setBackground(Color.gray);
        bdiv = new Button("/");
        bdiv.setBounds(190, 300, 50, 50);
        bdiv.setBackground(Color.gray);
        bdot = new Button(".");
        bdot.setBounds(240, 300, 50, 50);
        bdot.setBackground(Color.GRAY);
        bback = new Button("Back");
        bback.setBounds(260, 300, 50, 50);
        bback.setBackground(Color.GRAY);


        add(p);
        add(tf1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(badd);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(bsub);
        p.add(b9);
        p.add(b0);
        p.add(bclr);
        p.add(bcal);
        p.add(bac);
        p.add(bmod);
        p.add(bmul);
        p.add(bdiv);
        p.add(bdot);
        p.add(bback);
        

    }
}

public class Cal 
{
    public static void main(String[] args) {
        myframe fr = new myframe();
        fr.setVisible(true);
        fr.setSize(340, 370);

    }
}