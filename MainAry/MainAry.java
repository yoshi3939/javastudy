public class MainAry {
  public static void main(String[] args) {
    String[][] ary = {{"a"}, {"b", "c", "d"}};
    System.out.print(ary.length);
    System.out.print(ary[1][2]);
    for(int i = 0; i < ary.length; i++){
      for(int j = 0; j < ary[i].length; j++){
        System.out.print(ary[i].length);      
        System.out.print(ary[i][j] + " ");
      }
      System.out.println();
    }
  }
}