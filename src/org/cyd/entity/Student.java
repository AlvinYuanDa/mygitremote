package org.cyd.entity;

public class Student {
	private int StuId;
	private String StuName;
	private int StuAge;
	
	public int getStuId() {
		return StuId;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public int getStuAge() {
		return StuAge;
	}
	public void setStuAge(int stuAge) {
		StuAge = stuAge;
	}
	
	@Override
	public String toString() {
		return this.StuName+","+this.StuId+","+this.StuAge;
	}
	
	
}
