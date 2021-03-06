package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

      @Override
      public void configure(WebSecurity web) throws Exception {
          web
              .ignoring()
              .antMatchers("/h2-console/**");
      }
//      public void Configure(HttpSecurity httpSecurity) throws Exception{
//      	
//      	httpSecurity
//      		.antMatcher("/").authorizeRequests();  		
//      }
}
