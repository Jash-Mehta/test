package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Customerdetail {
	@GetMapping("FirstPage")
      public String Airline() {
    	  return"FirstPage";
      }
	@PostMapping("details")
	public String viewdetails(@RequestParam("cname") String cname,
			@RequestParam("cAge") int cAge,
			@RequestParam("cGender") String cGender,
			@RequestParam("cContact") int cContact,
			@RequestParam("cReservation") int cReservation,ModelMap modelmap) 
		
	{
		modelmap.put("cname", cname);
		modelmap.put("cAge", cAge);
		modelmap.put("cGender", cGender);
		modelmap.put("cContact", cContact);
		modelmap.put("cReservation", cReservation);
		return "Customerdetail";
	}
	
       
}
