/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

/**
 *
 * @author kfoster
 */
 @Controller("/")
public class RequestController {

    @Get(uri="/ping", produces=MediaType.TEXT_PLAIN)
    public String ping() {
        return "pong";
    }
}
