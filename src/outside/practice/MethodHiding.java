package outside.practice;

public class MethodHiding {
    public static void main(String[] args) {
        ParentClass pccc = new ChildClass();
        pccc.display();
        ParentClass pcpc = new ParentClass();
        pcpc.display();
        ChildClass cccc = new ChildClass();
        cccc.display();

    }
}


    class ParentClass{
        public static void display(){
            System.out.println("display() from parent class");
        }
    }
    class ChildClass extends ParentClass{
        public static void display(){
            System.out.println("display() from child class");
        }
    }





