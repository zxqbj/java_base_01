public class MyFactorialDemo1 {
    public static void main(String[] args) {
        // 递归函数计算阶乘
        int num = 6;
        int sum = jcMethod(num);
        System.out.println(sum);

    }

    // 计算从0到输入值之间的总和
    private static int jcMethod(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * jcMethod(num - 1);
        }
    }
}
