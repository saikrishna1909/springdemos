package com.examples.stereotypesdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/stereotypesdemo/springconfig.xml");
    	Instructor e=(Instructor)ctx.getBean("instructor");
    	 System.out.println(e);
    }
}
