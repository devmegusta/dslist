package com.devgusta.dslist.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();

    private Integer positon;

    public Belonging(){

    }

    public Belonging(Game game, GameList list, Integer positon) {
        id.setGame(game);
        id.setList(list);
        this.positon = positon;
    }

    public BelongingPk getId() {
        return id;
    }

    public void setId(BelongingPk id) {
        this.id = id;
    }

    public Integer getPositon() {
        return positon;
    }

    public void setPositon(Integer positon) {
        this.positon = positon;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
