package Spring.Core.Entities;

public class Student{
    String name;
    int age;
    int roll;
    int ClassName;
    public Student(String name, int age, int roll, int className) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        ClassName = className;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getClassName() {
        return ClassName;
    }
    public void setClassName(int className) {
        ClassName = className;
    }
   
    
}
