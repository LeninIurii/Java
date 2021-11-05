public class checkSumSign {  

    public static void main(String[] args) { 
    
        checkSumSign();
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

 }  