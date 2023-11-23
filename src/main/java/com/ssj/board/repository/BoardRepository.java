package com.ssj.board.repository;

import com.ssj.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    // update board_table set board_hits = board_hits + 1 where id = ?
    // 맨뒤에 native = false(default) 는 Entity 방식으로 하려고
    @Modifying
    @Query(value = "update BoardEntity b set b.boardHits = b.boardHits + 1 where b.id =:id")
    void updateHits(@Param("id") Long id);
}
