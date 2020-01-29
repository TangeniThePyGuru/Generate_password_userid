package com.example.generate_user_id;

import java.util.Date;

public class GenerateUserId {

    private String fname;
    private String lname;
    private String DOB;

    public GenerateUserId(String fname, String lname, String DOB) {
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String generateUserId(){
        String user_id = fname.substring(0,1)+lname+DOB.split("/")[1];
        return user_id.toLowerCase();
    }

    public String generatePassword(){
        String password = fname.substring(0,1).toLowerCase()+
                fname.substring(fname.length()-1).toLowerCase()+
                DOB.split("/")[0]+
                DOB.split("/")[2].substring(2)+
                lname.substring(0,3)+
                fname.length()+
                lname.length();

        return password.toLowerCase();
    }
}
