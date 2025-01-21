package com.desafio_backend.game.dto;

import com.desafio_backend.game.entities.Game;

public class GameDTO {
    private final long id;
    private final String title;
    private final Integer year;
    private final String imgUrl;
    private final String shortDescription;

    public GameDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
