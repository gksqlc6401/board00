package org.zerock.board00.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.board00.board.dto.BoardDTO;
import org.zerock.board00.board.service.BoardService;
import org.zerock.board00.board.service.TimeService;

@Controller
@RequestMapping("/board/*")//get,post 합친거
@Log4j2
@RequiredArgsConstructor//final
public class BoardController {

    private final TimeService timeService;

    private final BoardService boardService;

    @GetMapping("/time")
    public void getTime(Model model) {
        log.info("====================getTime=================");
        model.addAttribute("time",timeService.getNow());
    }

    @PostMapping("/register")
    public String registerPost(BoardDTO boardDTO){ // 리다이렉트 하려고 String사용

        log.info("boardDTOM           " + boardDTO);

        Long bno = boardService.register(boardDTO);

        return "redirect:/board/list";
    }

}
