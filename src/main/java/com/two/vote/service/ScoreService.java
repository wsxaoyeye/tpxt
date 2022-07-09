package com.two.vote.service;

import com.two.vote.entity.Score;

public interface ScoreService {
    Score getScore(Integer scoreid);
    int setScore(String score,String articleid);

    int insetScore(Score score);
}
