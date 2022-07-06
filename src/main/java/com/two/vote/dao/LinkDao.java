package com.two.vote.dao;

import com.two.vote.entity.Link;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LinkDao {

    //添加链接
    @Insert("insert into link(articleid,link) values (#{articleid},#{link})")
    int addLink(Link link);
}
