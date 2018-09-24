public class PingPongComp implements Runnable {
    Thread t;
    private boolean isShoot;

    PingPongComp() {
        t = new Thread(this, "Computer");
        isShoot = false;
        System.out.println(t.getName() + " starts the game.");
        t.start();
    }

    public void setShoot(boolean shoot) {
        isShoot = shoot;
    }

    public void run() {
        try {
            do {
                System.out.println("BOOM!");
                isShoot = false;
                Thread.sleep(2000);
            } while (isShoot);
        } catch (InterruptedException e) {
            System.out.println("Computer thread interrupted.");
        }
        System.out.println("Computer win!");
    }
}
