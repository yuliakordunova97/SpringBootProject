package com.example.springbootproject.controller;

import com.example.springbootproject.entity.WorkerInfo;
import com.example.springbootproject.service.WorkerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerInfoController {

    @Autowired
    WorkerInfoService workerInfoService;

    @PostMapping("/workerInfo")
    public ResponseEntity<WorkerInfo> addWorkerInfo(@RequestBody WorkerInfo workerInfo){
        return ResponseEntity.ok(workerInfoService.saveAllWorkerInfo(workerInfo));
    }

}
