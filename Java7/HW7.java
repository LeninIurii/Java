/**
*Java 7 HW7 
*@author Iurii Lenin
*@version 05.12.2021
**/


class HW7 {
    public static void main(String[] args) {
   
        Cat[] cat = {
            new Cat("Bars", 99, "Голоден"),
            new Cat("Puhok", 49,"Голоден"),
            new Cat("Nopel", 1,"Голоден"),
            new Cat("Pops", 2,"Голоден")
        };        
            Plate plate = new Plate(100);
            System.out.println(plate);
        
            for(Cat catamo : cat) {
                catamo.eat(plate);
                System.out.println(catamo);
            };
            System.out.println("Осталось еды после того как коты поели\n" + plate);
            plate.setFood(50);
            System.out.println("Добавили еды для новых котков:" + plate.getFood() + "\n Колличество еды в тарелке для новых котят\n" + plate);
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
                if( c >= 0) {
                plate.decreaseFood(appetite);
                setFullnes("Поел!");     
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
            this.food = food;
        }
   
        void  decreaseFood(int food) {
            if(getFood() > 0) {
                this.food -= food;
            }
        }
    
        @Override
            public String toString() {
                return "Plate: " + food;
            }
}