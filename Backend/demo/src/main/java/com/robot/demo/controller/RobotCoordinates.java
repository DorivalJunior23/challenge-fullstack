package com.robot.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.robot.demo.service.RobotService;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*", maxAge = 1000)
public class RobotCoordinates {
    final RobotService robotService;

    public RobotCoordinates(RobotService botService){
        this.robotService = botService;
    }

    @GetMapping("/mars/{comand}")
    public @ResponseBody String mars(@PathVariable String comand) {
        this.robotService.setX(0);
        this.robotService.setY(0);
        this.robotService.setDirection('N');
        if(!this.robotService.validate(comand)) {
            return "Comando inválido.";
        }
        try{
        String coordinates = this.robotService.robotCoordinatesOnMars(comand);
        return coordinates;
        } catch(Error e) {
            return "Posicao inválida.";
        }
    }
}
