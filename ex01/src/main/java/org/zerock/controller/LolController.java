package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.LolDTO;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/lol/*")
@Log4j
public class LolController {

	
	@GetMapping("/info")
	public String info(LolDTO dto) {
			
		log.info("" + dto);
	
		return "info";
		}
		
	@PostMapping("/info")
	public String info2(LolDTO dto) {
			
		log.info("" + dto);
	
		return "info";
		}
	
	
}
