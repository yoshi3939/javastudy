import java.util.*;

public class ScanMain {
  public static void main(String[] args) {
    String name = new java.util.Scanner(System.in).nextLine();
    int age =new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ" + age + "歳の" + name + "さん");
    int r = new java.util.Random().nextInt(7);
    String a = "-３０";
    int n = Integer.parseInt(a);
    System.out.println(r + a);
  }
} 