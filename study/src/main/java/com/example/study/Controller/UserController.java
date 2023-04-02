package com.example.study.Controller;

import com.example.study.Mapper.UserMapper;
import com.example.study.Vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    @Inje
    private final UserMapper userMapper;

    @RequestMapping(value = "/test")
    public String test(Model model){

        model.addAttribute("message", "반갑습니다^^");

        return "test.html";
    }

    /* 회원 가입 페이지 */
    @RequestMapping(value = "/user/plus")
    public String Plus(){
        return "userPlus";
    }

    /* 회원 가입 처리 */
    @RequestMapping(value = "userPlus.do")
    public String userPlusAction(UserVO vo){

        userMapper.signUp(vo);

        return "test";
    }

    /* 회원 정보 수정 */

    /* 회원 탈퇴 */

    /* 회원 정보 수정 */
}
