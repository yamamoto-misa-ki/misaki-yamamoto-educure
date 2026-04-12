import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 攻撃力と防御力を入力
        System.out.print("攻撃力を入力してください：");
        int attack = Integer.parseInt(scanner.next());

        System.out.print("防御力を入力してください：");
        int defense = Integer.parseInt(scanner.next());

        // 2. 通常ダメージを計算
        int normalDamage = attack - defense;

        // 3. クリティカルダメージを計算 (1.5倍してキャスト)
        int criticalDamage = (int)(normalDamage * 1.5);

        // 4. 両方のダメージを表示
        System.out.println("通常ダメージ：" + normalDamage);
        System.out.println("クリティカルダメージ：" + criticalDamage);

        scanner.close();
    }
}
