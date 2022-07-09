package com.two.vote.controller;

import com.two.vote.entity.Score;
import com.two.vote.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("setScore")
    public String setScore(String score,String articleid){
        System.out.println(score);
        scoreService.setScore(score,articleid);
//        String route ="redirect:/managerVoteList/"+userid;
        return "redirect:/managerVoteList";
    }

    @RequestMapping("getScore")
    public String getScore(Integer scoreid, Model model, HttpServletRequest servletRequest){
        Score score = scoreService.getScore(scoreid);
        List list =new ArrayList();
        Cookie[] cookies = servletRequest.getCookies();
        for (Cookie cookie:cookies){
            list.add(cookie.getValue());
        }
        System.out.println(list.get(0));
        Object userid = list.get(0).toString();
        model.addAttribute("score",score);
        String route ="redirect:/managerVoteList/"+userid;
        return route;
    }
}
