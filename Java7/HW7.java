/**
*Java 7 HW7 
*@author Iurii Lenin
*@version 21.12.2021
**/


class HW7 {
    public static void main(String[] args) {
        int Eda = 100;
        int plusEda = 60;
   
  Cat[] cat = {
        new Cat("Bars", 60, "Голоден"),
        new Cat("Puhok", 49,"Голоден"),
        new Cat("Nopel", 25,"Голоден"),
        new Cat("Pops", 21,"Голоден")
    };
        Plate plate = new Plate(Eda);
        System.out.println("Еды в тарелке до того как коты поели \n" + plate);
        
        for(Cat catamo : cat) {
             catamo.eat(plate);
            System.out.println(catamo);
        };
        
        System.out.println("Еды в тарелке после того как коты поели \n" + plate);
        plate.setFood(plusEda);
        System.out.println("Добавим " + plusEda + " еды в тарелку \n" + "Колличество еды посе добавления \n" + plate);
    
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
    
     void eat(Plate plate) {    
          int c = ((plate.getFood()) - (getAppetit()));
           if( c > 0) {
        plate.decreaseFood(appetite);
             setFullnes("Поел");      
           } else setFullnes("Все ещё худыш и хочет есть");
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

  public int getFood() {
        return food;
   }

    public void setFood(int food) {
       this.food += food;
    }

    void  decreaseFood(int food) {  
         if(getFood() > 0) {
         this.food -= food;
         }
    }
    
    @Override
    public String toString() {
        return " Plate:" + food;
    }
}