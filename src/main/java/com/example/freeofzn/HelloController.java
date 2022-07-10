package com.example.freeofzn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
	
	@Autowired
    private HelloService helloService;
	
	@GetMapping("/hello")
    public List<HelloDTO> selectAll() throws Exception{
        List<HelloDTO> board = helloService.selectAll();
        return board;
    }
}