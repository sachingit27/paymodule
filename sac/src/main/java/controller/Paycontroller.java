package controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin()
public class Paycontroller {

	//Show all subscriber API
		@RequestMapping("/showallsubscriber") 
		public void showallemployee() {
			System.out.println("Below are list of subscriber list");
		}
 

}
