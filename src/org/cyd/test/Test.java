package org.cyd.test;

import org.cyd.course.Course;
import org.cyd.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//Spring�����Ķ���context
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//��springIOC�����л�ȡһ��id��Ϊstudent�Ķ���
		Student stu = (Student)context.getBean("student");
		Course course = (Course)context.getBean("java");
		System.out.print(stu.getStuName());course.learn();
		
	}

}
