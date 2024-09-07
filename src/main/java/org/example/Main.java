package org.example;

public class Main {
    public static void main(String[] args) {
        Person aStudent = new Person("Max");
        aStudent.setFriend(new Person("Zoe", 22));

        aStudent.sayName();
        aStudent.getFriend().sayName();
        aStudent.increaseAgeBy(5);
        aStudent.getFriend().increaseAgeBy(6);
        System.out.println("Student's age is " + aStudent.getAge());
        System.out.println("Friend's age is " + aStudent.getFriend().getAge());
    }
}