package com.example.PupilManagementSystem;
import com.example.PupilManagementSystem.entity.Pupil;
import com.example.PupilManagementSystem.repository.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class PupilManagementSystemApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(PupilManagementSystemApplication.class, args);
	}
	@Autowired
	private PupilRepository pupilRepository;

	@Override
	public  void run(String... args) throws Exception{
		Pupil pupil1 = new Pupil("Hanson", "Abraham","ekenehanson@gmail.com");
		pupilRepository.save(pupil1);

		Pupil pupil2 = new Pupil("Bosty", "Bliss","simontony@gmail.com");
		pupilRepository.save(pupil2);

		Pupil pupil3 = new Pupil("Rowland", "Simon","rowland@gmail.com");
		pupilRepository.save(pupil3);
	}
}
