package com.example.encrypt.controller;

import com.example.encrypt.anotation.Decrypt;
import com.example.encrypt.anotation.Encrypt;
import com.example.encrypt.model.R;
import com.example.encrypt.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class testController {
    @Encrypt
    @GetMapping("/encrypt")
    public R encryptTest(){
        User user = new User();
        user.setName("zwf");
        user.setAge(27);

        return R.ok("请求成功",user);
    }
    /**
     * 将前面返回的参数拿来测试
     * t6yXg7Du793x2a2vxqkRGFcQmP3CxrsLr9y7s4TY0+I=
     */
    @PostMapping("/decrypt")
    public R decrypt(@RequestBody @Decrypt User user){
        return R.ok("ok",user);
    }
}
