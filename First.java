import java.awt.*;
class First{
    public static void main(String args[]){
        First  f=new First ();
    }
    First(){
        Frame f=new Frame();
        Button b=new Button("click me");
        b.setBounds(30,50,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}