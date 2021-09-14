package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/14 14:29
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        /*for (i = 100; i < 1000; i++) {
            if (fun(i)) {
                System.out.println(i);
            } else {
                continue;
            }
        }*/
        int num = 153;
        if (fun(num)) {
            System.out.println(num);
        }

    }
    public static boolean fun (int num) {
        int ans = 0;
        while (num != 0) {
            int temp = num % 10;
            ans += Math.pow(temp, 3);
            num /= 10;
        }
        if (ans == num) {
            return true;
        } else {
            return false;
        }
        select avg(score.math + score.chinese + score.english) from student, score where student.id = score.id group by student.id
    }
    create index
}
