package com.example.springbootproject.service;

import com.example.springbootproject.entity.Worker;
import com.example.springbootproject.logger.Logger;
import com.example.springbootproject.repository.DepartureRepository;
import com.example.springbootproject.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    Logger logger;

    @Autowired
    WorkerRepository workerRepository;


    public Worker getOneWorker(int id){
        return workerRepository.findWorkerById(id);
    }

    public Worker getWorkerByName(String name){

        return workerRepository.findWorkerByName(name);
    }


}
