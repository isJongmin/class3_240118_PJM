package com.itwillbs.test_pjm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/BoardList")
	public String boardList() {
//		return "board_list";
		return "redirect:/BoardList2";
	}
	
}
