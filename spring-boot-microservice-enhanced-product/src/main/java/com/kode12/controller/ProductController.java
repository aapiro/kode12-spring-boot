package com.kode12.controller;

import com.kode12.service.ProductService;
import com.kode12.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/{productId}")
    public ProductVO getById(@PathVariable("productId") int productId) {

        return productService.getById(productId);
    }

}
