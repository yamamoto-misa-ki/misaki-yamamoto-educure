public class Main3 {
    public static void main(String[] args) {
        // 1. 月を設定（ここを 1〜13 に変えてテストしてね）
        int month = 4;

        // 2. 季節を判定
        if (month < 1 || month > 12) {
            // 1月より小さい、または12月より大きい場合
            System.out.println("無効な月です");

        } else if (month >= 3 && month <= 5) {
            // 3月以上 かつ 5月以下
            System.out.println("春");

        } else if (month >= 6 && month <= 8) {
            // 6月以上 かつ 8月以下
            System.out.println("夏");

        } else if (month >= 9 && month <= 11) {
            // 9月以上 かつ 11月以下
            System.out.println("秋");

        } else {
            // それ以外（12, 1, 2月）
            System.out.println("冬");
        }
    }
}