package in.cg.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/")
public class Api {
	
	@GetMapping("/book/{bookId}")
	public String displayBook(@PathVariable("bookId") int bookId) {
		return "{\r\n" + 
				"    \"bookId\":" + bookId + ",\r\n" + 
				"    \"price\": 800\r\n" + 
				"}";
	}

	
}
