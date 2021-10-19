package be.pxl.services.department;


import be.pxl.services.department.model.Department;
import be.pxl.services.department.repository.DepartmentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class DepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentApplication.class, args);
	}
//
//	@Bean
//	public Docket swaggerPersonApi10() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//					.apis(RequestHandlerSelectors.basePackage("be.pxl.services.department.controller"))
//					.paths(PathSelectors.any())
//				.build()
//				.apiInfo(new ApiInfoBuilder().version("1.0").title("Department API").description("Documentation Department API v1.0").build());
//	}
//
	@Bean
	DepartmentRepository repository() {
		DepartmentRepository repository = new DepartmentRepository();
		repository.add(new Department(1L, "Development"));
		repository.add(new Department(1L, "Operations"));
		repository.add(new Department(2L, "Development"));
		repository.add(new Department(2L, "Operations"));
		return repository;
	}

}
