/**
*Java 5 HW5 
*@author Iurii Lenin
*@version 22.11.2021
**/



class HW5 {
    
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivan", "Eng", ".com", 02, 3400, 30);
        employee[1] = new Employee("Navi", "Teacher", "Teacher.com", 023, 3900, 39);
        employee[2] = new Employee("Vano", "Baiker", "Baiker.com", 456, 3200, 40);
        employee[3] = new Employee("Onav", "Rider", "Rider.com", 3355, 1000, 43);
        employee[4] = new Employee("Nik", "Chief", "Chief.com", 8978973, 6000, 44);
        
        for(Employee employeForty : employee) 
           if(employeForty.getAge() > 40)
               System.out.println(employeForty);
        }
}


class Employee {
   private String name;
   private String position;
   private String email;
   private int phone;
   private int salary;
   private int age;
   
   Employee(String name, String position, String email, int phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
    }
    
    
     public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Name:" + name + "\n position:" + position + "\n email:" + email + "\n phone:" + phone + "\n salary:" + salary + "\n age:" + age;
    }
}