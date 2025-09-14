package store.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order", url = "http://order:8080")
public interface OrderController {

    @PostMapping("/order")
    public ResponseEntity<OrderOut> create(
        @RequestBody OrderIn in
    );

    @GetMapping("/order/{id}")
    public ResponseEntity<OrderOut> findById(
        @PathVariable("id") String id
    );

    @GetMapping("/order")
    public ResponseEntity<List<OrderSummaryOut>> findAll();

}
