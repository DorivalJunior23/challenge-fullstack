package com.robot.demo.service;

import org.springframework.stereotype.Service;


@Service
public class RobotService{
    private int x = 0;
    private int y = 0;
    private char direction = 'N';

    public String robotCoordinatesOnMars(String comand) {
        String aux = comand.toLowerCase();
        char[] commands = aux.toCharArray();
        for(int i=0;i<commands.length;i++) {
            if(Character.compare(commands[i], 'r') == 0){turnRight();}
            else if(Character.compare(commands[i], 'l') == 0){turnLeft();}
            else if(Character.compare(commands[i], 'm') == 0){move();}
        }

        if(y < 0 || y > 4) { throw new Error();}
        if(x < 0 || x > 4) { throw new Error();}
        

        return "("+ x + "," + y + "," + direction + ")" ;
    }

    public void move(){
        switch (this.direction) {
            case 'N':
                setY(this.y + 1);
                break;

            case 'W':
                setX(this.x - 1);
                break;

            case 'S':
                setY(this.y - 1);
                break;

            case 'E':
                setX(this.x + 1);
                break;
        }
    }

 

    public void turnRight(){
        char d = this.direction;
        switch (d) {
            case 'N':
                setDirection('E');
                break;

            case 'E':
                setDirection('S');
                break;

            case 'S':
                setDirection('W');
                break;

            case 'W':
                setDirection('N');
                break;
        }
    }
    public void turnLeft(){
        switch (this.direction) {
            case 'N':
                setDirection('W');
                break;

            case 'W':
                setDirection('S');
                break;

            case 'S':
                setDirection('E');
                break;

            case 'E':
                setDirection('N');
                break;
        }
    }

    public boolean validate(String comand) {
        boolean available = false;
        String aux = comand.toLowerCase();
        char[] commands = aux.toCharArray();
        for(int i = 0; i< commands.length; i++) {
            if(Character.compare(commands[i], 'r') == 0 || Character.compare(commands[i], 'l') == 0 || Character.compare(commands[i], 'm') == 0 ) {available = true;}
        }
        return available;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }


    public void setDirection(char direction) {
        this.direction = direction;
    }
}
