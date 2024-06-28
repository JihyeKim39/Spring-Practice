package com.borard.simple_board.board.service;

import javax.persistence.Entity;

import org.springframework.stereotype.Service;

import com.borard.simple_board.board.db.BoardEntity;
import com.borard.simple_board.board.db.BoardRepository;
import com.borard.simple_board.board.model.BoardRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private BoardRepository boardRepository;
	
	public BoardEntity create(
			BoardRequest boardRequest
			) {
		BoardEntity.builder()
		.boaradName(boardRequest.getBoaradName())
		.status("REGISTERED")
		;
		
		return boardRepository.save(entity);
	}
	
}
