package team15.homelessappclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import team15.homelessappclient.client.ApiClient;
import team15.homelessappclient.model.ServiceCategory;

@SpringBootApplication
public class HomelessAppClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomelessAppClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApiClient client) {
        return args -> {
            System.out.println("Testing API to get all Service Categories...");

            // Get All Service Categories
            ServiceCategory[] serviceCategories = client.getAllServiceCategories();
            System.out.println("All Service Categories: ");
            for (ServiceCategory category : serviceCategories) {
                System.out.println(category);
            }
        };
    }
}
