package com.revature.springfitness.Service;

import com.revature.springfitness.Model.Plan;
import com.revature.springfitness.Repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The @Service annotation is a stereotype annotation. This means that the @Service annotation, like the @Controller,
 * the @RestController, and the @Repository annotations, are all specialized @Component annotations. @Service, however,
 * does not significantly differ from @Component, and is just used for the logical organization of the project.
 *
 * TODO: implement the Service methods below by interacting with the PlanRepository's built in methods
 */
@Service
public class PlanService {
    PlanRepository planRepository;
    @Autowired
    public PlanService(PlanRepository planRepository){
        this.planRepository = planRepository;
    }
    /**
     * TODO: return all plans from the PlanRepository
     */
    public List<Plan> getAllPlan(){
        return null;
    }
    /**
     * TODO: return a plan of a specific ID from the PlanRepository
     */
    public Plan getPlanById(){
        return null;
    }
    /**
     * TODO: return a plan a
     */
}
