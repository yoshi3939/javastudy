public class MainAns{
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args){
    int a = add(100, 10);
    System.out.println(a);
    System.out.println(add(100, -20));   
  }
}