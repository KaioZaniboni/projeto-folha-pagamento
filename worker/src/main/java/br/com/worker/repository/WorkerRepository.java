package br.com.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
