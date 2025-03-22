package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.Model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringJdbcExApplication.class, args);
           Student s = context.getBean(Student.class);
		   s.setRollNo(104);
		   s.setMarks(78);
		   s.setName("Gnaneshwar");
		   StudentService service=context.getBean(StudentService.class);
			service.addStudent(s);

		List<Student> students = service.getStudent();
		System.out.println(students);
	}

}
