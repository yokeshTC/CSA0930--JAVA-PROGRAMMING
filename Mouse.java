import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse {
    public static void main(String[] args) {
        Mouse a = new Mouse();
    }

    public Mouse() {
        Frame d = new Frame("Mouse Event Listener");
        TextArea s = new TextArea("");
        d.add(s);
        s.addMouseListener(new U515Mouse());
        d.setSize(200, 200);
        d.setVisible(true);
    }

    public static class U515Mouse implements MouseListener {
        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("MousePressed");
            int x = e.getX();
            int y = e.getY();
            System.out.println("X=" + x + " Y=" + y);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("MouseReleased");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("MouseEntered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("MouseExited");
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("MouseClicked");
        }
    }
}
