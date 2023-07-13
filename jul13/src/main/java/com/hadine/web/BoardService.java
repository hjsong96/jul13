package com.hadine.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//비즈니스 로직 담당

@Service
public class BoardService {
	//DAO랑 연결합니다.
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> boardList() {
		return boardDAO.boardList() ;
	}

}
