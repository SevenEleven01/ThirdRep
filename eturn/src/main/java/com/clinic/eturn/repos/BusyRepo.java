package com.clinic.eturn.repos;

import com.clinic.eturn.domain.Busy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BusyRepo extends CrudRepository<Busy, Integer> {
    List<Busy> findByTraumatologist(boolean traumatologist);
    List<Busy> findByTherapist(boolean therapist);
    List<Busy> findByVet(boolean vet);
    List<Busy> findByDentist(boolean dentist);
    List<Busy> findBySurgeon(boolean surgeon);
    List<Busy> findByHealer(boolean healer);
}