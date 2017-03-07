package com.kode12.controller;

import com.kode12.service.CartService;
import com.kode12.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/getAll")
    public List<CartVO> getAll() {

        return cartService.getAll();
    }

}
