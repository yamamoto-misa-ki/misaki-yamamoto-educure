public class Main7 {
    public static void main(String[] args) {
        int key = 2;         // 押したキー番号
        int pressCount = 2;  // 押下回数

        // 1. まず「どのキーか」で分ける
        switch (key) {
            case 1:
                // キー1の中での回数分岐
                switch (pressCount) {
                    case 1: System.out.println("A"); break;
                    case 2: System.out.println("B"); break;
                    default: System.out.println("C"); break;
                }
                break; // キー1の処理おわり

            case 2:
                // キー2の中での回数分岐
                switch (pressCount) {
                    case 1: System.out.println("D"); break;
                    case 2: System.out.println("E"); break;
                    default: System.out.println("F"); break;
                }
                break; // キー2の処理おわり

            default:
                // 1, 2以外のキー
                System.out.println("Invalid key");
                break;
        }
    }
}