package com.csky.springboot.bean;

import java.util.Date;

public class News {
    int id;
    int likeCount;
    int commentCount;
    String link;
    String title;
    String image;
    Date createdDate;

    public News() {
    }

    public News(int id, int likeCount, int commentCount, String link,String title, String image, Date createdDate) {
        this.id = id;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.link=link;
        this.title = title;
        this.image = image;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", likeCount=" + likeCount +
                ", commentCount=" + commentCount +
                ", link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
