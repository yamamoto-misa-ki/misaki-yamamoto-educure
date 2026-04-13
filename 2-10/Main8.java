public class Main8 {
    public static void main(String[] args) {
        int score = 85;

        // 1. 十の位を取り出す (例: 85 / 10 = 8)
        // 100点の場合は 10 になります
        switch (score / 10) {
            case 10:
            case 9:
                // 100点(10)と90点代(9)は A
                System.out.println("A");
                break;
            case 8:
                // 80点代
                System.out.println("B");
                break;
            case 7:
                // 70点代
                System.out.println("C");
                break;
            case 6:
                // 60点代
                System.out.println("D");
                break;
            default:
                // それ以外 (59点以下やマイナスなど)
                System.out.println("F");
                break;
        }
    }
}