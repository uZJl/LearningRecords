import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/7 19:58
 * 题目描述：
 * X星理工大学新学期开学典礼正在X星理工大学体育馆隆重举行，小小X作为新生代表坐上了主席台。
 * 在无比骄傲的同时，看到下面坐着的黑压压的人群，小小X想到了这么一个问题： 作为一所理工大学，
 * 女生真的很少。俗话说，红花还需绿叶衬。假设所有参加开学典礼的同学坐成一个 m 行 n 列的矩阵，
 * 其中男生用“M”表示，女生用“F”表示。如果一个女生的旁边8个方位（前、后、左、右以及左前、右前、
 * 左后、右后）坐着另外一个女生，那么她们属于“同一朵红花”。 现在给出一个用于表示男生和女生就坐
 * 情况的字符矩阵，请编写一个程序统计在该字符矩阵中一共有多少朵“红花”？
 * 输入描述
 * 单组输入。 第1行输入两个正整数m和n，分别表示字符矩阵的行和列的数量（1<=m, n<=1000），二者之间用空格隔开。 第2行到第m+1行，每行n列，对应一个仅包含“M”和“F”两种字符的字符矩阵，表示男生和女生就坐情况。
 *
 * 输出描述
 * 输出在字符矩阵中包含的“红花”数量。
 *
 *
 * 样例输入
 5 5
 MMFMM
 MMMMM
 MMFFM
 MMFMM
 MMMMF
 * 样例输出
 * 3
 */
public class Main1 {
    public static int[][] op = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static char[][] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int m = Integer.parseInt(nums[0]);
        int n = Integer.parseInt(nums[1]);
        char[][] board = new char[m][n];
        for (int i = 0; i < m; i++) {
            board[i] = scanner.next().toCharArray();
        }
        arr = board;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'F') {
                    count++;
                    fun(i, j);
                }
            }
        }
        System.out.println(count);
    }
    public static void fun (int x, int y) {
        for (int i = 0; i < op.length; i++) {
            int opX = x + op[i][0];
            int opY = y + op[i][1];
            if (opX >= 0 && opX < arr.length && opY >= 0 && opY < arr[0].length) {
                if (arr[opX][opY] == 'F') {
                    arr[opX][opY] = 'M';
                }
            }
        }
    }
}
