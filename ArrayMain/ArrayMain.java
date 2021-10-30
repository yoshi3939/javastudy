public class ArrayMain {
  public static void incArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void calcTriangle(double bottom, double height) {
    double area = bottom * height / 2;
    System.out.println(area);
  }
  public static double calcCircle(double radius) {
    double circle = radius * radius * 3.14;
    return circle;
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for(int i : array) {
      System.out.println(i);
    }
    double bottom = 10.0;
    double height = 5.0;
    calcTriangle(bottom, height);
    double circ = calcCircle(5.0);
    System.out.println(circ);
  }
}