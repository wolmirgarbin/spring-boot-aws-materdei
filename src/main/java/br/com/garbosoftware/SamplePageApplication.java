package br.com.garbosoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@SpringBootApplication
@Controller
public class SamplePageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplePageApplication.class, args);
	}


	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("hora", new Date());
		return "index";
	}

}
