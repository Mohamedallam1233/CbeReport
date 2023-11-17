package itss.mid.CbeReprts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mid.cpereport")

@SpringBootApplication
public class CbeReprtsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CbeReprtsApplication.class, args);
	}

}
