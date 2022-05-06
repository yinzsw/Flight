package net.sctbc.order.controller;

import net.sctbc.order.clients.FlightClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinzsWang
 * @time 2022/5/4 9:33
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    private final FlightClient flightClient;

    public OrderController(FlightClient flightClient) {
        this.flightClient = flightClient;
    }

    @GetMapping("/1")
    String t() {
        return flightClient.t();
    }
}
