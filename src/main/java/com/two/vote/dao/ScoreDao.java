package com.two.vote.dao;

import com.two.vote.entity.Score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
//public interface ScoreDao extends JpaRepository<Score,String> {
public interface ScoreDao {

//    @Query(value = "select score from score where scoreid=?",nativeQuery = true)
    Score getScore(int scoreid);

//    @Transactional
//    @Query(value = "insert into score(score,articleid) values (score=?1,articleid=?2)",nativeQuery = true)
    int setScore(@Param("score") String score,@Param("articleid") String articleid);

    @Insert("insert into score values(#{scoreid},#{fraction},#{articleid});")
    int insetScore(Score score);
}
