package br.com.payroll.config.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.payroll.config.entities.Worker;

@Component
@FeignClient(name = "worker", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}
