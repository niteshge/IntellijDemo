package com.seeclo.IntellijDemo.service;

import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeServiceImpl implements HomeService {

    public String homeValidate(){
        return "hello";
    }

    @Override
    public String result() {
        return "result2";
    }
}
