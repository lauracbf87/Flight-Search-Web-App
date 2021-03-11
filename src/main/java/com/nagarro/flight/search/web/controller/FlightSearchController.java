/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.controller;

import com.nagarro.flight.search.web.entity.FlightInfo;
import com.nagarro.flight.search.web.entity.FlightSearchQuery;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Laura.Barragan
 */
@Controller
public class FlightSearchController {

    //@Autowired
   // private FlightSearchService service;


    @RequestMapping(path = "/searchFlight")
    public ResponseEntity<List<FlightInfo>> searchFlight(@RequestBody FlightSearchQuery query) {
        
        List<FlightInfo> results = new ArrayList();

        return ResponseEntity.ok(results);
    }

}
