package com.student;

class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

class TestStaticMethod{
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"Nghia");
        Student s2 = new Student(2, "Hoang");
        Student s3 = new Student(5, "Tuan");
        s1.display();
        s2.display();
        s3.display();
    }
}
