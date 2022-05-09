// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CountLetterFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel sentence;
    private JTextField tsentence;
    private JLabel letter;
    private JTextField tletter;

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
    public CountLetterFrame()
    {
        setTitle("countLetter Method");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("int countLetter(String sentence, String letter)");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setSize(650, 30);
        title.setLocation(150, 30);
        c.add(title);

        sentence = new JLabel("sentence");
        sentence.setFont(new Font("Arial", Font.PLAIN, 20));
        sentence.setSize(300, 30);
        sentence.setLocation(100, 100);
        c.add(sentence);

        tsentence = new JTextField();
        tsentence.setFont(new Font("Arial", Font.PLAIN, 20));
        tsentence.setSize(250, 30);
        tsentence.setLocation(300, 100);
        c.add(tsentence);


        letter = new JLabel("letter");
        letter.setFont(new Font("Arial", Font.PLAIN, 20));
        letter.setSize(300, 30);
        letter.setLocation(100, 150);
        c.add(letter);

        tletter = new JTextField();
        tletter.setFont(new Font("Arial", Font.PLAIN, 20));
        tletter.setSize(190, 30);
        tletter.setLocation(300, 150);
        c.add(tletter);



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
        returnValue.setLocation(250, 300);
        c.add(returnValue);


        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 20));
        tout.setSize(300, 200);
        tout.setLocation(250, 350);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

/*
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
*/

        setVisible(true);
    }

    public int[] createIntArray(String inputStr){
        //clean string - remove curly braces
        String cleanStr = inputStr.replaceAll("\\{", "").replaceAll("}","");
        String[] tempStrArray = cleanStr.split(",");

        //loop and convert to int array
        int[] intArray = new int[tempStrArray.length];

        for (int i = 0; i <tempStrArray.length ; i++) {
            intArray[i] = Integer.valueOf(tempStrArray[i]);
        }
        return intArray;
    }

    public int addIntegerArray(int[] inputArray){
        int sum = 0;
        //loop and add all elements in array
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;

    }

    public int countLetter(String sentence, String letter){
        int count = 0;
        String[] sentenceArray = sentence.split("");
        for (String currentLetter : sentenceArray) {
            if(currentLetter.equals(letter)){
                count +=1;
            }
        }

        return count;
    }
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                String sentence = tsentence.getText();
                String letter = tletter.getText();

                tout.setText(String.valueOf(this.countLetter(sentence, letter)));

                tout.setEditable(false);
                res.setText("Name Formatted..");

        }


        if (e.getSource() == reset) {
            String def = "";
            tsentence.setText(def);
            tletter.setText(def);
            res.setText(def);
            resadd.setText(def);
        }
    }
}

// Driver Code
class CountLetter {

    public static void main(String[] args) throws Exception
    {
        CountLetterFrame f = new CountLetterFrame();
    }
}
