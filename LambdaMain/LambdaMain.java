public class LambdaMain{
  public static void main(String[] args){
    Runnable r = () -> {
      int cnt = 0;
      for (cnt = 0; cnt < 10; cnt++){
        System.out.print(cnt++);
      }
    };
    new Thread(r).start();
  }
}