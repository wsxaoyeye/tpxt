package com.two.vote.dao;



import com.two.vote.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {
    User queryByEmail(String name);

    User queryByName(@Param("username") String name);

    User queryById(Integer userid);

    int save(User user);

    void updateType1(Integer userid);
    void updateType0(Integer userid);

    void updateUser(User user);

    void updatePassword(@Param("email") String email,@Param("password") String password);

    void updateUsername(@Param("username") String username, @Param("email") String email);
}
