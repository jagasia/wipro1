package com.wipro.swiggy;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.swiggy.model.Food;
import com.wipro.swiggy.model.FoodDaoImpl;

public class App {

	public static void main(String[] args) {
		
//		Food food=new Food(null, "Noodles", "Dinner", 134.0f);
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		FoodDaoImpl fdao=(FoodDaoImpl) ctx.getBean("fdao");
//		fdao.create(food);
//		fdao.update(food);
//		fdao.delete(57);
		
//		List<Food> foods = fdao.read();
//		for(Food f:foods)
//		{
//			System.out.println(f);
//		}
		
		Food f = fdao.read(60);
		System.out.println(f);
		
		System.out.println("Hello world");
	}

}