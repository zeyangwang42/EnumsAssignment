package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private String name;
    public DuongXinyuEvaluator(String input) {
        this.name=input;
    }

    public boolean isDuong() {
        return this.name.equals("Duong");
    }

    public boolean isXinyu() {
        return this.name.equals("Xinyu");
    }
}
