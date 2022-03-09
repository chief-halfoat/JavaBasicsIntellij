package com.syntax.class21;

//Write program: userClass  that has a constructor that initializes
// instance variable name and mobile number. Create a subclass
// userInfo that will have user address variable and it also being initialized
// through constructor call. Print users name, mobile number and
// address in userDetails method. Test your code.

public class Task01 {
    String name;
    String mobileNumber;

    public Task01(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    }

//
//class userInfo extends Task01{
//    String address;
//
//    public userInfo(String address) {
//        super(name, mobileNumber);
//        this.address = address;
//    }
//}
