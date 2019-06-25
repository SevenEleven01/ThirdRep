package com.clinic.eturn.repos;

import com.clinic.eturn.domain.Doctor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorRepo extends CrudRepository<Doctor, Integer> {
    List<Doctor> findBySpeciality(String speciality);
}