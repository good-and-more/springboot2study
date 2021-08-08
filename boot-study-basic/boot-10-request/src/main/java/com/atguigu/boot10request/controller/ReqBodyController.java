package com.atguigu.boot10request.controller;

import com.atguigu.boot10request.entity.Req;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("request")
public class ReqBodyController {

    @RequestMapping(value = "/body", method = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS})
    public Req body(@RequestBody Req req) {
        log.info("req: {}", req);
        return req;
    }
}
