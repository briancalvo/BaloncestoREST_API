package com.briancalvo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Brian on 10/10/2016.
 */
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String location;
    private LocalDate founded;

    /* Constructores */

    public Team(long id,String name, String location, LocalDate founded) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.founded = founded;
    }

    public Team() {
    }

    /* Getters */

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getFounded() {
        return founded;
    }

    /* Setters */

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFounded(LocalDate founded) {
        this.founded = founded;
    }

    @Override
    public String toString() {
        return location + ' ' + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (id != team.id) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (location != null ? !location.equals(team.location) : team.location != null) return false;
        return founded != null ? founded.equals(team.founded) : team.founded == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (founded != null ? founded.hashCode() : 0);
        return result;
    }
}
