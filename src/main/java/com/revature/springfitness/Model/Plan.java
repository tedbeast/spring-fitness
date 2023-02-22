package com.revature.springfitness.Model;

import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
/**
 * The @Entity annotation informs Spring Data to map this object to a database table as part of a paradigm known as
 * 'object-relational-mapping'. By default, the Table and Column names should match the Class and Field names, but this
 * can be overridden. That means that Spring Data can use an existing 'Plan' table to automatically persist
 * this object as a database record, and it can retrieve 'Plan' objects from the 'Plan' table. Spring Data can
 * even create and modify tables for you, although this would not likely be done on real projects. See the
 * application.properties file in the resources folder for more info. Spring ORM Entities leverage the Hibernate
 * framework - you may see Hibernate when reading Stack traces or researching documentation.
 */
@Entity
public class Plan {
    /**
     * Mark this column as the primary key & identifier for this Plan entity.
     * Also, this value should be automatically generated (it will autoincrement).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long planId;
    /**
     * A column of the Plan table
     */
    @Column
    private int numberOfReps;
    /**
     * The ManyToOne annotation will associate this entity with a Workout entity. In the SQL table itself,
     * the Plan table will have a foreign key to the Workout table. If the developer retrieves the Workout Object
     * from this class, it will be a real Workout Entity which is mapped to the database.
     */
    @ManyToOne
    private Workout workout;
}
