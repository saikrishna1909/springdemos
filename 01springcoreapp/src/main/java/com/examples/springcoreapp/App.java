package com.examples.springcoreapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/springcoreapp/springconfig.xml");
//        Employee emp=(Employee)ctx.getBean("emp");
////        Employee e=(Employee)ctx.getBean("emp1");
////        Employee e1=(Employee)ctx.getBean("emp2");
////        Employee e2=(Employee)ctx.getBean("emp3");
////        Employee e3=(Employee)ctx.getBean("emp4");
////        Employee e4=(Employee)ctx.getBean("emp5");
//        Employee e5=(Employee)ctx.getBean("emp7");
//        System.out.println(emp);
////        System.out.println(e);
////        System.out.println(e1);
////        System.out.println(e2);
////        System.out.println(e3);
////        System.out.println(e4);
//        System.out.println(e5);
//    	 demo1();
    	 demo2();
    }

	private static void demo2() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/springcoreapp/springconfig4.xml");
    	EmployeeDAO e=(EmployeeDAO)ctx.getBean("empdao");
    	 System.out.println(e);
	}

	private static void demo1() {
		demo2();
	}
}
