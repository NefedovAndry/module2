import java.util.Scanner;

public class PingPong {
    public static void main(String[] args) {
        PingPongComp comp = new PingPongComp();

        Scanner scan = new Scanner(System.in);
        String boo;
        while (comp.t.isAlive()) {
            boo = scan.nextLine();
            if (boo != null && comp.t.isAlive()) {
                System.out.println("BANG!");
                comp.setShoot(true);
            }
        }
        System.out.println("GAME OVER");
    }
}
