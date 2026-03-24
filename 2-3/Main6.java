public class Main6 {
    public static void main(String[] args) {
        // 1. 変数priceを宣言し、1000で初期化する
        int price = 1000;
        
        // 2. 更新前の価格を表示する
        System.out.println("更新前の価格： " + price + "円");
        
        // 3. 変数priceに1200を再代入する（型名は書かないのがポイント）
        price = 1200; 
        
        // 4. 更新後の価格を表示する
        System.out.println("更新後の価格： " + price + "円");
    }
}
