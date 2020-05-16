package com.whw.bean;

public class TestBean {
    private String name;
    private String like;

    public TestBean(String name, String like) {
        this.name = name;
        this.like = like;
    }

    public TestBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
