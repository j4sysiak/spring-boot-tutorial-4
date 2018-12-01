package com.caveofprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 

@Controller
@SpringBootApplication
public class App extends SpringBootServletInitializer {

	  public static void main(String[] args) throws Exception {
		    SpringApplication.run(App.class, args);
		  }
	  
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(App.class);
	    }

		  @RequestMapping("/")
		  String index() {
		    return "index";
		  }
		  
		  @RequestMapping("/admin")
		  String admin() {
		    return "admin";
		  }

}