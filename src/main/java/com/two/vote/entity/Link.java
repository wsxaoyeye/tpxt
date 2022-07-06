package com.two.vote.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString
@NoArgsConstructor
@Table(name="link")
public class Link {

    private Long articleid;
    private String link;
}
