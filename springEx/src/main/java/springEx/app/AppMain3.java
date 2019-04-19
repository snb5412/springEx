package springEx.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import springEx.config.AppConfig;
import springEx.device.Camera;

public class AppMain3 {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Camera c1 = ctx.getBean(Camera.class);
		c1.setId(0);
		Camera c2 = ctx.getBean(Camera.class);
		c2.setId(1);
		Camera c3 = ctx.getBean(Camera.class);
		c3.setId(2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		ctx.close();
	}

}
