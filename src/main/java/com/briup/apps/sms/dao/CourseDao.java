package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.bean.CourseExtend;

public interface CourseDao {
	
	List<Course> selectAll();
	
	List<CourseExtend> selectAllWithTeacher();
}
