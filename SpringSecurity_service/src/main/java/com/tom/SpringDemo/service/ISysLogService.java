package com.tom.SpringDemo.service;

import java.util.List;

/**
 * @author miaomiaole
 * @date 2020/5/16 21:43
 * @DESCRIBE
 */
public interface ISysLogService {
    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
