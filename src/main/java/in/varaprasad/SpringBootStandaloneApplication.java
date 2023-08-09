package in.varaprasad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.SQLOutput;

@SpringBootApplication
public class SpringBootStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandaloneApplication.class, args);
        System.out.println("hello");
    }

}
