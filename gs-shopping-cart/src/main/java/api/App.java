package api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import api.model.Product;
import api.repository.ProductRepository;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public CommandLineRunner dbProduct(ProductRepository repository) {
		return(args) -> {
			
			repository.save(new Product("Gaseosa",40));
			repository.save(new Product("Papas Fritas",30));
			repository.save(new Product("Helado",100));
			repository.save(new Product("Hamburguesas",50));
			repository.save(new Product("Galletitas",20));
			
		};
	}
	
	/*@Bean
	public CommandLineRunner dbUser(UserRepository repository) {
		return(args) -> {
			
			repository.save(new User("Juan","Gonzalez",null));
			repository.save(new User("Federico","Hernandez",null));
			repository.save(new User("Gonzalo","Perez",null));
			repository.save(new User("Pedro","Gonzalez",null));
			repository.save(new User("Juan","Rodriguez",null));
			
		};
	}*/
	
}