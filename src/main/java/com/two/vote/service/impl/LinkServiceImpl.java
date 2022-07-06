package com.two.vote.service.impl;

import com.two.vote.dao.LinkDao;
import com.two.vote.entity.Link;
import com.two.vote.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkDao linkDao;
    @Override
    public int addLink(Link link) {
        return linkDao.addLink(link);
    }
}
