public class ArgsMain {
  public static void main(String[] args) {
    char[][] ary = {{'a','b'},{'e','f'}};
    for(char[] ar : ary){
      for(char c : ar){
        System.out.print(c);
      }
      System.out.print(" ");
    }
  }
}