package com.example.boardback.Service;

import com.example.boardback.RepositoryJPA.BoardRepository;
import com.example.boardback.VO.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //Repository 호출해서 글 목록 데이터 리턴(반환)하는 메소드

    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

}
