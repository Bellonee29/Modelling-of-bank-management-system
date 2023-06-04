package com.decabank.bank.model;

public abstract class BaseClass {
    private String name;
    private String Address;
    private Integer age;

    public BaseClass(String name, String address, Integer age) {
        this.name = name;
        this.Address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                '}';
    }
}
