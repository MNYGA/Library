package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(name = "ISBN")
    protected Long ISBN;
    @Column(name = "TITLE")
    protected String title; //final?
    @Column(name = "AUTHOR")
    protected String author;
    @Column(name = "PUBLISHER")
    protected String publisher;
    @Column(name = "RENTAL_TIME")
    protected int rentalTime;

    //relacja z userem

}
