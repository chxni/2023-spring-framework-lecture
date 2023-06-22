package com.ohgiraffers.section01.manytoone;

import javax.persistence.*;
import java.util.Date;

@Entity(name="board_and_user")
@Table(name="tbl_board")
public class BoardAndUser {

    @Id
    @Column(name="board_id")
    private int boardId;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @JoinColumn(name="writer")
    @ManyToOne
    private User user;

    @Column(name="created_date")
    private Date createdDate;

    public BoardAndUser() {
    }

    public BoardAndUser(int boardId, String title, String content, User user, Date createdDate) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.user = user;
        this.createdDate = createdDate;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "BoardAndUser{" +
                "boardId=" + boardId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", createdDate=" + createdDate +
                '}';
    }
}
