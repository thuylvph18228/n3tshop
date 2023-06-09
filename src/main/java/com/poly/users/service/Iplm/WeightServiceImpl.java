package com.poly.users.service.Iplm;

import com.poly.users.entity.Weight;
import com.poly.users.repository.WeightRepository;
import com.poly.users.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WeightServiceImpl implements WeightService {

    @Autowired
    private WeightRepository weightRepo;

    @Override
    @Transactional
    public List<Weight> getAll() {
        return this.weightRepo.findAll();
    }

    @Override
    @Transactional
    public Weight getById(int WeightId) {
        return null;
    }

    @Override
    @Transactional
    public Weight save(Weight weight) {
        return this.weightRepo.save(weight);
    }

    @Override
    @Transactional
    public Weight update(Weight weight) {
        return null;
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.weightRepo.deleteById(id);
    }
}
