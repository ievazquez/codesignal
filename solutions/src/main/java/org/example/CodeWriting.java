package org.example;

public class CodeWriting {
    public int solution(int n) {
        int area = 0;
        int num = n * 2 - 1;
        for( int i = num  ; i >= 1; i -= 2) {
            System.out.println("i "+i);
            if ( i == num ) {
                area += i;
            } else {
                area += i * 2;
            }
        }
        return area;
    }
public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
