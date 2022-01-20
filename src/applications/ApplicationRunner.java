package applications;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.models.client;

import ma.cigma.pfe.presentation.clientcontroller;

public class ApplicationRunner {
public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		clientcontroller ctr= (clientcontroller) ctx.getBean("idCtrl");
		client client = new client("ilyass");
		CarteFidelio carteFidelio = new CarteFidelio("AB48929308");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);
		ctr.save(client);

	}
}
