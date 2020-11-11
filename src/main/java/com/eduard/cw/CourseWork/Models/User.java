package com.eduard.cw.CourseWork.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private long id_user;

    @Column(name = "name_user", nullable = false, length = 40)
    private String name_user;

    @Column(name = "role_user", nullable = true, length = 10)
    private String role_user;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Document> documents;

    public User() {}

    public User(long id_user, String name_user, String role_user, List<Document> documents) {
        this.id_user = id_user;
        this.name_user = name_user;
        this.role_user = role_user;
        this.documents = documents;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getRole_user() {
        return role_user;
    }

    public void setRole_user(String role_user) {
        this.role_user = role_user;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
