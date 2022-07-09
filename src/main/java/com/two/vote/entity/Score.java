package com.two.vote.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="score")
public class Score {
//    @Id
    private Integer scoreid;
    private String fraction;
    private Integer articleid;


}
