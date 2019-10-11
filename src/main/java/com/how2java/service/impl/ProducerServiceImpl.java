package com.how2java.service.impl;

import com.how2java.mapper.ProducerMapper;
import com.how2java.pojo.Producer;
import com.how2java.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    ProducerMapper producerMapper;

    public Producer getName(String producername){
        return producerMapper.getName(producername);  };
}
