package org.fasttrackit.records;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        birthday(student);
        System.out.println(student.name()+"has age "+ student.age());
 //       System.out.println(student.name()+" has age "+student.age());

 //       int a = 10;
 //       increment(a);
 //       System.out.println("outside "+ a);
 //       a++;
 //       System.out.println("outside " +a);
 //       SimpleObject a = new SimpleObject(10);
 //       incrementObject(a);
 //       System.out.println("outside "+ a);
    }

    public static Student birthday (Student s) {
        Student newStudent = new Student(s.name(), s.age()+1);
        System.out.println(newStudent.age());
        return newStudent;
    }

    public static int increment(int a){
        a++;
        System.out.println("inside " + a);
        return a;
    }

    public static void incrementObject(SimpleObject a) {
        a.setA(11);
        System.out.println("inside "+ a);
    }
}
