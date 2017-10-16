package com.lanou.controller;

import com.lanou.bean.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zar on 2017/10/9.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String frontPage() {
        return "home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String printUser() {
        System.out.println("asdf");
        return "home";
    }

    @ResponseBody
    @RequestMapping(value = "/userinfo")
    public User getUser(User user) {
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/stuInfo")
    public Student getStudent(Student student) {
        Student student1 = new Student();
        Student student2 = new Student();
        Classzz classzz = new Classzz();
        Classzz classzz1 = new Classzz();
        classzz.setId(1);
        classzz.setName("终极一班");
        classzz1.setId(2);
        classzz1.setName("终极二班");
        student1.setId(1);
        student1.setName("zhangsan");
        student1.setClasszz(classzz);
        student2.setId(2);
        student2.setName("lisi");
        student2.setClasszz(classzz1);
        if (student.getId() == student1.getId()) {
            return student1;
        }
        if (student.getId() == student2.getId()) {
            return student2;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/provinceInfo")
    public Province getProvince(Province province) {
        List<Province> provinces = new ArrayList<Province>();
        Province bjPro = new Province();
        bjPro.setPid(1);
        bjPro.setPname("北京");
        City bjCity = new City();
        bjCity.setCid(1);
        bjCity.setCname("北京市");
        bjPro.getCities().add(bjCity);
        Province lnPro = new Province();
        lnPro.setPid(2);
        lnPro.setPname("辽宁");
        City syCity = new City();
        syCity.setCid(1);
        syCity.setCname("沈阳");
        City dlCity = new City();
        dlCity.setCid(2);
        dlCity.setCname("大连");
        lnPro.getCities().add(syCity);
        lnPro.getCities().add(dlCity);
        if (province.getPid() == bjPro.getPid()) {
            return bjPro;
        }
        if (province.getPid() == lnPro.getPid()) {
            return lnPro;
        }
        return null;
    }
}
