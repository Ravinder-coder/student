package com.demo.student.model;


public class StudentModel {

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", lastName=" + lastName + ", fName=" + fName + ", rollNo="
				+ rollNo + ", courseId=" + courseId + "]";
	}
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(long id, String name, String lastName, String fName, int rollNo, long courseId) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.fName = fName;
		this.rollNo = rollNo;
		this.courseId = courseId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	private long id;
	private String name;
	private String lastName;
	private String fName;
	private int rollNo;
	private long courseId;
	
}
