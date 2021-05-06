package com.springrest.springrest.imdb.models;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vladmihalcea.hibernate.type.array.ListArrayType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "movies")
@TypeDef(
    name = "list-array",
    typeClass = ListArrayType.class
)
public class Movies {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(name="name" ,columnDefinition="TEXT")
    private String name;

    @Column(name="plot", columnDefinition="TEXT")
    private String plot;

    @Column(name="poster", columnDefinition="VARCHAR")
    private String poster;

    @Column(name="producer", columnDefinition="TEXT")
    private String producer;
    
    @Type(type = "list-array")
    @Column(name="actors", columnDefinition="TEXT[]")
    private List<String> actors;

    public Movies(){}
    public Movies(String name, String plot, String poster, String producer, List<String> actors){
        System.out.println(actors);
        this.id = UUID.randomUUID();
        this.name = name;
        this.plot = plot;
        this.poster = poster;
        this.producer = producer;
        this.actors = actors;
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPlot() {
        return plot;
    }
    public String getPoster() {
        return poster;
    }
    public String getProducer() {
        return producer;
    }
    public List<String> getActors() {
        return actors;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlot(String plot) {
        this.plot = plot;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setActors(List<String> actors) {
        this.actors = actors;
    }
    @Override
    public String toString() {
        return "Movies{" + 
            "id=" + id +
            ", name='" + name + '\'' +
            ", plot='" + plot + '\'' +
            ", poster='" + poster + '\'' +
            ", producer='" + producer + '\'' +
            ", actors='" + actors + '}';
    }
}
