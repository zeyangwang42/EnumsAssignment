package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Xinyu, Duong;

    public String getCatchPhrase() {
        return "Hey, my name is "+this.toString()+"!";
    }

    public boolean isDuong() {
        return this==Duong;
    }

    public boolean isXinyu() {
        return this==Xinyu;
    }
}
