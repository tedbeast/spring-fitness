package com.revature.springfitness.Service;

import com.revature.springfitness.Model.Plan;
import com.revature.springfitness.Model.Workout;
import com.revature.springfitness.Repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The @Service annotation is a stereotype annotation. This means that the @Service annotation, like the @Controller,
 * the @RestController, and the @Repository annotations, are all specialized @Component annotations. @Service, however,
 * does not significantly differ from @Component, and is just used for the logical organization of the project.
 */
@Service
public class WorkoutService {
    WorkoutRepository workoutRepository;
    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository){
        this.workoutRepository = workoutRepository;
    }

    /**
     * Use the findAll method, which is provided by all JPARepositories, to get all workouts.
     * @return all workouts
     */
    public List<Workout> getAllWorkout(){
        return workoutRepository.findAll();
    }

    /**
     * Use the save method, which is provided by all JPARepositorues, to save a workout.
     * @param workout a transient (unpersisted) workout Entity
     * @return a persistent (connected with the database) workout entity
     */
    public Workout addWorkout(Workout workout){
        return workoutRepository.save(workout);
    }
    public Workout getWorkoutById(long id){
        Optional<Workout> workoutOptional = workoutRepository.findById(id);
        return workoutOptional.get();
    }
    public List<Plan> getWorkoutPlans(long id){
        Workout workout = getWorkoutById(id);
        return workout.getPlans();
    }
    public Workout deleteWorkout(long id){
        Optional<Workout> workoutOptional = workoutRepository.findById(id);
        Workout workout = workoutOptional.get();
        workoutRepository.delete(workout);
        return workout;
    }
    public Workout updateWorkoutTitle(long id, Workout newWorkout){
        Optional<Workout> workoutOptional = workoutRepository.findById(id);
        Workout workout = workoutOptional.get();
        workout.setTitle(newWorkout.getTitle());
        workoutRepository.save(workout);
        return workout;
    }
}
