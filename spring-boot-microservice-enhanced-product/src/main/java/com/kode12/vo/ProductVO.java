package com.kode12.vo;

import java.io.Serializable;

public class ProductVO implements Serializable{
    private long id;
    private String name;

    public ProductVO() {
    }

    public ProductVO(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
