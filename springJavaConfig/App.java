package com.org.springJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.beans.Employee;
import com.org.config.javaConfigureEmp;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfigureEmp.class);
        
        System.out.println("------------------------------------------------------------------");
        System.out.print("|	");
		System.out.print("id");
		System.out.print("	|	");
		System.out.print("name");
		System.out.print("	|	");
		System.out.print("age");
		System.out.print("	|	");
		System.out.print("dep");
		System.out.print("	|	");
		System.out.println(" ");
		System.out.println("------------------------------------------------------------------");
        
		for(int i = 1; i<4; i++) {
			Employee emp = (Employee) context.getBean("emp"+i);
	        emp.display();
		}
        
    }
}
