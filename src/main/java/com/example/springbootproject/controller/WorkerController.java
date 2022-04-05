package com.example.springbootproject.controller;

import com.example.springbootproject.entity.Departure;
import com.example.springbootproject.entity.Worker;
import com.example.springbootproject.repository.WorkerRepository;
import com.example.springbootproject.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class WorkerController {

    @Autowired
    WorkerRepository workerRepository;

    @Autowired
    WorkerService workerService;

    @PostMapping("/workers")
    public ResponseEntity<Worker> addWorker(@RequestBody Worker worker) {
        return ResponseEntity.ok(workerRepository.save(worker));
    }

    @GetMapping("/workers")
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @GetMapping("/workers/{id}")
    public ResponseEntity<Worker> getOneWorker(@PathVariable int id) {
        return ResponseEntity.ok(workerService.getOneWorker(id));
    }

    @GetMapping("/workers//{name}")
    public ResponseEntity<Worker> getWorkerByHisName(@PathVariable String name) {
        return ResponseEntity.ok(workerService.getWorkerByName(name));
    }


}
