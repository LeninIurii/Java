/**
*Java 4 HW4 
*@author Iurii Lenin
*@version 19.11.2021
**/

import java.util.Random;
import java.util.Scanner;

class HW4 {
    final char SIGN_X = 'X'; //HUMAN name полей final не меняются и пишуться заклваными 
    final char SIGN_O = 'O'; //AI
    final char SIGN_EMPTY = '.'; 
    char[][] table;
    int tableSize = 3;
    Scanner sc;
    Random random;
    
    
    public static void main(String[] args) {
        new HW4().game(); //деректива new 1.срабатывае автоматом после создания объекта 
                          //2.создает объект и можно сразу вызвать метод через точку
    }
    
    HW4 () {  //  конструктор(не указывается тип возвращаемого значения) , в неём проинициалезируем поля
        table = new char[tableSize][tableSize];
        sc =new Scanner(System.in);
        random = new Random();
    }
    
    void game () { //содержиться игровая логика
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("You won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Soryy No no");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("Ai won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Soryy No no");
                break;
            }
        }
        System.out.println("Game over");
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < tableSize; y++) {
            for (int x = 0; x < tableSize; x++) {
                table[x][y] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < tableSize; y++) {
            for (int x = 0; x < tableSize; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Your turn x y [1..3]:");
            x = sc.nextInt() - 1; //insert numbers
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // повторяется если в (истина) но если ячейка нормм то не нужно повторять , поэтому нужно отрицать 
        table[x][y] = SIGN_X;
    }
    
    void turnAI() {
        int x, y;
        do {
            System.out.println("Your turn AI");
            x = random.nextInt(3); //from 0 to 2  
            y = random.nextInt(3); 
        } while (!isCellValid(x, y)); // повторяется если в (истина) но если ячейка нормм то не нужно повторять , поэтому нужно отрицать 
        table[x][y] = SIGN_O; 
    }
    
    boolean checkWin(char ch) { //проверка победы через фор 
        boolean col1 = true;
        boolean row1 = true;
        for (int y = 0; y < tableSize; y++) {
           boolean col = true;
           boolean row = true;
            for (int x = 0; x < tableSize; x++) {
                   col &= (table[x][y] == ch);  //битовый AND с присвоением
                  row &= (table[y][x] == ch);   // если оставаить запись такой table[y][x] а не table[x][y] все работает 
                }
                if (col || row) return true;
                col1 &= (table[y][y] == ch);
                row1 &= (table[tableSize - y - 1][y] == ch);
            }
      
        if (col1 || row1) return true;
        return false;
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY; // why not x y 
    }
    
    boolean isTableFull() {
        for (int y = 0; y < tableSize; y++) {
            for (int x = 0; x < tableSize; x++) {
                if (table[x][y] == SIGN_EMPTY){
                    return false;
                    }
                }
            }
        return true;
    }
    
}