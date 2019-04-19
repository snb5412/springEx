package springEx.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import springEx.config.AppConfig;
import springEx.service.ArticleService;


public class AppMain2 {

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ArticleService s1 = ctx.getBean("articleServiceImpl",ArticleService.class);
		ArticleService s2 = ctx.getBean("articleServiceImpl",ArticleService.class);
		
		if(s1==s2) {
			System.out.println("싱글톤");
		} else {
			System.out.println("싱글톤 No");
		}
		
		ArticleService s3 = ctx.getBean("articleServiceImpl",ArticleService.class);
		if(s1==s3) {
			System.out.println("싱글톤");
		} else {
			System.out.println("싱글톤 No");
		}
		
		ctx.close();
	}

}
