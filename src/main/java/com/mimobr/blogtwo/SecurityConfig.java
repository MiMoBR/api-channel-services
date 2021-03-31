package com.mimobr.blogtwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
	    .antMatchers("/api/postContent/**").authenticated()
	    .antMatchers("/api/deleteByIdContent/**").authenticated()
	    .antMatchers("/api/updateAPost/**").authenticated()
	    .antMatchers("/api/getList/**").permitAll()
	    .antMatchers("/api/validateLogin/**").permitAll();
		
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.antMatchers(antPatterns)
//	}
//	
	//@Autowired
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {/*http://localhost:8080/*/
//		auth.inMemoryAuthentication()
//		.withUser("juan")
//		.password("123")
//		.roles("USER");
//	}

//	@Bean
//	public PasswordEncoder getPasswordEncoder(){
//		return NoOpPasswordEncoder.getInstance();
//	}
}

