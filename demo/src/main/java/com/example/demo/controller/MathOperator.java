package com.example.demo.controller;

import com.example.demo.entity.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathOperator {

   @GetMapping(value = "")
   @ApiOperation(value = "says hello", notes = "prints a welcome message to the users")
   @ResponseStatus(HttpStatus.OK)
   @ApiResponses({
           @ApiResponse(code = 400, message = "SUCCESS"),
           @ApiResponse(code = 500, message = "internal error from spring", response = String.class),
           @ApiResponse(code = 202, message = "created")
   })
    public String welcomeMathMsg(){
        return "welcome";
   }

   @GetMapping(value = "division-info")
   @ApiOperation(value = "details of division", notes = "prints all the details of division")
   @ResponseStatus(HttpStatus.OK)
   @ApiResponses({
           @ApiResponse(code = 400, message = "SUCCESS"),
           @ApiResponse(code = 500, message = "internal error from spring", response = String.class),
           @ApiResponse(code = 202, message = "created")
   })
   public ArithmeticOperation divisionInfo(){
       return new ArithmeticOperation();
   }

   @GetMapping(value = "multiplication")
   @ApiOperation(value = "calculates the multiplication of the values",
           notes = "prints the result of the multiplication ")
   @ResponseStatus(HttpStatus.OK)
   @ApiResponses({
           @ApiResponse(code = 400, message = "SUCCESS"),
           @ApiResponse(code = 500, message = "internal error from spring", response = String.class),
           @ApiResponse(code = 202, message = "created")
   })
   public int multiplicationOperation(int param1, int param2){
       return param1*param2 ;
   }

   @GetMapping(value = "square/{n}")
   @ApiOperation(value = "calculates the square of n", notes = "prints the square of n")
  @ResponseStatus(HttpStatus.OK)
   @ApiResponses({
           @ApiResponse(code = 400, message = "SUCCESS"),
           @ApiResponse(code = 500, message = "internal error from spring", response = String.class),
           @ApiResponse(code = 202, message = "created")
   })
   public float squareOfN(int n){
       return n*n;
   }

}
