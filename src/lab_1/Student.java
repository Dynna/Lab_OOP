package lab_1;

public class Student {
    private String name;
    private int age;
    public float mark;
    public Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private float getMark() {
        return mark;
    }

    public String accessStudentProperties() {
        return ("The student has name: " + this.getName() + "\nAge: " + this.getAge() + "\nMark: " + this.getMark());
    }
}
