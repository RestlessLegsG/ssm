package com.how2java.service.impl;

import com.how2java.mapper.LinkManMapper;
import com.how2java.pojo.LinkMan;
import com.how2java.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkManServiceImpl implements LinkManService {
    @Autowired
    LinkManMapper linkManMapper;

public List<LinkMan> namelist(){
    return linkManMapper.nameList();
}

}
