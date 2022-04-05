package com.example.springbootproject.service;

import com.example.springbootproject.entity.WorkerInfo;
import com.example.springbootproject.repository.WorkerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class WorkerInfoService {

    @Autowired
    WorkerInfoRepository workerInfoRepository;

    public WorkerInfo saveAllWorkerInfo(WorkerInfo workerInfo){
        return workerInfoRepository.save(workerInfo);
    }
}
