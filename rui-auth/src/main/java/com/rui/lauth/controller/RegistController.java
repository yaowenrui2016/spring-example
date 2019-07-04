package com.rui.lauth.controller;

import indi.rui.common.base.dto.Response;
import com.rui.lauth.api.model.UserVO;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * yaowr
 * 2019/5/19
 */
@RestController
@RequestMapping("user")
public class RegistController {
    @PutMapping("create")
    public Response<UserVO> create(@RequestBody UserVO userVO) {
        return Response.ok(userVO);
    }
}
