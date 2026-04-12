public class Main4 {
    public static void main(String[] args) {
        // 1. 100gあたりの価格と、購入量(g)を設定
        int pricePer100g = 138;
        double amount = 315.8;

        // 2. 合計金額を計算
        // (100gあたりの価格 / 100.0) で1gあたりの単価を出してから、グラム数をかけます
        double totalPrice = (pricePer100g / 100.0) * amount;

        // 3. 小数点以下を切り捨てて整数にする（キャスト）
        int finalPrice = (int)totalPrice;

        // 4. 結果を表示
        System.out.println("合計金額：" + finalPrice + "円です");
    }
}