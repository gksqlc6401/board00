package org.zerock.board00.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.board00.board.domain.Board;
import org.zerock.board00.board.dto.BoardDTO;
import org.zerock.board00.board.mapper.BoardMapper;


@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper; // 자동으로 주입해줌

    @Override
    public Long register(BoardDTO boardDTO) {

        Board board = boardDTO.getDomain(); //DTO를 VO로 변경

        boardMapper.insert(board);

        return board.getBno();
    }
}
