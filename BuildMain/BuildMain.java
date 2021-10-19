public class BuildMain {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("abcd");
    sb.replace(sb.indexOf("b"),sb.indexOf("c"),"q");
    System.out.println(sb);
  }
}