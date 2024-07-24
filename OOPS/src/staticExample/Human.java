package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //anything which is constant for all the objects of the class we declare those as static
//
    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
