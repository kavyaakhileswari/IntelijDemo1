package com.company;
class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome");
        Student s=new Student();
        s.setId(101);
        s.setName("jai");
        System.out.println(s.toString());
    }
}
