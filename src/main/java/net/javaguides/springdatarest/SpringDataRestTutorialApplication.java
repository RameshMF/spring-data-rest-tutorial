package net.javaguides.springdatarest;

import net.javaguides.springdatarest.entity.User;
import net.javaguides.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = User.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.email("ramesh@gmail.com")
				.build();

		userRepository.save(user);

		User user1 = User.builder()
				.firstName("John")
				.lastName("Cena")
				.email("cena@gmail.com")
				.build();

		userRepository.save(user1);

		User user2 = User.builder()
				.firstName("tony")
				.lastName("stark")
				.email("tony@gmail.com")
				.build();

		userRepository.save(user2);

		User user3 = User.builder()
				.firstName("sanjay")
				.lastName("jadhav")
				.email("sanjay@gmail.com")
				.build();

		userRepository.save(user3);

		User user4 = User.builder()
				.firstName("Amir")
				.lastName("Khan")
				.email("amir@gmail.com")
				.build();

		userRepository.save(user4);

	}
}
