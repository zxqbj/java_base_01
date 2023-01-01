public class MyBubbleSortDemo {

    public static void main(String[] args) {
        //冒泡排序，相邻两个元素间比较大小
        //定义数据
        int[] arrNum = {4,8,5,2,3,6,9,7,1,10};

        // 循环遍历
        for (int i = 0; i < arrNum.length-1; i++) {
            for (int j = 0; j < arrNum.length-1-i; j++) {
                if(arrNum[j] > arrNum[j+1]){
                    int tmp = arrNum[j];
                    arrNum[j] = arrNum[j+1];
                    arrNum[j+1] = tmp;
                }
            }
        }
        systemResult(arrNum);
    }

    private static void systemResult(int[] arrNum) {
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i]);
        }
        System.out.println(",");
    }
}
