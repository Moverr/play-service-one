package controllers;

import com.google.inject.Inject;
import core.CalculationSystem;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.HashMap;
import java.util.Map;

import static core.PlayPropertiesHelper.*;

/**
 * just mock for long and quick computation
 * Play! app / non-blocking, functional
 */
public class Application extends Controller {


    @Inject
    private CalculationSystem calculationSystem;


    public F.Promise<Result> doSmallCalculation() {
        return F.Promise.promise(() -> calculationSystem.calculationSmall()) // non-blocking with F.Promise.promise
                .map(x -> {
                    Map<String, Integer> data = new HashMap<>();
                    data.put("result", x);
                    return data;
                })
                .map(Json::toJson)
                .map(jsonResponse -> (Result) ok(jsonResponse))
                .recover(t -> badRequest(t.getMessage() + "\n"));
    }


    public F.Promise<Result> doBigCalculation() {
        return F.Promise.promise(() -> calculationSystem.calculationBig()) // non-blocking with F.Promise.promise
                .map(x -> {
                    Map<String, Integer> data = new HashMap<>();
                    data.put("result", x);
                    return data;
                })
                .map(Json::toJson)
                .map(jsonResponse -> (Result) ok(jsonResponse))
                .recover(t -> badRequest(t.getMessage() + "\n"));
    }




    public Result showRunProperties() {
        return ok(
                "{\n" +
                        " Big delay = " + getBigDelay() + "\n" +
                        " Big exception = " + getBigException() + "\n" +
                        " Small delay = " + getSmallDelay() + "\n" +
                        " Small exception = " + getSmallException() + "\n" +
                        "}"
        );
    }


}
