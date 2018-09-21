public class PingPongComp implements Runnable {
    Thread t;
    PingPongUser bang;

    public PingPongComp() {
        t = new Thread(this, "Computer");
        t.start();
    }

    @Override
    public void run() {
        try {
//            while ()
            System.out.println("BOOM!");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Computer thread interrupted.");
        }
    }
}
