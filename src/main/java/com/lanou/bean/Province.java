package com.lanou.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zar on 2017/10/9.
 */
public class Province {
    private int pid;
    private String pname;
    private Set<City> cities = new HashSet<City>();

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}
