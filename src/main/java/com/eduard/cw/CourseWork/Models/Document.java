package com.eduard.cw.CourseWork.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_document")
    private Long id_document;

    @Column(name = "name_document", nullable = false, length = 40)
    private String name_document;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_document", nullable = false)
    private User user;

    @Column(name = "current_version_document", nullable = false)
    private Integer current_version_document;

    @OneToMany(mappedBy = "previous_version_document", fetch = FetchType.LAZY)
    private List<Previous_document> previous_versions_document;

    @Column(name = "path_document", nullable = false, length = 200)
    private String path_document;

    public Document() {}

    public Document(Long id_document, String name_document, User user,
                    Integer current_version_document, List<Previous_document> previous_versions_document,
                    String path_document) {
        this.id_document = id_document;
        this.name_document = name_document;
        this.user = user;
        this.current_version_document = current_version_document;
        this.previous_versions_document = previous_versions_document;
        this.path_document = path_document;
    }

    public Long getId_document() {
        return id_document;
    }

    public void setId_document(Long id_document) {
        this.id_document = id_document;
    }

    public String getName_document() {
        return name_document;
    }

    public void setName_document(String name_document) {
        this.name_document = name_document;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCurrent_version_document() {
        return current_version_document;
    }

    public void setCurrent_version_document(Integer current_version_document) {
        this.current_version_document = current_version_document;
    }

    public List<Previous_document> getPrevious_versions_document() {
        return previous_versions_document;
    }

    public void setPrevious_versions_document(List<Previous_document> previous_versions_document) {
        this.previous_versions_document = previous_versions_document;
    }

    public String getPath_document() {
        return path_document;
    }

    public void setPath_document(String path_document) {
        this.path_document = path_document;
    }
}
