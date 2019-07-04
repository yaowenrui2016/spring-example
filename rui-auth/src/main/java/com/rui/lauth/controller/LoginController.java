package com.rui.lauth.controller;

import indi.rui.common.base.dto.Response;
import com.rui.lauth.api.model.UserVO;
import org.springframework.web.bind.annotation.*;

/**
 * yaowr
 * 2019/5/19
 */
@RestController
@RequestMapping("user")
public class LoginController {
    @PostMapping("login")
    public Response<UserVO> create(@RequestBody UserVO userVO) {
        return Response.ok(userVO);
    }
}
