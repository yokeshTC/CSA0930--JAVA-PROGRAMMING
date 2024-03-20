public class thread {
    public static void main(String[] args) {
        Thread thread1 = new NumberPrinter(1, 10);
        Thread thread2 = new NumberPrinter(11, 20);
        Thread thread3 = new NumberPrinter(21, 30);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class NumberPrinter extends Thread {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}