public class Main {
    public static void main(String[] args){
        Student student = new Student();
        Student student2 = new Student();
        student.name = "Harsha";
        student.age = 20;
        student.printInfo();
        student2.printInfo();
    }
}

class Student{
    String name;
    int age;

    Student(){
        this.name = "Human";
        this.age = 0;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
