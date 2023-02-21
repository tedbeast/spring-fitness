package com.revature.springfitness.Controller;

import com.revature.springfitness.Model.Plan;
import com.revature.springfitness.Model.Workout;
import com.revature.springfitness.Service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Recall that @Controller is a stereotype annotation introduced by Spring MVC (model/view/controller), which
 * allows for the creation of a Component which follows a stereotype Controller pattern. This means that the class can
 * be used to create web endpoints. The @RestController annotation exhibits all the behavior of @Controller, but it
 * also includes the behavior of @ResponseBody, which automatically converts the Objects that are returned by the
 * endpoint methods into JSON response bodies.
 */
@RestController
public class WorkoutController {
    WorkoutService workoutService;
    /**
     * Autowire a workoutService into this class via Constructor injection.
     * @param workoutService WorkoutService bean
     */
    @Autowired
    public WorkoutController(WorkoutService workoutService){
        this.workoutService = workoutService;
    }
    /**
     * Endpoint on GET localhost:8080/workout should respond with a JSON containing all workouts.
     * For instance, GET localhost:8080/workout could respond with
     * [{}, {}]
     * @return
     */
    @GetMapping("workout")
    public List<Workout> getAllWorkout(){
        return workoutService.getAllWorkout();
    }
    /**
     * Endpoint on POST localhost:8080/workout should add a new workout and respond with a JSON of the added workout
     * For instance, POST localhost:8080/workout containing
     * {}
     * should insert the workout and respond with
     * {}
     */
    @PostMapping("workout")
    public Workout postWorkout(@RequestBody Workout workout){
        return workoutService.addWorkout(workout);
    }
    /**
     * Endpoint on GET localhost:8080/workout/{id} should respond with a JSON containing all workouts.
     * For instance, GET localhost:8080/workout/1 could respond with
     * {}
     */
    @GetMapping("workout/{id}")
    public Workout getWorkoutById(@PathVariable long id){
        return workoutService.getWorkoutById(id);
    }
    /**
     * Endpoint on GET localhost:8080/workout/{id}/plan should respond with a JSON of the plans of a workout.
     * For instance, GET localhost:8080/workout/1/plan should respond with
     * [{},{}]
     */
    @GetMapping("workout/{id}/plan")
    public List<Plan> getWorkoutPlans(@PathVariable long id){
        return workoutService.getWorkoutPlans(id);
    }
    /**
     * Endpoint on DELETE localhost:8080/workout/{id} should delete the workout and respond with the deleted workout.
     * For instance, DELETE localhost:8080/workout/1 should delete the workout and respond with
     * {}
     */
    @DeleteMapping("workout/{id}")
    public Workout deleteWorkout(@PathVariable long id){
        return workoutService.deleteWorkout(id);
    }
    /**
     * Endpoint on PATCH localhost:8080/workout/{id} should update the workout title and respond with the updated workout.
     * For instance, PATCH localhost:8080/workout/1 with the request body
     * {}
     * should update the workout and respond with
     * {}
     */
    @PatchMapping("workout/{id}")
    public Workout deleteWorkout(@PathVariable long id, @RequestBody Workout workout){
        return workoutService.updateWorkoutTitle(id, workout);
    }

}
