package doublyLinkedList;

public class Student {

    String name;

    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void updateStudent(String name,int marks){
        Student student=this;
        student.name=name;
        student.marks=marks;
    }

    @Override
    public String toString() {
        return this.name+": "+this.marks;
    }

    public static void main(String[] args) {


        Student student=new Student("praveen",100);

        System.out.println(student);

        student.updateStudent("PRAVEEN J",99);

        System.out.println(student);

    }
}
