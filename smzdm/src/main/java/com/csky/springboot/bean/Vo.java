package com.csky.springboot.bean;

public class Vo {
    int like;
    User user;
    News news;

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "like=" + like +
                ", user=" + user +
                ", news=" + news +
                '}';
    }
}
