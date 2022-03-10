package com.syntax.class21;
//Write program: userClass  that has a constructor that initializes
// instance variable name and mobile number. Create a subclass  userInfo
// that will have user address variable and it also being initialized
// through constructor call. Print users name, mobile number and address
// in userDetails method. Test your code.
public class HW01 {
}

class UserClass{
    String name;
    String mobile;

    public UserClass(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}

class UserInfo extends UserClass{
    String userAddress;

    public UserInfo(String name, String mobile, String userAddress) {
        super(name, mobile);
        this.userAddress = userAddress;
    }
    void display(){
        System.out.println(name+" "+mobile+" "+userAddress);
    }

    public static void main(String[] args) {
        new UserInfo("John", "202-867-5309", "1600 Pennsylvania Ave").display();
    }
}
