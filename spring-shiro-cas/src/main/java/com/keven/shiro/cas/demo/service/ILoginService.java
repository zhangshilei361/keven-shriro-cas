package com.keven.shiro.cas.demo.service;

import com.keven.shiro.cas.demo.bean.User;

/**
 * @ClassName : ILoginService
 * @Description : 登录服务接口类
 * @Author : Keven
 */
public interface ILoginService {

    User getUserByName(String getMapByName);
}
