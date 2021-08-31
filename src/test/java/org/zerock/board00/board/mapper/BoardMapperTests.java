package org.zerock.board00.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.board00.board.config.BoardRootConfig;
import org.zerock.board00.board.domain.Board;
import org.zerock.board00.common.config.RootConfig;

import java.util.stream.IntStream;

@SuppressWarnings("ALL")
@Log4j2
@ExtendWith(SpringExtension.class)//해당코드가 스프링 실행 역활한다고 알려준다(스프링한테 나이거 실행할거야! 라고 말함)
@ContextConfiguration(classes = {BoardRootConfig.class, RootConfig.class})//common에있는 클래스도 받아온다, 지정된 클래스나 문자열을 이용해서 필요한 객체등록.
public class BoardMapperTests {

    @Autowired
    BoardMapper boardMapper;

    @Test
    public void testDummies(){

        IntStream.rangeClosed(1,100).forEach(i -> {
            Board board = Board.builder()
                    .title("title" + i)
                    .content("content" + i)
                    .writer("user" + (i % 10))
                    .build();
            boardMapper.insert(board);
        });
    }
}
