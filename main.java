package basics;
public class main {
    public static void main(String[] args) {
        /* attributes for the class */
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "Kaushik";
        System.out.println(p1.age + " " + p1.name);

        // initializing the constructor in a different way
        Person p2 = new Person(48, "V Gopal Krishnan");
        System.out.println(p2.age + " " + p2.name);

        Person p3 = new Person();
        p3.age = 45;
        p3.name = "Lalli";

        p1.eat();
        p2.walk(6423);
        p1.walk();

        System.out.println(Person.count);

        Person.Developer d1 = new Person.Developer(21, "Anantha");
        d1.eat();
        d1.walk();
//        encapsulation obj = new encapsulation();
//        obj.doWork();
    }
}

class Person {
    // attributes for the class
    String name;
    int age;
    static int count;

    public Person() {
        count++;
    }

    public Person(int newAge, String newName) {
        // here 'this()' is used to call the default constructor
        this();
        age = newAge;
        name = newName;
    }

    // creating methods for the class
    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    //compile-time polymorphism
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }

    //Developer class inheriting from the Person class
    static class Developer extends Person {
        public Developer(int newAge, String newName) {
            super(newAge, newName);
        }
        //run-time polymorphism
        void walk() {
            System.out.println("Developer " + name + " is walking.");
        }
    }
}
