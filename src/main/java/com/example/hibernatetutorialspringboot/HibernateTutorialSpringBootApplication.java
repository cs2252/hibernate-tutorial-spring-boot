package com.example.hibernatetutorialspringboot;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Properties;

@SpringBootApplication
public class HibernateTutorialSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateTutorialSpringBootApplication.class, args);



	}
//	@Bean
//	public SessionFactory getSessionFactory(){
//		Properties prop= new Properties();
//
//		prop.setProperty("hibernate.connection.url", "jdbc:mysql://<your-host>:<your-port>/<your-dbname>");
//
//		//You can use any database you want, I had it configured for Postgres
//		prop.setProperty("dialect", "org.hibernate.dialect.PostgresSQL");
//
//		prop.setProperty("hibernate.connection.username", "<your-user>");
//		prop.setProperty("hibernate.connection.password", "<your-password>");
//		prop.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
//		prop.setProperty("show_sql", "true"); //If you wish to see the generated sql query
//
//		SessionFactory sessionFactory = new Configuration().addProperties(prop).buildSessionFactory();
//		return sessionFactory;
//	}

}
