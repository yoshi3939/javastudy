import java.util.*;

public class MainAct {
  static int mp = 10;
  final int Max_MP = 10;

  public void pray(int sec) {
    int recovery = new Random().nextInt(3) + sec;
    int recoveryActual = Math.min(this.Max_MP - this.mp, recovery);
    this.mp += recoveryActual;
    System.out.println("MPが" + recoveryActual + "回復した");
  }
}