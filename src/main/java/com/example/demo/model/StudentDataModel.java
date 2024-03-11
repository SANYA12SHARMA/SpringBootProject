package com.example.demo.model;



public class StudentDataModel {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String Name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdhar() {
        return Adhar;
    }

    public void setAdhar(String adhar) {
        Adhar = adhar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String Adhar;
    public String id;
    public String University;

    public StudentDataModel(String name, int age, String adhar, String id, String university) {
        this.Name = name;
        this.age = age;
        this.Adhar = adhar;
        this.id = id;
        this.University = university;
    }


}
