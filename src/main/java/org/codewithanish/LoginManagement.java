package org.codewithanish;

public class LoginManagement {
    public String login(String userName, String password){
        if(userName.equals("anish") && password.equals("anish123")){
            return  "Welcome";
        }else{
            return  "Invalid credentials";
        }
    }
}
