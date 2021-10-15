/* switch文による条件分岐 */
// 信号機
class Signal {
  public static void main(String[] args) {
    String signal = "黃";
    switch (signal) {
      // 赤ならとまれ
      case "赤":
        System.out.println("止まれ");
        break;
      // 黃なら注意して進め
      case "黃":
        System.out.println("注意して進め");
        break;
      // 青か緑なら進め
      // 複数条件も指定可能
      case "青":
      case "緑":
        System.out.println("進め");
        break;
      // どれにも該当しない場合
      default:
        System.out.println("色の種類が不正です。");
        break;
    }
  }
}