package com.springrest.springrest.imdb.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actors {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(name="name", columnDefinition = "TEXT")
    private String name;

    @Column(name="bio", columnDefinition = "TEXT")
    private String bio;
    
    @Column(name="sex", columnDefinition = "TEXT")
    private String sex;

    public Actors(){}
    public Actors(String name, String bio, String sex){
        this.id = UUID.randomUUID();
        this.name = name;
        this.bio = bio;
        this.sex = sex;
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBio() {
        return bio;
    }
    public String getSex() {
        return sex;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Actors{" + 
            "id=" + id +
            ", name='" + name + '\'' +
            ", bio='" + bio + '\'' +
            // ", dob='" + dob + '\'' +
            ", sex='" + sex + '}';
    }
}
