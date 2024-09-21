package com.blackwolf.springdata_jpa_demo;

import com.blackwolf.springdata_jpa_demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdataJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdataJpaDemoApplication.class, args);

		  StudentRepo repo = context.getBean(StudentRepo.class);

		  Student s1 = context.getBean(Student.class);
		  Student s2 = context.getBean(Student.class);
		  Student s3 = context.getBean(Student.class);
		  Student s4 = context.getBean(Student.class);
		  Student s5 = context.getBean(Student.class);
		  Student s6 = context.getBean(Student.class);
		  Student s7 = context.getBean(Student.class);
		  Student s8 = context.getBean(Student.class);
		  Student s9 = context.getBean(Student.class);
		  Student s10 = context.getBean(Student.class);
		  Student s11 = context.getBean(Student.class);


		    s1.setRollNo(1);
		    s1.setName("Rakesh");
		    s1.setMarks(91);

		    s2.setRollNo(2);
		    s2.setName("Akshay");
		    s2.setMarks(95);

		    s3.setRollNo(3);
		    s3.setName("Hari");
		    s3.setMarks(93);

		    s4.setRollNo(4);
		    s4.setName("Mahesh");
		    s4.setMarks(96);

		    s5.setRollNo(5);
		    s5.setName("Satish");
		    s5.setMarks(90);

		    s6.setRollNo(6);
		    s6.setName("SaiRam");
		    s6.setMarks(95);

		    s7.setRollNo(7);
		    s7.setName("Shyam");
		    s7.setMarks(77);

		    s8.setRollNo(8);
		    s8.setName("Lokesh");
		    s8.setMarks(88);

		    s9.setRollNo(9);
		    s9.setName("Santhu");
		    s9.setMarks(75);

		    s10.setRollNo(10);
		    s10.setName("Aravind");
		    s10.setMarks(92);

		    s11.setRollNo(11);
		    s11.setName("Sravan");
		    s11.setMarks(75);

		    repo.save(s1);
		    repo.save(s2);
		    repo.save(s3);
		    repo.save(s4);
		    repo.save(s5);
		    repo.save(s6);
		    repo.save(s7);
		    repo.save(s8);
		    repo.save(s9);
			repo.save(s10);
		    repo.save(s11);


		System.out.println(repo.findByName("Rakesh"));
	}

}
