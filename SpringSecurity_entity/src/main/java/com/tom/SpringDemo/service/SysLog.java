package com.tom.SpringDemo.service;

import lombok.Data;

import java.util.Date;

/**
 * @author miaomiaole
 * @date 2020/5/16 21:45
 * @DESCRIBE
 */
@Data
public class SysLog {
    private String id;
    private Date visitTime;
    private String visitTimeStr;
    private String username;
    private String ip;
    private String url;
    private Long executionTime;
    private String method;
}
