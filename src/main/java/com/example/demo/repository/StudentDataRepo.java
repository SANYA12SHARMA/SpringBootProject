package com.example.demo.repository;

import com.example.demo.model.StudentDataModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentDataRepo {
    private HashMap<String, StudentDataModel> studentDataMap;

    public StudentDataRepo(){
        this.studentDataMap = new HashMap<>();

    }
    public StudentDataModel addStudentData(String name,int age,String Adhar,String id,String university){
        StudentDataModel studentDataModel = new StudentDataModel(name,age,Adhar,id,university);
        studentDataMap.put(id,studentDataModel);
        return studentDataModel;
    }
    public StudentDataModel getStudentById(String id){
        return studentDataMap.getOrDefault(id,null);
    }
    public List<StudentDataModel> getAllStudents(){
        List<StudentDataModel> list = new ArrayList<>();
        for(StudentDataModel student : studentDataMap.values()){
            list.add(student);
        }
        if(list.isEmpty()){
            throw new RuntimeException("Students not found");
        }
        return list;
    }
    public List<StudentDataModel> getAllStudentByUniversity(String university){
        List<StudentDataModel> list = new ArrayList<>();
        for(StudentDataModel student : studentDataMap.values()){
            if(student.getUniversity().equalsIgnoreCase(university)){
                list.add(student);
            }
        }
        if(list.isEmpty()){
            throw new RuntimeException("Students not found");
        }
        return list;
    }


}
