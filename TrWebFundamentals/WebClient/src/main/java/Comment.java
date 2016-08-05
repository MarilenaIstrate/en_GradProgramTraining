

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Comment {

    private long id;

    private String name;
    private String email;
    private String comment;
    private Date date;

    public Comment() {

    }

    public Comment(long id, Date date, String comment, String email, String name) {
        this.id = id;
        this.date = date;
        this.comment = comment;
        this.email = email;
        this.name = name;
    }

    public Comment(Date date, String comment, String email, String name) {
        this.date = date;
        this.comment = comment;
        this.email = email;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}

