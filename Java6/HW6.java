/**
*Java 6 HW6 
*@author Iurii Lenin
*@version 22.11.2021
**/


class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsir");
        Dog dog = new Dog("Sharik");

        IAnimal[] animals = {cat, dog};
        for(IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(10)+ animal.swim(500));
        }
        
        
    }
   
}

interface IAnimal {
    String run(int lon); //run and swim 
    String swim(int lon);
    
}

  abstract class Animal implements IAnimal {
    protected String name;
    //protected String color;
    //protected int age; 
     
    Animal(String name) {
        this.name = name;
    }
        
    @Override
    public String toString() {
        return name ;
    }
}

class Dog extends Animal {
        Dog(String name) {
        super(name);
    }
    
    @Override
    public String swim(int lon) {
        int max = 10;
        if(lon < max) {
        return "Собачк проплыла:" + lon ;
        } else return "\nСобачк несправилась( \n" + " Расстояние в " + lon + "м слишком длинное";
    }
    
    @Override
    public String run(int lon) {
        int max = 500;
        if(lon < max) {
        return "Собачка пробежала:" + lon ;
        } else return "\nСобачка несправилась( \n Расстояние в " + lon + "м слишком длинное";
        
    }
}

class Cat extends Animal {
        Cat(String name) {
        super(name);
    }
    @Override
    public String swim(int lon) {
        return "\nКотик не умеет плавать у него лапки!";
    }
    
    @Override
    public String run(int lon) {
        int max = 200;
        if(lon < max) {
        return "Котик пробежал:" + lon ;
        } else return "\nКотик несправился(\nРасстояние в " + lon + "м слишком длинное";
        
        
    }
}