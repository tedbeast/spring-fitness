package com.revature.springfitness.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

/**
 * The @Entity annotation informs Spring Data to map this object to a database table as part of a paradigm known as
 * 'object-relational-mapping'. By default, the Table and Column names should match the Class and Field names, but this
 * can be overridden. That means that Spring Data can use an existing 'Painting' table to automatically persist
 * this object as a database record, and it can retrieve 'Painting' objects from the 'Painting' table. Spring Data can
 * even create and modify tables for you, although this would not likely be done on real projects. See the
 * application.properties file in the resources folder for more info. Spring ORM Entities leverage the Hibernate
 * framework - you may see Hibernate when reading Stack traces or researching documentation.
 */
@Entity
public class Workout {
    @Id
    private long id;
    @Column
    private String title;
    @OneToMany
    private List<Plan> plans;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public Workout(){

    }

    public Workout(long id, String title, List<Plan> plans) {
        this.id = id;
        this.title = title;
        this.plans = plans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return id == workout.id && Objects.equals(title, workout.title) && Objects.equals(plans, workout.plans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, plans);
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", plans=" + plans +
                '}';
    }
}
