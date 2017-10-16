package com.lanou.bean;

/**
 * Created by zar on 2017/10/9.
 */
public class Student {
    private int id;
    private String name;
    private Classzz classzz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classzz getClasszz() {
        return classzz;
    }

    public void setClasszz(Classzz classzz) {
        this.classzz = classzz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classzz=" + classzz +
                '}';
    }
}
