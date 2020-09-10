package com.sid.demo.courseDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.demo.courseModel.CoursifyModel;

public interface CoursifyDao extends JpaRepository<CoursifyModel, Integer>{

}
