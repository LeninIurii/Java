/**
Java 1 HW2 
@author Iurii Lenin
@version 06.11.2021
*/
public class HW2 {  

    public static void main(String[] args) {
    
        System.out.println(Ex1TwoIntegers(9,5));
        System.out.println(Ex2PositiveOrNegative(-1));
        System.out.println(Ex3PositiveOrNegative(1));
        System.out.println(Ex4StringAndNumber(2,"hello world"));
        System.out.println(Ex5Year(2020));
    }
    static String Ex1TwoIntegers(int a, int d) {
        return (a + d > 10 && a + d <= 20? "true" : "false");
        }
    static String Ex2PositiveOrNegative(int a) {
        return (a >= 0? "Positive number" : "Negative number");
        }
    static boolean Ex3PositiveOrNegative(int a) {
        return (a < 0);
    }
    static String Ex4StringAndNumber(int a, String b) {
        for (int i = 1; i < a; i++) {
            System.out.println(b);
        }
        return b;
    }
    static boolean Ex5Year(int a) {
        int b=a%4;
        int c=a%400;
        int d=a%100;
        if (b == 0 || c == 0 && d != 0) {
            return true;
        } else {
            return false;
        }
    }
    }