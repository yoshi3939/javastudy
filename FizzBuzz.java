/**
* 1から100までの数値を標準出力に表示する。ただし、
* 3の倍数なら数値の代わりに Fizz
* 5の倍数なら数値の代わりに Buzz
* 3の倍数かつ5の倍数なら数値の代わりに FizzBuzzを出力する。
*/
class FizzBuzz {
  public static void main(String[] args){
    for (int i = 1; i <= 100; i++) {
      if (i % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}