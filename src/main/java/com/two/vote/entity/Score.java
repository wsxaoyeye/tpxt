package com.two.vote.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="score")
public class Score {
//    @Id
    private Integer scoreid;
    private BigDecimal fraction;
    private Integer articleid;


}
