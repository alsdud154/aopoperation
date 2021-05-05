package kr.co.velnova.aopoperation.controller;

import kr.co.velnova.aopoperation.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/aop")
    @ResponseBody
    public UserDTO test(UserDTO userDTO) {
        System.out.println("userDTO = " + userDTO.toString());
        
        return userDTO;
    }
}
