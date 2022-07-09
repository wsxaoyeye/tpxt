package com.two.vote.service.impl;

import com.two.vote.dao.ScoreDao;
import com.two.vote.entity.Score;
import com.two.vote.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    @Override
    public Score getScore(Integer scoreid) {
        return scoreDao.getScore(scoreid);
    }

    @Override
    public int setScore(String score,String articleid) {
        return scoreDao.setScore(score,articleid);
    }
}
