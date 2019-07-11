package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.bean.CourseExtend;
import com.briup.apps.sms.dao.CourseDao;
import com.briup.apps.sms.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	@Resource
	private CourseDao courseDao;
	
	
	@Override
	public List<Course> selectAll() {
		return courseDao.selectAll();
	}


	@Override
	public List<CourseExtend> selectAllWithTeacher() {
		// TODO Auto-generated method stub
		return courseDao.selectAllWithTeacher();
	}

}
