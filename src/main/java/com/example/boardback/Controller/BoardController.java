package com.example.boardback.Controller;

import com.example.boardback.Service.BoardService;
import com.example.boardback.VO.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public List<Board> getAllBoards() {
        return boardService.getAllBoard();
    }


}
