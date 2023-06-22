package com.ohgiraffers.chap01requestmappingandhandlermethodpractice;

import java.util.Date;

public class OrderDTO {

    private String pName;
    private int quantity;
    private String name;
    private String address;
    private String phone;
    private java.util.Date date;

    private String nickname;

    public OrderDTO() {
    }

    public OrderDTO(String pName, int quantity, String name, String address, String phone, Date date, String nickname) {
        this.pName = pName;
        this.quantity = quantity;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.nickname = nickname;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "pName='" + pName + '\'' +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
