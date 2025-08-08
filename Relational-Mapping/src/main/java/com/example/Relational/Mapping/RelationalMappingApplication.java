package com.example.Relational.Mapping;

import com.example.Relational.Mapping.entities.Post;
import com.example.Relational.Mapping.entities.Profile;
import com.example.Relational.Mapping.entities.User;
import com.example.Relational.Mapping.repo.ProfileRepository;
import com.example.Relational.Mapping.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RelationalMappingApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelationalMappingApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {


//		User user = new User();
//		user.setId(1);
//		user.setName("Harzeen");
//
//		Profile profile = new Profile();
//		profile.setId(100);
//		profile.setBio("Today is Friday");
//
//		user.setProfile(profile);
////		profileRepository.save(profile);
//		profile.setUser(user);
//		userRepository.save(user);
//
//		User foundUser = userRepository.findById(1).get();
//		System.out.println("Profile id - "+ foundUser.getProfile().getId());
//
//
//		Profile foundProfile = profileRepository.findById(100).get();
//		System.out.println("User name - "+ foundProfile.getUser().getName());


		User user = new User();
		user.setId(1);
		user.setName("Harzeen");

		Post post1 = new Post();
		post1.setId(100);
		post1.setContent("Content of Post 1");
		post1.setUser(user);

		Post post2 = new Post();
		post2.setId(200);
		post2.setContent("Content of Post 2");
		post2.setUser(user);

		Post post3 = new Post();
		post3.setId(300);
		post3.setContent("Content of Post 3");
		post3.setUser(user);

		List<Post> postList = List.of(post1, post2, post3);

		user.setPostList(postList);
		userRepository.save(user);


	}
}
