package com.kode12.service;

import com.kode12.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserVO getById(int userId) {

        UserVO userVO = new UserVO();

        switch (userId) {
            case 1:
                userVO.setId(1);
                userVO.setName("Yogesh P");
                break;
        }
        return userVO;

    }
}
