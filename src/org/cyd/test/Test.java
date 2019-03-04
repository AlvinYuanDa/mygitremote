package org.cyd.test;

import org.cyd.course.Course;
import org.cyd.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//Spring上下文对象：context
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//从springIOC容器中获取一个id名为student的对象
		Student stu = (Student)context.getBean("student");
		Course course = (Course)context.getBean("java");
		System.out.print(stu.getStuName());course.learn();
		
	}

}
