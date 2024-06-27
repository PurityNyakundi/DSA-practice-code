package com.example.jaxb;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "date" })
public class Book {
    private Long id;
    private String name;
//    private String author;
    private Date date;

    @XmlElement
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @XmlElement
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

    @XmlElement
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}