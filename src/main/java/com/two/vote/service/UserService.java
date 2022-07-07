package com.two.vote.service;


import com.two.vote.dao.UserMapper;
import com.two.vote.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryByEmail(String name){
        return userMapper.queryByEmail(name);
    }

    public int save(User user){
        return userMapper.save(user);
    }

    public void updateType1(Integer userid){
        userMapper.updateType1(userid);
    }

    public void updateType0(Integer userid){
        userMapper.updateType0(userid);
    }

    public User queryById(Integer userid){
        return userMapper.queryById(userid);
    }



    public void updatePassword(@Param("email") String email,@Param("password") String password){
        userMapper.updatePassword(email,password);
    }

//    public void updateUser(User user){
//        {
//    }
    public void updateUsername(String usernameOld,String usernameNew, String email){
        userMapper.updateUsername( usernameOld,usernameNew,email);
    }

    public User queryByName(String name) {
        return userMapper.queryByName(name);
    }

    public User queryByNameAndEmail(String username,String email){
        return userMapper.queryByNameAndEmail(username,email);
    }
}
