package org.java.test;

public class Operation {

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );


        byte byteValue = 42;
        int intValue = 123456;
        short shortValue = 32767;
        long longValue = 9876543210L;

        // 转换为二进制
        String byteBinary = Integer.toBinaryString(byteValue & 0xFF);
        String intBinary = Integer.toBinaryString(intValue);
        String shortBinary = Integer.toBinaryString(shortValue & 0xFFFF);
        String longBinary = Long.toBinaryString(longValue);

        // 输出结果
        System.out.println("Byte to Binary: " + byteBinary);
        System.out.println("Int to Binary: " + intBinary);
        System.out.println("Short to Binary: " + shortBinary);
        System.out.println("Long to Binary: " + longBinary);
    }
}
