package com.hadine.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// Ctrl + Shift + o --> 임포트 정리해줘요. 

@Controller
public class BoardController {
	// 사용자가 /board 라고 호출하면 동작할 메소드를 만들겠습니다.
	
	
	@GetMapping("/board")
	public ModelAndView board() {// 메소드 만들기
		ModelAndView mv = new ModelAndView("board"); // jsp 파일명
		mv.addObject("name", "홍길동"); // 값 붙이기
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		for (int i = 1; i < 11; i++) {
			BoardDTO e = new BoardDTO(i, "반가워요. 무지예요", "홍길동", "2023-07-"+i, i*10);
			/*e.setBno(i);
			e.setBtitle("반가워요. 무지예요");
			e.setBwrite("무지무지한 무지");
			e.setBdate("2023-07-"+i);
			e.setBlike(i*10);*/
			list.add(e);
			//생성자에 한 줄로 입력하면 
		}
		
		mv.addObject("list", list);
		
		List<Map<String, Object>> list2 = new ArrayList<Map<String,Object>>();
		
		for (int i = 1; i < 10; i++) {
			Map<String, Object> e = new HashMap<String, Object>();
			e.put("bno", i);
			e.put("btitle", "반가워요. 무지예요");
			e.put("bwrite", "무지무지한 무지");
			e.put("bdate", "2023-07-" + i);
			e.put("bdate", "2023-07-13");
			e.put("blike", i*10);
			list2.add(e);
		}
		
		mv.addObject("list2", list2);
		
		return mv;
	}
}
