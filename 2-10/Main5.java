public class Main5 {
    public static void main(String[] args) {
        // 1. 選択肢を設定（1〜3、またはそれ以外に変えてみてね）
        int selection = 1;

        // 2. switch文で分岐
        switch (selection) {
            case 1:
                System.out.println("コーヒーを選びました");
                break; // ここで脱出！
            case 2:
                System.out.println("紅茶を選びました");
                break;
            case 3:
                System.out.println("ジュースを選びました");
                break;
            default:
                // 1, 2, 3以外のとき
                System.out.println("無効な選択です");
                break;
        }
    }
}
