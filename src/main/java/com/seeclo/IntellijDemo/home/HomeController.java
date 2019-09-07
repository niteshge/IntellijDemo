package com.seeclo.IntellijDemo.home;

import com.seeclo.IntellijDemo.service.HomeService;
import com.seeclo.IntellijDemo.service.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class HomeController {

    @Autowired
    @Qualifier("homeService")
    private HomeService homeServiceImpl;

    @Autowired
    @Qualifier("validate")
    private HomeService validateService;


    @GetMapping(value = "home")
    public String home(){
        return homeServiceImpl.homeValidate();
    }


    @GetMapping(value = "result")
    public String result(){
        return validateService.result();
    }

}
