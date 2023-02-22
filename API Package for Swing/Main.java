import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.colorchooser.*;

public class Main extends JFrame {
    // Variables declaration
    int n1, n2;
    String op;
    public static void main(String[] args) {
        new Main().display();   //Method calling
    }

    public void display(){

        // Creating Object of JFrame and Container class

        Container c = new Container();

        // Size of the frame to fit in the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame frame = new JFrame("Calculator");
        frame.setSize(screenSize.width, screenSize.height-50);

        //Background Color of a frame
        frame.getContentPane().setBackground(new Color(237, 237, 237));

        JLabel title = new JLabel("Calculator");
        title.setFont(new Font("Courier", Font.PLAIN, 50));

        JTextField jt1 = new JTextField();
        JTextField jt2 = new JTextField();          // Instantiating TextField objects
        JTextField jt3 = new JTextField();

        JLabel jl1 = new JLabel(" = ");         // Instantiating Label objects

        JRadioButton jr1 = new JRadioButton(" + Addition");
        JRadioButton jr2 = new JRadioButton(" - Subtraction");          // Instantiating RadioButton objects
        JRadioButton jr3 = new JRadioButton(" * Multiplication");
        JRadioButton jr4 = new JRadioButton(" / Division");


        ButtonGroup b = new ButtonGroup();
        b.add(jr1);
        b.add(jr2);             // Adding radio-buttons to Button-Group
        b.add(jr3);
        b.add(jr4);

        Box box1 = Box.createVerticalBox();         // To add radio-buttons in vertical manner

        box1.add(jr1);
        box1.add(jr2);
        box1.add(jr3);
        box1.add(jr4);

        title.setBounds(700,1, 500,200);
        jt1.setBounds(500,300,100,50);
        box1.setBounds(620,300,150,100);
        jt2.setBounds(750,300,100,50);
        jl1.setBounds(920,275,100,100);
        jl1.setFont(new Font("Verdana", Font.PLAIN, 15));
        jt3.setBounds(1000,300,100,50);


        c.add(title);
        c.add(jt1);
        c.add(jt2);
        c.add(jt3);
        c.add(box1);            // Adding components to the container
        c.add(jl1);
        frame.add(c);
        frame.setVisible(true);

        // Handling event for radiobutton1
        jr1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {                                                                   // try catch block to throw an exception
                    if(jt1.getText().equals("") || jt2.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Please enter the nos at both the side");
                        jt3.setText("");
                    }else {
                        n1 = Integer.parseInt(jt1.getText());
                        n2 = Integer.parseInt(jt2.getText());
                        op = String.valueOf(n1 + n2);
                        jt3.setText(op);
                    }
                }

                catch (NumberFormatException e2)
                {
                    JOptionPane.showMessageDialog(null, "Enter Integers only");
                    jt3.setText("");
                }
            }
        });

        // Handling event for radiobutton2
        jr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(jt1.getText().equals("") || jt2.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Please enter the nos at both the side");
                        jt3.setText("");
                    }else {
                        n1 = Integer.parseInt(jt1.getText());
                        n2 = Integer.parseInt(jt2.getText());
                        op = String.valueOf(n1 - n2);
                        jt3.setText(op);
                    }
                }

                catch (NumberFormatException e2)
                {
                    JOptionPane.showMessageDialog(null, "Enter Integers only");
                    jt3.setText("");
                }
            }

        });

        // Handling event for radiobutton3
        jr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(jt1.getText().equals("") || jt2.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Please enter the nos at both the side");
                        jt3.setText("");
                    }else {
                        n1 = Integer.parseInt(jt1.getText());
                        n2 = Integer.parseInt(jt2.getText());
                        op = String.valueOf(n1 * n2);
                        jt3.setText(op);
                    }
                }

                catch (NumberFormatException e2)
                {
                    JOptionPane.showMessageDialog(null, "Enter Integers only");
                    jt3.setText("");
                }
            }

        });

        // Handling event for radiobutton4
        jr4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(jt1.getText().equals("") || jt2.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Please enter the nos at both the side");
                        jt3.setText("");
                    }else {
                        n1 = Integer.parseInt(jt1.getText());
                        n2 = Integer.parseInt(jt2.getText());
                        if(n2==0)
                        {
                            int a = n1/n2;
                            String ans = String.valueOf(a);
                            jt3.setText(ans);
                        }
                        else {
                            float a = (float) n1 / (float) n2;
                            String ans = String.valueOf(a);
                            jt3.setText(ans);
                        }


                    }
                }

                catch (NumberFormatException e2)
                {
                    JOptionPane.showMessageDialog(null,"Enter Integers only");
                    jt3.setText("");
                }
                catch (ArithmeticException e2)
                {
                    JOptionPane.showMessageDialog(null, "Division by 0 is not allowed");
                    jt3.setText("");
                }
            }

        });

    }

}


