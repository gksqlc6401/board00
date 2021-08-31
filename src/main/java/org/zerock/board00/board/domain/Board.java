package org.zerock.board00.board.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {//읽기 전용-> //entity :

    private Long bno;
    private String title,content,writer;
    private LocalDateTime regDate,modDate;

}
