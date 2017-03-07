package com.kode12.service;

import com.kode12.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public ProductVO getById(int productId) {

        ProductVO productVO = new ProductVO();

        switch (productId) {
            case 1:
                productVO.setId(1);
                productVO.setName("Apple MacBook Air MMGF2HN/A 13.3-inch Laptop");
                break;
            case 2:
                productVO.setId(2);
                productVO.setName("Samsung T3 Portable 500GB USB 3.0 External SSD (MU-PT500B/AM)");
                break;
        }
        return productVO;

    }
}
