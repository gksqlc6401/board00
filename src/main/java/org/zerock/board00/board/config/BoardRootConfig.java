package org.zerock.board00.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//나이거 객체로 쓸게!
@MapperScan(basePackages = "org.zerock.board00.board.mapper")//객체가 있는 패키지
@ComponentScan(basePackages = "org.zerock.board00.board.service")
public class BoardRootConfig {

}


