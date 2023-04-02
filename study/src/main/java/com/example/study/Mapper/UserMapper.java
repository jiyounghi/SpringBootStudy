package com.example.study.Mapper;

import com.example.study.Vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {

    // 회원가입
     public void signUp(UserVO vo);

}
