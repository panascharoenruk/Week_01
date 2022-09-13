package com.example.week_01;
import java.lang.Math;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratePasswordService {

    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name){
        int b = (int)(Math.random()*(999999999-100000000+1)+999999999);
        return "Hi," + name + "\nYour new password is " + b + ".";
    }

}
