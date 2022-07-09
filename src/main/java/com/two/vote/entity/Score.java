package com.two.vote.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public class Score {
//    @Id
    private Integer scoreid;
    private BigDecimal fraction;
    private Long articleid;

    public Score(Integer scoreid, BigDecimal fraction, Long articleid) {
        this.scoreid = scoreid;
        this.fraction = fraction;
        this.articleid = articleid;
    }

    public Score() {
    }

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public BigDecimal getFraction() {
        return fraction;
    }

    public void setFraction(BigDecimal fraction) {
        this.fraction = fraction;
    }

    public Long getArticleid() {
        return articleid;
    }

    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    @Override
    public String toString() {
        return "Score{" +
                "scoreid=" + scoreid +
                ", fraction=" + fraction +
                ", articleid=" + articleid +
                '}';
    }
}
