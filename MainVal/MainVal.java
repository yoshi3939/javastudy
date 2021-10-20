class Test {
  public void method(String... val) {
    String size = "";
    size += val == null ? "" : val.length;
    System.out.println(val + " : " + size); 
  }
}
public class MainVal {
  public static void main(String[] args){
    Test obj = new Test();
    obj.method("A", "B");
    obj.method((String[])null);
    obj.method();
    obj.method((String)null);
  }
}