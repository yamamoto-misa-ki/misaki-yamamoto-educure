public class Main5 {
    public static void main(String[] args) {
        // 1. 各商品の小計を計算
        int note = 280 * 3;
        int pencil = 120 * 5;
        int eraser = 100 * 2;
        
        // 全商品の合計（小計）
        int subtotal = note + pencil + eraser;

        // 2. 消費税10%を計算（小数点以下切り捨て）
        int tax = (int)(subtotal * 0.1);

        // 3. 合計金額を計算
        int totalAmount = subtotal + tax;

        // 4. おつりを計算（支払額 2000円）
        int payment = 2000;
        int change = payment - totalAmount;

        // 5. 結果を表示
        System.out.println("小計 : " + subtotal + "円");
        System.out.println("消費税 : " + tax + "円");
        System.out.println("合計金額 : " + totalAmount + "円");
        System.out.println("おつり : " + change + "円");
    }
}