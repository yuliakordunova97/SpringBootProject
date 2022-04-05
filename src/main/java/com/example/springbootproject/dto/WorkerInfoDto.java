package com.example.springbootproject.dto;

import com.example.springbootproject.entity.Worker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class WorkerInfoDto {
    private int id;
    private String homeAddress;
    private int age;


}
