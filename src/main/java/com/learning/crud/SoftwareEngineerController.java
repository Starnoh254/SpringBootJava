package com.learning.crud;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Starnoh",
                        List.of("Java","Js","Tailwind CSS")
                ),
                new SoftwareEngineer(
                        2,
                        "John",
                        List.of("TS","C++","Angular JS")
                )
        );
    }
}
