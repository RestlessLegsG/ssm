package com.how2java.mapper;




import com.how2java.pojo.Producer;


import java.util.List;


public interface ProducerMapper {

  public int add(Producer producer);
    public void delete(int id);


    public Producer get(int id);
    public Producer getName(String producername);


    public int update(Producer category);


    public List<Producer> list();

}
