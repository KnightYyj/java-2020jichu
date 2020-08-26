package java0825.com.yoga.java.demo.array;

public class Demo1 {

    //快捷生成main方法 psvm (回车)
    public static void main(String[] args) {
        //创建数组   数据类型 数组名[] =new 数据类型[长度];
        //2.动态创建
        int[] num = new int[5];
        num[3] =100;
        num[1] =20;

        int first = num[0];
        //输出快捷键 sout
        System.out.println(first);
        //1.静态创建
        int[] nums = new int[]{11,3,2,31,42};
        //简单写法
        int[] ages = {1,2,3,4,5};
        System.out.println(nums.length);

        //遍历数组  快捷键 nums.fori
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        //foreach 快捷键nums.for
        for (int i : nums) {
            System.out.println(i);
        }


        //二维数组
        int[][] table = new int[3][3];
        table[0][0] =10;
        table[0][1] =20;
        table[0][2] =30;
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        //table[0][4] =10;
        int[][] table1 = {{1,2,3},{2,3,4},{2,2}};
        //二维数组遍历
        for (int[] els : table1) {
            for (int el : els) {
                System.out.print(el+"\t");
            }
            System.out.println();
        }

    }
}