package com.rui.lauth.controller;

import com.rui.lauth.api.model.UserVO;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * yaowr
 * 2019/5/19
 */
@RestController
public class RegistController {
    @PutMapping("create")
    public Map<String, Object> create(@RequestBody UserVO userVO) {
        return Collections.singletonMap("data", userVO.getName());
    }
}
