public class AlgoMain {
  public static void main(String[] args){
    Algorithm algorithm = (name) -> {
      System.out.println("hello, " + name);
    };
    Service s = new Service();
    s.setLogic(algorithm);
    s.doProcess("Lambda");
  }
}