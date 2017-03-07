package com.kode12.vo;

public class CartVO {
    private long id;
    private UserVO user;
    private ProductVO product;

    public CartVO() {
    }

    public CartVO(long id, UserVO user, ProductVO product) {
        this.id = id;
        this.user = user;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }

    public ProductVO getProduct() {
        return product;
    }

    public void setProduct(ProductVO product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartVO{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
