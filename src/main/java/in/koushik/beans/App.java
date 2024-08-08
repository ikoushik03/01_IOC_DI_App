package in.koushik.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		PetrolEngine p = context.getBean(PetrolEngine.class);
//		p.start();

		Car car = context.getBean(Car.class);
		car.drive();
		
		
		
	}

}
