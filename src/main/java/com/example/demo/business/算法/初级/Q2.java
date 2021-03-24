package com.example.demo.business.算法.初级;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 */

public class Q2 {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int a = x % 10;
            if (result > 214748364 || (result == 214748364 && a > 7)) {
                return 0;
            }
            if (result < -214748364 || (result == -214748364 && a < -8)) {
                return 0;
            }
            result = result * 10 + a;
            x = x / 10;
        }
        return result;

    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        System.out.println(q2.reverse(223));
        System.out.println(q2.reverse(-234));
        System.out.println(q2.reverse(-230));
        System.out.println(q2.reverse(230));
        System.out.println(q2.reverse(1147483649));
    }
}



