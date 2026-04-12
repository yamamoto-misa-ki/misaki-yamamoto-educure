public class Main3 {
    public static void main(String[] args) {
        // 1. 攻撃力と防御力を設定
        int attack = 15;
        int defense = 5;

        // 2. ダメージを計算
        // (攻撃力 * 2 - 防御力) / 3
        // 整数同士の計算なので、小数点以下は自動的に切り捨てられます
        int damage = (attack * 2 - defense) / 3;

        // 3. 結果を表示
        System.out.println("与えるダメージ：" + damage);
    }
}
