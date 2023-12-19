package com.ssj.member.entity;

import com.ssj.board.entity.BaseEntity;
import lombok.*;

import javax.management.relation.Role;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "board_member")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String nickname;

    @Column(nullable = false, length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
