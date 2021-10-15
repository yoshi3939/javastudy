/*ifによる条件分岐*/
class Tem{
  public static void main(String[] args){
    //温度
    int temperature = 35;

    //温度が10度以下なら寒い
    if (temperature <= 10) {
      System.out.println("寒いです。");
    //温度が30度以上なら暑い
    } else if (temperature >= 30) {
      System.out.println("暑いです。");
    } else {
      System.out.println("快適です。");
    }
  }
}