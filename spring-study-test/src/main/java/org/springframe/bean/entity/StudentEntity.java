package org.springframe.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName StudentEntity
 * @Author HETAO
 * @Date 2021/5/24 15:47
 */
public class StudentEntity {
	private Integer sid;
	private String userName;
	private String reason;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public StudentEntity(Integer sid, String userName, String reason) {
		this.sid = sid;
		this.userName = userName;
		this.reason = reason;
	}

	public StudentEntity() {

	}
}
