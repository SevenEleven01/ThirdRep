package com.clinic.eturn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Busy {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String time;
    private  boolean traumatologist;
    private  boolean therapist;
    private  boolean vet;
    private  boolean dentist;
    private  boolean surgeon;
    private  boolean healer;

    public Busy() {}

    public Busy(String time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isTraumatologist() {
        return traumatologist;
    }

    public void setTraumatologist(boolean traumatologist) {
        this.traumatologist = traumatologist;
    }

    public boolean isTherapist() {
        return therapist;
    }

    public void setTherapist(boolean therapist) {
        this.therapist = therapist;
    }

    public boolean isVet() {
        return vet;
    }

    public void setVet(boolean vet) {
        this.vet = vet;
    }

    public boolean isDentist() {
        return dentist;
    }

    public void setDentist(boolean dentist) {
        this.dentist = dentist;
    }

    public boolean isSurgeon() {
        return surgeon;
    }

    public void setSurgeon(boolean surgeon) {
        this.surgeon = surgeon;
    }

    public boolean isHealer() {
        return healer;
    }

    public void setHealer(boolean healer) {
        this.healer = healer;
    }
}