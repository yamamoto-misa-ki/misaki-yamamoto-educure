import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // キーボード入力を受け取る準備
        Scanner scanner = new Scanner(System.in);

        // 1. 経験値を入力
        System.out.print("現在の経験値を入力してください：");
        String input = scanner.next();

        // 文字列を数字(int)に変換
        int exp = Integer.parseInt(input);

        // 2. ボーナス経験値25%増加（切り捨て）
        int bonusExp = (int)(exp * 1.25);

        // 3. 表示
        System.out.println("ボーナス後の経験値： " + bonusExp);
        
        scanner.close();
    }
}