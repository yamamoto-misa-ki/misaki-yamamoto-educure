public class Main4 {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        // 1. まず三角形として成立するかチェック
        // (2辺の合計がもう1辺より大きくないと図形にならない)
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("三角形ではない");

        } else if (side1 == side2 && side2 == side3) {
            // すべての辺が等しい
            System.out.println("正三角形");

        } else {
            // 直角かどうかを判定するための準備（a*a + b*b = c*c）
            boolean isRight = (side1 * side1 + side2 * side2 == side3 * side3) ||
                             (side1 * side1 + side3 * side3 == side2 * side2) ||
                             (side2 * side2 + side3 * side3 == side1 * side1);

            // 2辺が等しいかどうか
            boolean isIsosceles = (side1 == side2 || side1 == side3 || side2 == side3);

            if (isRight && isIsosceles) {
                System.out.println("直角二等辺三角形");
            } else if (isIsosceles) {
                System.out.println("二等辺三角形");
            } else if (isRight) {
                System.out.println("直角三角形");
            } else {
                System.out.println("不等辺三角形");
            }
        }
    }
}