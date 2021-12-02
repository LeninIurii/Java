/**
*Java 7 HW7 
*@author Iurii Lenin
*@version 25.11.2021
**/


class HW7 {
    public static void main(String[] args) {
   
  Cat[] cat = {
        new Cat("Bars", 49, "Голоден"),
        new Cat("Puhok", 49,"Голоден"),
        new Cat("Nopel", 1,"Голоден"),
        new Cat("Pops", 0,"Голоден")
    };        
   
   
        Plate plate = new Plate(100);
        
       
            System.out.println(plate);
        for(Cat catamo : cat) {
            //int apet = catamo.getAppetit();
          // System.out.println(apet); // System.out.println(getAppetit(catamo));
            catamo.eat(plate);
            System.out.println(catamo);
        };
        
        System.out.println(plate);
       
    
    }
}

class Cat {
   private String name;
   private int appetite; 
    private String fullnes;
    
    Cat(String name, int appetite, String fullnes) {
        this.name = name;
        this.appetite = appetite;
        this.fullnes = fullnes;
    }
    
   public int getAppetit() {
        return appetite;
    }
    
    public String getFullnes() {
        return fullnes;
    }
    
    public void setFullnes(String fullnes) {
       
       this.fullnes = fullnes;
        
    }
    
    
     void eat(Plate plate) {    // Вопрос как реализовать такой метод ?
         //int ap = getAppetit();
         //int pl = Plate.getFood();
        // Plate pp = new Plate(); 
         // int c = pp.getFood();
          int c = ((Plate.getFood()) - (getAppetit()));
           if( c > 0) {
        plate.decreaseFood(appetite);
             setFullnes("Поел");      //значение этого метода полю fullnes
           } else setFullnes("Все ещё худыш и хочет есть");        //значение этого метода полю fullnes
    }
    
    @Override
    public String toString() {
        return "Cat: " + name + ", apetit: " + appetite + ", fullnes: " + fullnes;
    }
    
}

class Plate {
   private int food;
    
    Plate(int food) {
        this.food = food;
    }
    
   //int addFood(int food) {
     //   this.food = food;
        //return food;
    //}
  public int getFood() {
        return food;
   }
    
   // void setFood(int food) {
      //  this.food = food;
    //}
    
    
    void  decreaseFood(int food) {  //если не уеньшилось число еды в тарелке то фалс 
         if(getFood() > 0) {
         this.food -= food;
         } 
             //возвр лог значение (удалось уменьшить кол-во еды или нет 
        }       
    
    @Override
    public String toString() {
        return "Plate: " + food;
    }
}