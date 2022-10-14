package com.example.library.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"book", "password", "role"})
@ToString


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(name = "NAME")
    protected String name;
    @Column(name = "EMAIL")
    protected String email;
    @Column(name = "PASSWORD")
    protected String password;
    @Column(name = "ROLE")
    @Enumerated(EnumType.STRING)
    private UserLevel role;

    @ManyToMany
    @JoinTable(
            name = "rentals",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    public Set<Book> book = new HashSet<>();

    //DTO
    }

