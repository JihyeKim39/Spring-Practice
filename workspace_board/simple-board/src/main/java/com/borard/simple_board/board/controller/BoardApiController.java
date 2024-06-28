package com.borard.simple_board.board.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.borard.simple_board.board.model.BoardRequest;
import com.borard.simple_board.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/board") // 요청을 받기 위해 모델 필요함 -> board.model 패키지 만들기 
@RequiredArgsConstructor
public class BoardApiController {
	
	private final BoardService boardService;
	
	
	@PostMapping("")
	public void create() {
		@Valid
		BoardRequest boardRequest;
	}{
		return boardService.create(BoardRequest);
	}
}