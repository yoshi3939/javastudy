import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {
  public static void main(String[] args) throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy年MM/dd mm");
    Date d = f.parse("2020年09/22 01");
    System.out.println(d);
    String a = f.format(d);
    System.out.println(a);
    Date now = new Date();
    String s = f.format(now);
    System.out.println("現在は" + s + "です");
  }
}