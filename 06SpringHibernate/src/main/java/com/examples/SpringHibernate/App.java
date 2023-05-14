package com.examples.SpringHibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.SpringHibernate.Dao.ProductDao;
import com.examples.SpringHibernate.Entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringHibernate/springconfig.xml");
    	ProductDao productDao=(ProductDao)ctx.getBean("productdao");
    	Product product=new Product();
    	product.setId(1);
    	product.setName("Max");
    	product.setDescription("Hii Max");
    	product.setPrice(50000);
    	int result=productDao.create(product);
    	System.out.println(result);
    }
}
