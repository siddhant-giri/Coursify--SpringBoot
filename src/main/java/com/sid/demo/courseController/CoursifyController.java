package com.sid.demo.courseController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.demo.courseDao.CoursifyDao;
import com.sid.demo.courseModel.CoursifyModel;


@RestController
public class CoursifyController {

	@Autowired
	CoursifyDao coursedao;
	
	@GetMapping(path="/courses")
//	@ResponseBody
	public List<CoursifyModel> getCourses() {
		
  	return coursedao.findAll();
		
	 
	}
	
	
	
	@RequestMapping("/course/{cid}")
	@ResponseBody
	public Optional<CoursifyModel> getCourse(@PathVariable("cid")int cid) {
		
		return coursedao.findById(cid);
		
	 
	}
	
	@PostMapping(path="/course", consumes= {"application/json"})
	public CoursifyModel addCourse(@RequestBody CoursifyModel course) {
		coursedao.save(course);
		return course;
	}
	
	@DeleteMapping("/course/{cid}")
	public String deleteCourse(@PathVariable int cid)
	{
		CoursifyModel c = coursedao.getOne(cid);
		coursedao.delete(c);
		return "deleted";
	}
	
	@PutMapping(path="/course",consumes= {"application/json"})
	public CoursifyModel saveOrUpdateCourse(@RequestBody CoursifyModel course)
	{
	 coursedao.save(course);
	 return course;
	}
}
