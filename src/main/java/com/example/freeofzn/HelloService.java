package com.example.freeofzn;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class HelloService {
 
	@Autowired
    private HelloMapper helloMapper;
	    
    public List<HelloDTO> selectAll() throws Exception{
        return helloMapper.selectAll();
    }
      
}