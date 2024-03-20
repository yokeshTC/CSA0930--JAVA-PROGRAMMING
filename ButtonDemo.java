import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonDemo {
    public static void main(String[] args) {
        class MyButtonDemo extends Applet implements ActionListener {
            String msg = "which is the last month ?";
            Button one, two, three, four;
            public void init() {
                one = new Button("Jan");
                two = new Button("Nov");
                three = new Button("Dec");
                four = new Button("Feb");
                add(one);
                add(two);
                add(three);
                add(four);
                one.addActionListener(this);
                two.addActionListener(this);
                three.addActionListener(this);
                four.addActionListener(this);
            }

            public void actionPerformed(ActionEvent ae) {
                String str = ae.getActionCommand();
                switch (str) {
                    case "Jan" -> msg = "Your answer is Jan";
                    case "Nov" -> msg = "Your answer is Nov";
                    case "Dec" -> msg = "Your answer is Dec";
                    case "Feb" -> msg = "Your answer is Feb";
                }
                repaint();
            }
        }
    }
}