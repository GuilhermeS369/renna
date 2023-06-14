package com.alice.renna.config;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.alice.renna.domain.Post;
import com.alice.renna.domain.User;
import com.alice.renna.dto.AuthorDTO;
import com.alice.renna.dto.CommentDTO;
import com.alice.renna.repository.PostRepository;
import com.alice.renna.repository.UserRepository;


@Configuration
public class Instantiation implements CommandLineRunner{
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("16/07/2022"),"Partiu viagem!", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("16/07/2022"),"Chacara da Paisagem","Revoadinha galera, bora!", new AuthorDTO(bob));
		
		CommentDTO c1 = new CommentDTO("Boa sorte!", sdf.parse("01/01/1990") , new AuthorDTO(alex));
		CommentDTO c2 = new CommentDTO("Que daora", sdf.parse("01/01/1990") , new AuthorDTO(maria));
		
		post1.getCommentDTO().addAll(Arrays.asList(c1,c2));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1,post2));
		
		userRepository.save(maria);*/
		
		
	}

}
