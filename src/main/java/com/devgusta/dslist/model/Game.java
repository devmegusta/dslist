package com.devgusta.dslist.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "tb_game")
public class Game {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String titlle;
    @Column (name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private Double score;
    private String imgUrl;
    private String shortDiscription;
    private String longDiscription;

    public Game(){
    }

    public Game(Long id, String longDiscription, String shortDiscription, String imgUrl, Double score, String platform, String genre, Integer year, String titlle) {
        this.id = id;
        this.longDiscription = longDiscription;
        this.shortDiscription = shortDiscription;
        this.imgUrl = imgUrl;
        this.score = score;
        this.platform = platform;
        this.genre = genre;
        this.year = year;
        this.titlle = titlle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitlle() {
        return titlle;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDiscription() {
        return shortDiscription;
    }

    public void setShortDiscription(String shortDiscription) {
        this.shortDiscription = shortDiscription;
    }

    public String getLongDiscription() {
        return longDiscription;
    }

    public void setLongDiscription(String longDiscription) {
        this.longDiscription = longDiscription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
