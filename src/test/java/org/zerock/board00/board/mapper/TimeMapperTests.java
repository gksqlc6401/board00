package org.zerock.board00.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.board00.board.config.BoardRootConfig;
import org.zerock.board00.common.config.RootConfig;

@SuppressWarnings("ALL")
@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {BoardRootConfig.class, RootConfig.class})//common에있는 클래스도 받아온다.
public class TimeMapperTests {

    @Autowired
    TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        log.info("----------------------------");
        log.info("----------------------------");
        log.info(timeMapper.getTime2());
        log.info("----------------------------");
        log.info("----------------------------");
    }
}
