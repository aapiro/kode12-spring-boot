package com.kode12.controller;

import com.kode12.vo.EmployeeVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<EmployeeVO> getAll(){
        return null;
    }

    @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
    public EmployeeVO getById(@PathVariable("employeeId") long employeeId){
        return null;
    }
}
