package com.how2java.pojo;

public class LinkMan {
    private int id;
    private String linkName;

    public String getLinkName() {
        return linkName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + linkName + "]";
    }
}