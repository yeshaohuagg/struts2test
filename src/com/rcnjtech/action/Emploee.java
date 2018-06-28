package com.rcnjtech.action;

import com.opensymphony.xwork2.ActionSupport;

public class Emploee extends ActionSupport {
    private String name;
    private int age;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public void validate() {
//        if ( name == null || name.trim().equals("")){
//            addFieldError("name","The name is required");
//        }
//        if (age <28 || age >65){
//            addFieldError("age","Age must be in between 28 and 65");
//        }
//    }
}
