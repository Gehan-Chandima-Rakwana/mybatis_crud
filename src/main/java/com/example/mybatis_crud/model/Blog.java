package com.example.mybatis_crud.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private Integer blogId;
    private String blogName;
    private Date createdOn;
    private List<Post> posts = new ArrayList<Post>();

    public Blog() {
    }

    public Blog(Integer blogId, String blogName, Date createdOn, List<Post> posts) {
        this.blogId = blogId;
        this.blogName = blogName;
        this.createdOn = createdOn;
        this.posts = posts;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
