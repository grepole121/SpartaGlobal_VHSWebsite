package com.sparta.eng87.spartaglobal_vhswebsite.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FilmActorEntityPK implements Serializable {
    private Integer actorId;
    private Integer filmId;

    @Column(name = "actor_id")
    @Id
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    @Column(name = "film_id")
    @Id
    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmActorEntityPK that = (FilmActorEntityPK) o;

        if (actorId != null ? !actorId.equals(that.actorId) : that.actorId != null) return false;
        if (filmId != null ? !filmId.equals(that.filmId) : that.filmId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actorId != null ? actorId.hashCode() : 0;
        result = 31 * result + (filmId != null ? filmId.hashCode() : 0);
        return result;
    }
}
