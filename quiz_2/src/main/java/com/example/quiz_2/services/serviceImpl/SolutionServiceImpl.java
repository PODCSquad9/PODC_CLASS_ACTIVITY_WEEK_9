package com.example.quiz_2.services.serviceImpl;

import com.example.quiz_2.model.Solution;
import com.example.quiz_2.repository.ServiceRepository;
import com.example.quiz_2.services.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Prosper
@Service
public class SolutionServiceImpl implements SolutionService {
    ServiceRepository serviceRepository;

    @Autowired
    public SolutionServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    @Override
    public Solution saveSolution(Solution solution) {
        serviceRepository.saveSolution(solution);
        return solution;
    }

}
