// インタフェースの作成
interface Calc {
    int NUM1 = 1;
    int NUM2 = 2;
 
    default public void calc() {
        System.out.println(NUM1 + NUM2);
    }
}
 
// インタフェースを実装し、足し算するクラスを作成
class Add implements Calc {
    // オーバーライドしないので何も記述しない
}
 
// インタフェースを実装し、引き算するクラスを作成
class Sub implements Calc {
    public void calc() {
        System.out.println(NUM1 - NUM2);
    }
}
 
// インターフェースを実装したクラスを実行するクラスを作成
public class MainDef {
    public static void main(String[] args) {
        Add add = new Add();
        add.calc();
 
        Sub sub = new Sub();
        sub.calc();
    }
}