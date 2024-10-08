package org.example;

// class representing a person
public class Person {
    private String name;
    private int age;
    private Person friend;

    /**
     * Creates a new person
     * @param name full name of the person.
     * @param age initial age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 20;
        }
    }

    public Person(String name) {
        this.name = name;
        this.age = 20;
    }

    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void increaseAgeBy(int years) {
        if (years >= 0) {
            age = age + years;
        }
    }

    public int getAge() {
        return age;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }
}
