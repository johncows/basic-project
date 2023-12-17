package com.kk.contorller;

import com.kk.dao.mapper.NsUrlRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {

    @Autowired
    private NsUrlRecordMapper nsUrlRecordMapper;

    @GetMapping("trigger-scan/{begin}/{end}")
    public String trigger(@PathVariable Integer begin, @PathVariable Integer end) {
        return "ok";
    }
}
