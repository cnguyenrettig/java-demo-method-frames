// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DisplayNameFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel lastname;
    private JTextField tlastname;

    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JLabel returnValue;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    // constructor, to initialize the components
    // with default values.
    public DisplayNameFrame()
    {
        setTitle("displayName Method");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("void displayName(String firstName, String lastName)");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setSize(650, 30);
        title.setLocation(150, 30);
        c.add(title);

        name = new JLabel("firstName");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(300, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 20));
        tname.setSize(190, 20);
        tname.setLocation(300, 100);
        c.add(tname);

        lastname = new JLabel("lastName");
        lastname.setFont(new Font("Arial", Font.PLAIN, 20));
        lastname.setSize(300, 20);
        lastname.setLocation(100, 150);
        c.add(lastname);

        tlastname = new JTextField();
        tlastname.setFont(new Font("Arial", Font.PLAIN, 20));
        tlastname.setSize(190, 20);
        tlastname.setLocation(300, 150);
        c.add(tlastname);


        sub = new JButton("Call Method");
        sub.setFont(new Font("Arial", Font.PLAIN, 20));
        sub.setSize(200, 40);
        sub.setLocation(250, 200);
        sub.addActionListener(this);
        c.add(sub);
/*
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);*/

        returnValue = new JLabel("return");
        returnValue.setFont(new Font("Arial", Font.PLAIN, 20));
        returnValue.setSize(300, 20);
        returnValue.setLocation(100, 300);
        c.add(returnValue);


        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 200);
        tout.setLocation(100, 350);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);


        res = new JLabel("terminal:");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(200, 25);
        res.setLocation(500, 300);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setBackground(Color.BLACK);
        resadd.setForeground(Color.WHITE);
        resadd.setSize(300, 200);
        resadd.setLocation(500, 350);
        resadd.setLineWrap(true);
        c.add(resadd);


        setVisible(true);
    }

    public String displayName(String firstName, String lastName){

        return "HELLO! MY NAME IS: " +  firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                String nameData = tname.getText();
                String lastNameData = tlastname.getText();


                resadd.setText(this.displayName(nameData,lastNameData));

                tout.setEditable(false);


        }


        if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tlastname.setText(def);
            res.setText(def);
            resadd.setText(def);
        }
    }
}

// Driver Code
class DisplayName {

    public static void main(String[] args) throws Exception
    {
        DisplayNameFrame f = new DisplayNameFrame();
    }
}
