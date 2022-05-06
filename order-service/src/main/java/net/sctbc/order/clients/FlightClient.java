package net.sctbc.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yinzsWang
 * @time 2022/5/4 9:37
 **/
@FeignClient("flight-service")
public interface FlightClient {
    @GetMapping("/flight/1")
    String t();
}
