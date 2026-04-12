public class Main2 {
    public static void main(String[] args) {
        // 1. 定価と割引率を設定
        int price = 2500;
        double discountRate = 0.2; // 20%のこと

        // 2. 割引額を計算 (定価 × 割引率)
        // (int)をつけるのは、計算結果を整数に整えるためです
        int discountAmount = (int)(price * discountRate);

        // 3. 販売価格を計算 (定価 - 割引額)
        int salesPrice = price - discountAmount;

        // 4. 結果を表示
        System.out.println("割引額：" + discountAmount + "円");
        System.out.println("販売価格：" + salesPrice + "円");
    }
}