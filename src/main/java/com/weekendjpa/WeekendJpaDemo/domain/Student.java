package com.weekendjpa.WeekendJpaDemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by abhi on 06/01/18.
 */

@Entity
public class Student {

    @Id
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String name;
    String city;

}
