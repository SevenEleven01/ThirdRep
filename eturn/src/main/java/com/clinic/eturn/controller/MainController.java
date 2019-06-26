package com.clinic.eturn.controller;

import com.clinic.eturn.domain.Busy;
import com.clinic.eturn.domain.Doctor;
import com.clinic.eturn.repos.BusyRepo;
import com.clinic.eturn.repos.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private BusyRepo busyRepo;

    @GetMapping("/")
    public String home() {    //@RequestParam(name="name", required=false, defaultValue="гость") String name, Model model
        return "home";
    }



    @GetMapping("/main") //Фильтр
    public String main(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();

        if (filter !=null && !filter.isEmpty()) {
            doctors = doctorRepo.findBySpeciality(filter);
        } else {
            doctors = doctorRepo.findAll();
        }

        model.addAttribute("doctors", doctors);
        model.addAttribute("filter", filter);
        return "main";
    }

//    @PostMapping("/main")
//    public String addDoctor(@RequestParam String speciality, @RequestParam String name, Model model) {
//        Doctor doctor = new Doctor(speciality, name);
//
//        doctorRepo.save(doctor);
//
//        Iterable<Doctor> doctors = doctorRepo.findAll();
//
//        model.addAttribute("doctors", doctors);
//        return "main";
//    }

    @GetMapping("/turn")
    public String turn(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        model.addAttribute("doctors", doctors);
        return "appointment";
    }

//    @PostMapping("/turn")
//    public String addBusy(@RequestParam String time, Model model) {
//        Busy busy = new Busy(time);
//        busyRepo.save(busy);
//
//        Iterable<Doctor> doctors = doctorRepo.findAll();
//        model.addAttribute("doctors", doctors);
//        return "appointment";
//    }

    @GetMapping("/traumatologist") //Джон Сина
    public String traumatologist(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        Iterable<Busy> busies = busyRepo.findByTraumatologist(false);

        model.addAttribute("doctors", doctors);
        model.addAttribute("speciality", "Травматолог");
        model.addAttribute("name", "Джон Сина");
        model.addAttribute("busies",busies);

        return "appointment";
    }



    @GetMapping("/therapist") //Быков
    public String therapist(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        Iterable<Busy> busies = busyRepo.findByTherapist(false);

        model.addAttribute("doctors", doctors);
        model.addAttribute("speciality", "Терапевт");
        model.addAttribute("name", "Быков А. Е.");
        model.addAttribute("busies",busies);

        return "appointment";
    }

    @GetMapping("/vet") //Айболит
    public String vet(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        Iterable<Busy> busies = busyRepo.findByVet(false);

        model.addAttribute("doctors", doctors);
        model.addAttribute("speciality", "Ветеринар");
        model.addAttribute("name", "Айболит");
        model.addAttribute("busies",busies);

        return "appointment";
    }

    @GetMapping("/dentist") //Майк Тайсон
    public String dentist(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        Iterable<Busy> busies = busyRepo.findByDentist(false);

        model.addAttribute("doctors", doctors);
        model.addAttribute("speciality", "Стоматолог");
        model.addAttribute("name", "Майк Тайсон");
        model.addAttribute("busies",busies);

        return "appointment";
    }

    @GetMapping("/surgeon") //Авиценна
    public String surgeon(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        Iterable<Busy> busies = busyRepo.findBySurgeon(false);

        model.addAttribute("doctors", doctors);
        model.addAttribute("speciality", "Хирург");
        model.addAttribute("name", "Авиценна");
        model.addAttribute("busies",busies);

        return "appointment";
    }

    @GetMapping("/healer") //Гиппократ
    public String healer(Model model) {
        Iterable<Doctor> doctors = doctorRepo.findAll();
        Iterable<Busy> busies = busyRepo.findByHealer(false);

        model.addAttribute("doctors", doctors);
        model.addAttribute("speciality", "Целитель");
        model.addAttribute("name", "Гиппократ");
        model.addAttribute("busies",busies);

        return "appointment";
    }
}