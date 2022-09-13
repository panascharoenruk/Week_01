package com.example.week_01;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer(){
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }
    public Customer(String ID, String n, boolean s, int a){
        this.ID = ID;
        this.name = n;
        this.sex = s;
        this.age = a;
    }
    public String getID(){
        return ID;
    }
    public void setID(String NewID){
        this.ID = NewID;
    }
    public String getName(){
        return name;
    }
    public void setName(String NewName){
        this.name = NewName;
    }
    public boolean getSex(){
        return sex;
    }
    public void setSex(String NewSex){
        if(NewSex.equals("Male") || NewSex.equals("male")){
            this.sex = true;
        } else if(NewSex == "Female" || NewSex == "female"){
            this.sex = false;
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int NewAge){
        if(NewAge <= 0){
            this.age = 0;
        } else {
            this.age = NewAge;
        }

    }
}
