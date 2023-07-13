package com.hadine.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Ctrl + Shift + o --> 임포트 정리해줘요. 

@Controller
public class BoardController {
	//사용자가 /board 라고 호출하면 동작할 메소드를 만들겠습니다. 
	
	@GetMapping("/board")
	public String board() {//메소드 만들기
		return "board";
	}  
	
}
