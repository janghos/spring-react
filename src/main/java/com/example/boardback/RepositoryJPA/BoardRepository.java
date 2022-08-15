package com.example.boardback.RepositoryJPA;

import com.example.boardback.VO.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
