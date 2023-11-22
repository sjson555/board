package com.ssj.board.dto;

import lombok.*;

import java.time.LocalDateTime;

/*
* DTO(Data Transfer Object)
* VO
* Bean
* 위의 세가지는 비슷한 목적을 가진 클래스
*/

/*
* Lombok getter, setter
*/
@Getter
@Setter
@ToString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
