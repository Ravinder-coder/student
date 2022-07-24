package com.demo.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "record")
public class StudentEntity {
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", lastName=" + lastName + ", fName=" + fName
				+ ", rollNo=" + rollNo + ", couseEntity=" + couseEntity + "]";
	}
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentEntity(long id, String name, String lastName, String fName, int rollNo, CouseEntity couseEntity) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.fName = fName;
		this.rollNo = rollNo;
		this.couseEntity = couseEntity;
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
	public CouseEntity getCouseEntity() {
		return couseEntity;
	}
	public void setCouseEntity(CouseEntity couseEntity) {
		this.couseEntity = couseEntity;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String lastName;
	private String fName;
	private int rollNo;
	@OneToOne
	private CouseEntity couseEntity;
	
}
