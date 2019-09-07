package com.seeclo.IntellijDemo.service;

import org.springframework.stereotype.Service;

@Service("validate")
public class ValidateImpl implements HomeService {

    @Override
    public String homeValidate() {
        return null;
    }

    public String result(){
        return "All Ok";
    }
}
