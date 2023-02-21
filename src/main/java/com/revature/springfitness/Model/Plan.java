package com.revature.springfitness.Model;

import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Plan {
    @Id
    private long planId;
    @Column
    private int numberOfReps;
    @ManyToOne
    private Workout workout;
}
