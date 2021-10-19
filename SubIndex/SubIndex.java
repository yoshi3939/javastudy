public class SubIndex {
  public static void main(String[] args) {
    String s = "this is no";
    int i = s.indexOf("is");
    s = s.substring(i);
    i = s.indexOf("is");
    System.out.println(s + i);
  }
}