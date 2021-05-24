package org.springframe.bean.service;

import org.springframe.bean.entity.StudentEntity;

/**
 * @InterfaceName StuService
 * @Author HETAO
 * @Date 2021/5/24 15:50
 */
public interface StuService {
	StudentEntity getStuById(int id);
}
