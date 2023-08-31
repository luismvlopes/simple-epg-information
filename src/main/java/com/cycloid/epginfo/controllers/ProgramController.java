package com.cycloid.epginfo.controllers;

import com.cycloid.epginfo.controllers.dtos.ProgramDto;
import com.cycloid.epginfo.services.ProgramService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramController {

    @PostMapping(path = "/programs/create")
    public ResponseEntity<String> createNewProgram(@RequestBody ProgramDto programDto) {
        boolean isCreated = ProgramService.createNewProgram(programDto);
        if (isCreated) {
            return ResponseEntity.ok("Program created");
        } else {
            return ResponseEntity.badRequest().body("Something's wrong");
        }
    };


    // TODO: provide all programs by channel id
    // TODO: Endpoint that provides program detail by id
    // TODO: Endpoint to delete program by id
    // TODO: Endpoint to update program by id
    
}
