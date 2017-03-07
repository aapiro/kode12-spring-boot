package com.kode12.service;

import com.kode12.vo.CartVO;
import com.kode12.vo.ProductVO;
import com.kode12.vo.UserVO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartService {

    @Autowired
    RestTemplate restTemplate;

    public List<CartVO> getAll(){
        List<CartVO> list = new ArrayList<CartVO>();

        // Order#1 -> User#1, Product#1
        // Order#1 -> User#1, Product#2

        Map<String, Object> userUriVariables = new HashMap<String, Object>();
        userUriVariables.put("userId", 1);
        ResponseEntity<UserVO> userResponseEntity = restTemplate.getForEntity("http://localhost:8082/user/{userId}", UserVO.class, userUriVariables);

        ProductVO productVO1 = restTemplate.getForEntity("http://localhost:8081/product/1", ProductVO.class).getBody();
        ProductVO productVO2 = restTemplate.getForEntity("http://localhost:8081/product/2", ProductVO.class).getBody();

        list.add(new CartVO(1, userResponseEntity.getBody(), productVO1));
        list.add(new CartVO(2, userResponseEntity.getBody(), productVO2));

        return list;

    }
}
