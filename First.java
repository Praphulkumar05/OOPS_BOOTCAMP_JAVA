 class Student{
        int rno;
        String name ;
        float marks;
        // Student(){
        //     this.rno = 12212240;
        //     this.name = "Praphul Kumar";
        //     this.marks = 89.9f;
        // }

        Student(){
            this(12,"Default name",76.8f);
        }
        Student(int rno,String name,float marks){   //if the name is same then use (this.) else just refereced it to the name/value.
            this.rno=rno;
            this.name=name;
            this.marks=marks;
             
        }

        void greeting(){
            System.out.println("hello ji: "+this.name);
        }
    }
public class First{
    public static void main(String[] args) {
        // Student  student = new Student();
        // System.out.println(student.rno);
        // System.out.println(student.name);
        // System.out.println(student.marks);
        // student.greeting();
        // Student student2 = new Student(15,"PK",76.9f);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);
        // System.out.println(student2.rno);
        Student student3 = new Student();
        System.out.println(student3.name);

        
    }
}