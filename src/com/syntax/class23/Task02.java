package com.syntax.class23;

import com.syntax.class24.Employee;

//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class Task02 {
    public static void main(String[] args) {
        new CreditCard(10, 1.07).calcInt();
        new Visa(10, 1.07).calcInt();
        new AX(10, 1.07).calcInt();
    }
}

class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calcInt (){
        System.out.println(balance*interest);
    }
}

class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }
    @Override
    void calcInt(){
        System.out.println("This is overridden");
    }
}

class InterfaceTest implements Employee {

    @Override
    public void work() {
        System.out.println("Printing in a different package");
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest=new InterfaceTest();
        interfaceTest.work();
        System.out.println(interfaceTest.age);
        new InterfaceTest().work();
        System.out.println(InterfaceTest.age);
    }
}

