package com.mid.cpereport;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AccountRoute extends RouteBuilder {


	@Override
	public void configure() throws Exception {
		

		String sourceDirectory = "D:\\omar\\acountin?recursive=true";
        String inputType = "file:";
        String outType = "file:";
        String destinationDirectory = "D:\\omar\\acountout";

        from(inputType + sourceDirectory )
        .bean(AAtransform.class)
        .to(outType + destinationDirectory);
	}
}
