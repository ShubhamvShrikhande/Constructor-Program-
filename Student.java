package com.constructor;

public class Student {
    int id;
    String name;
    String city;

    public Student(int UserId, String UserName, String UserCity) {

        id = UserId;
        name = UserName;
        city = UserCity;
        System.out.println("user id is = " + id);
        System.out.println("user name is = " + name);
        System.out.println("user is city = " + city);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(1,"shubham","pune");
        //System.out.println(student);
    }
}
