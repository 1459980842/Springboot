package com.example.demo.business.算法.初级;

import org.apache.commons.lang3.StringUtils;

//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//        回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
//
//         
//
//        示例 1：
//
//        输入：x = 121
//        输出：true
//        示例 2：
//
//        输入：x = -121
//        输出：false
//        解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//        示例 3：
//
//        输入：x = 10
//        输出：false
//        解释：从右向左读, 为 01 。因此它不是一个回文数。
//        示例 4：
//
//        输入：x = -101
//        输出：false
//
public class 回文数 {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String newString = "";
        String xString = String.valueOf(x);
        char[] xArray = xString.toCharArray();
        for (int i = xArray.length - 1; i >= 0; i--) {
            newString += xArray[i];
        }
        System.out.println(newString);
        if (xString.equals(newString)) {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        回文数 hui = new 回文数();
        hui.isPalindrome(1234321);
    }



}
