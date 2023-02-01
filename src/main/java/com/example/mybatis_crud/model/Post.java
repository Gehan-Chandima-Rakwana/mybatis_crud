package com.example.mybatis_crud.model;

import java.util.Date;

public class Post {
    private Integer postId;
    private String title;
    private String content;
    private Date createdOn;

    public Post() {
    }

    public Post(Integer postId, String title, String content, Date createdOn) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.createdOn = createdOn;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
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

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
