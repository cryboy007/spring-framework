package org.springframe.bean.service.impl;

import org.springframe.bean.entity.StudentEntity;
import org.springframe.bean.service.StuService;

/**
 * @ClassName StuServiceImpl
 * @Author HETAO
 * @Date 2021/5/24 15:51
 */
public class StuServiceImpl implements StuService {
	@Override
	public StudentEntity getStuById(int id) {
		StudentEntity stu = new StudentEntity(1, "张三", "高一(二班)");
		return stu;
	}
}
