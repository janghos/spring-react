package com.example.boardback.VO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "board")
@DynamicInsert //insert 시 null 필드 제외하기 위해 사용
@DynamicUpdate // update 시 null 필드 제외하기 위해 사용
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;

    @Column(name = "member_no")
    private Integer memberNo;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "counts")
    private Integer counts;

// ---Getter/Setter ---

}
