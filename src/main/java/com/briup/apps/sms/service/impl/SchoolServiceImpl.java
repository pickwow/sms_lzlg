package com.briup.apps.sms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.service.SchoolService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class SchoolServiceImpl 
	implements SchoolService {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private SchoolDao schoolDao;

}
