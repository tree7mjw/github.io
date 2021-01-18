package packT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test1.xml");
		System.out.println("작성자: 문정욱");
		System.out.println("3단 결과:");
		ServiceInter serviceInter =(ServiceInter)context.getBean("serviceImpl");
		serviceInter.gugu_process();

	}
}
