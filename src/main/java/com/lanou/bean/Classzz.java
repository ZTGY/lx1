package com.lanou.bean;

/**
 * Created by zar on 2017/10/9.
 */
public class Classzz {
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "Classzz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
