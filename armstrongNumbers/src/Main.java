import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Armstrong Number Finder");

JLabel l1= new JLabel("Please enter number:");
        l1.setBounds(100,80,200,30);

        JTextField t = new JTextField();
        t.setBounds(95,100,200,30);

        JLabel l2= new JLabel("Result:");
        l2.setBounds(100,120,200,30);

        JTextField t1 = new JTextField();
        t1.setBounds(95,140,200,30);

        JButton btn = new JButton("find");
        btn.setBounds(160,180,60,40);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(t.getText());
                int a = number/100;
                int b= number/10%10 ;
                int c = number%10;
                if (number==a*a*a || number==(a*a*a)+(b*b*b) || number==(a*a*a)+(b*b*b)+(c*c*c)){
       t1.setText("It is armstrong number");
                }else  t1.setText("It is not armstrong number");

            }
        });


f.add(l1);
f.add(t);
f.add(l2);
f.add(t1);
f.add(btn);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }

}