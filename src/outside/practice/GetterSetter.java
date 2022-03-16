package outside.practice;

public class GetterSetter {
}
class Student{
    private String name;
    private int age;

    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Suzie");
        System.out.println(s.getName());
        s.setAge(24);
        System.out.println(s.getAge());
    }

}