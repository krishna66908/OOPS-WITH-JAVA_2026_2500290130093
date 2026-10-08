import java.util.*;

class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // compareTo() defines the natural ordering
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 75));
        students.add(new Student(101, "Aman", 90));
        students.add(new Student(102, "Rohit", 60));
        students.add(new Student(104, "Vikas", 85));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting using Comparable
        Collections.sort(students);

        System.out.println("\nAfter Sorting by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
