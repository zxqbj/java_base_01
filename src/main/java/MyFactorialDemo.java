public class MyFactorialDemo {
    public static void main(String[] args) {
        // 递归函数调用
        int num = 100;
        int sum = factorialSumMethod(num);
        System.out.println(sum);

    }

    // 计算从0到输入值之间的总和
    private static int factorialSumMethod(int num) {
        // 首先定义个数组
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
