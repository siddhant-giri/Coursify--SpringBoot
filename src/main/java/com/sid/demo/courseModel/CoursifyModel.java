package com.sid.demo.courseModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CoursifyModel {
	
	@Id
	private int courseId;
	private String courseTitle;
	private String courseDescription;
	
	public int getCourseId() {
		return courseId;  
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	@Override
	public String toString() {
		return "CoursifyModel [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseDescription="
				+ courseDescription + "]";
	}
	
	
	
}
