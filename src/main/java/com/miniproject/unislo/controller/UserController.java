package com.miniproject.unislo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miniproject.unislo.dto.UserDto;
import com.miniproject.unislo.entity.UserEntity;
import com.miniproject.unislo.service.UserService;


@RequestMapping("/user") //url 앞에 자동으로 user 붙여줌
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping(value = "/join")
    public String userJoinForm(Model model){
        model.addAttribute("userDto", new UserDto()); // Dto에 있는 에러메시지 띄우기 위해 Form태그에 object 지정
        return "user/join";
    }

    @PostMapping(value = "/join")
    public String userJoinForm(UserDto userDto){
        UserEntity userEntity = UserEntity.toUserEntity(userDto, passwordEncoder);
        userService.saveUser(userEntity);

        return "redirect:/";
    }
}
