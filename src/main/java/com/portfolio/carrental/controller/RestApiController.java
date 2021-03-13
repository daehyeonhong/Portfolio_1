package com.portfolio.carrental.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class RestApiController {

    @RequestMapping(value = "/{user_id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Integer>> getList(@PathVariable("user_id") Integer user_id) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(user_id);
        return (user_id % 2) == 0 ? new ResponseEntity<List<Integer>>(list, HttpStatus.OK)
                : new ResponseEntity<List<Integer>>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}