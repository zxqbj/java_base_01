public class MyBinarySearchDemo {
    public static void main(String[] args) {

        // 二分查找的逻辑
        /**
         * 1.首先定义数据，数组必须是连续的从小到大的正数
         * 2.根据数据下标找到对应的元素
         *
         * min的值必选小于Max的值
         */

        int[] binaryArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 根据输入的数值
        int targetNum = 20;
        int number = searchMidNumber(targetNum, binaryArr);

        System.out.println(number);
    }

    private static int searchMidNumber(int number, int[] arr) {

        // 关键要素点，找到最大值与最小值，并计算中间值
        /**
         * 分三种情况进行获取
         */
        //
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid =( min + max ) >> 1;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


