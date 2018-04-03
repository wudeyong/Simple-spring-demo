package com.davin.bbs.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author :davin
 * Date 2018/3/27
 * For More Information,Please Visit https://github.com/wudeyong
 */

@RestController
public class RestApi {

    @RequestMapping("/hello")
    public String hello(){
        return "hello word";
    }

}
