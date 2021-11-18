public class HW1 {  

    public static void main(String[] args) { 
    
        printThreeWords();
        checkSumSign();
        compareNumbers();
         printColor();

    }
    
    public static void printThreeWords(){
        System.out.println ("Orange\n"+"Banana\n"+"Apple\n");
    }
    public static void checkSumSign() {
        int a=-10;
        int b=1;
        int c=a+b;
        
        if (c >= 0) {
            System.out.println( "Сумма положительная" );
        } else {
            System.out.println( "Сумма отрицательная");
        }
    }
    public static void compareNumbers() {
        int a=10;
        int b=1;
        int c=a+b;
        
        if (a >= b) {
            System.out.println( "a >= b" );
        } else {
            System.out.println( "a < b");
        }
     }
     
    public static void printColor() {
        int value = -6 ;
        
        
        if (value <= 0) {
            System.out.println( "Красный" );
        } 
        if (value > 0 && value <= 100 ) {
            System.out.println( "Желтый");
        }
        if (value > 100 ) {
            System.out.println( "Зеленый");
        }
        
    }
    
}