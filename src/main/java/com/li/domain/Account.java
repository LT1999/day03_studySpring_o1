package com.li.domain;

import java.io.Serializable;

/**
 * @Author: LTWO
 * @Date: 2019/5/24 18:05
 * @Version 1.0
 * 账户的实体类
 */
public class Account implements Serializable {
    private int id;
    private String name;
    private Float money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

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

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
