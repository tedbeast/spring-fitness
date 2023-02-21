package com.revature.springfitness.Controller;
import com.revature.springfitness.Service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Recall that @Controller is a stereotype annotation introduced by Spring MVC (model/view/controller), which
 * allows for the creation of a Component which follows a stereotype Controller pattern. This means that the class can
 * be used to create web endpoints. The @RestController annotation exhibits all the behavior of @Controller, but it
 * also includes the behavior of @ResponseBody, which automatically converts the Objects that are returned by the
 * endpoint methods into JSON response bodies.
 *
 * TODO: write the endpoints below, and write their implementations in PlanService.
 */
@RestController
public class PlanController {
    PlanService planService;
    @Autowired
    public PlanController(PlanService planService){
        this.planService = planService;
    }
    /**
     * TODO: create an endpoint for GET localhost:9000/plan that returns all plans.
     * For instance, a request to GET localhost:9000/plan should respond with
     * [{},{}]
     */

    /**
     * TODO: create an endpoint for POST localhost:/9000/plan that adds a new plan and responds with the added plan.
     * For instance, a request to POST localhost:9000/plan that contains the request body
     * {}
     * should respond with
     * {}
     */

    /**
     * TODO: create an endpoint for GET localhost:9000/plan/{id} that returns the plan with an id.
     * For instance, a request to GET localhost:9000/plan/1 should respond with
     * {}
     */

    /**
     * TODO: create an endpoint for GET localhost:9000/plan/{id} that returns the plan with an id.
     * For instance, a request to GET localhost:9000/plan/1 should respond with
     * {}
     */

    /**
     * TODO: create an endpoint for GET localhost:9000/plan/{id}/workout that responds with a plan's associated workout
     * For instance, a request to POST localhost:9000/plan/1/workout should respond with
     * {}
     */

    /**
     * TODO: create an endpoint for DELETE localhost:9000/plan/{id}/workout that deletes a plan and responds with the deleted plan
     * For instance, a request to DELETE localhost:9000/plan/1/workout should delete the plan and respond with
     * {}
     */

    /**
     * TODO: create an endpoint for PATCH localhost:9000/plan/{id} that updates a plan's reps and responds with the full
     * updated object
     * For instance, a request to PATCH localhost:9000/plan/1 containing the request body
     * {}
     * should update the plan with id 1 and respond with
     * {}
     */
}
