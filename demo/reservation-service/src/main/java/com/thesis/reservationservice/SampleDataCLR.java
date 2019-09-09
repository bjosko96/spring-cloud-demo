package com.thesis.reservationservice;

import com.thesis.reservationservice.model.Company;
import com.thesis.reservationservice.model.Place;
import com.thesis.reservationservice.model.Reservation;
import com.thesis.reservationservice.model.Space;
import com.thesis.reservationservice.repository.CompanyRepository;
import com.thesis.reservationservice.repository.PlaceRepository;
import com.thesis.reservationservice.repository.ReservationRepository;
import com.thesis.reservationservice.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@Component
class SampleDataCLR implements CommandLineRunner {

    private final ReservationRepository reservationRepository;

    private final PlaceRepository placeRepository;

    private final SpaceRepository spaceRepository;

    private final CompanyRepository companyRepository;

    @Autowired
    public SampleDataCLR(
            ReservationRepository reservationRepository, PlaceRepository placeRepository,
            SpaceRepository spaceRepository, CompanyRepository companyRepository) {
        this.reservationRepository = reservationRepository;
        this.placeRepository = placeRepository;
        this.spaceRepository = spaceRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public void run(String... args) {
        Stream.of("Smart Office", "Space 4U", "Sofa Office", "Focus With Us").forEach(name -> companyRepository.save(new Company(name)));
        companyRepository.findAll().forEach(System.out::println);

        Space space11 = new Space("Smart Office Sobieskiego", "Przytulne wnętrze i wygodne stanowiska pracy",
                                  "ul. Piłsudskiego 106a", "Łódź", companyRepository.findAll().get(0).getId());
        Space space12 = new Space("Smart Office Różana", "Przytulne wnętrze i wygodne stanowiska pracy",
                                  "ul. Łąkowa 56", "Warszawa", companyRepository.findAll().get(0).getId());
        Space space21 = new Space("Space 4U Niebieska", "Dostęp do internetu LTE",
                                  "ul. Wysoka 10", "Łódź", companyRepository.findAll().get(1).getId());
        Space space22 = new Space("Space 4U Kolorowa", "Wysoki standard stanowisk, kawa i herbata bez limitu",
                                  "ul. Kątna 14", "Białystok", companyRepository.findAll().get(1).getId());
        Space space31 = new Space("Sofa Office Migdałowa", "Ergonomiczne stanowiska pracy i długie godziny otwarcia",
                                  "ul. Rokicińska 440", "Warszawa", companyRepository.findAll().get(2).getId());
        Space space32 = new Space("Sofa Office Klasyczna", "Odwiedź naszą przestrzeń",
                                  "ul. Mazowiecka 1", "Warszawa", companyRepository.findAll().get(2).getId());
        Space space41 = new Space("Focus With Us Wiosna", "Przytulne wnętrze i wygodne stanowiska pracy",
                                  "ul. Długa 90", "Białystok", companyRepository.findAll().get(3).getId());
        Space space42 = new Space("Focus With Us Zima", "Otwarte 365 dni w roku!",
                                  "ul. Fantazjowa 8", "Kraków", companyRepository.findAll().get(3).getId());
        List<Space> spaces = new ArrayList<>();
        spaces.add(space11); spaces.add(space12); spaces.add(space21); spaces.add(space22); spaces.add(space31); spaces.add(space32); spaces.add(space41); spaces.add(space42);
        spaceRepository.saveAll(spaces);

        Place place111 = new Place("A1", space11.getId());
        Place place112 = new Place("B1", space11.getId());
        Place place113 = new Place("C1", space11.getId());
        Place place121 = new Place("A1", space12.getId());
        Place place122 = new Place("B1", space12.getId());
        Place place123 = new Place("C1", space12.getId());
        Place place211 = new Place("A1", space21.getId());
        Place place212 = new Place("B1", space21.getId());
        Place place213 = new Place("C1", space21.getId());
        Place place221 = new Place("A1", space22.getId());
        Place place222 = new Place("B1", space22.getId());
        Place place223 = new Place("C1", space22.getId());
        Place place311 = new Place("A1", space31.getId());
        Place place312 = new Place("B1", space31.getId());
        Place place313 = new Place("C1", space31.getId());
        Place place321 = new Place("A1", space32.getId());
        Place place322 = new Place("B1", space32.getId());
        Place place333 = new Place("C1", space32.getId());
        Place place411 = new Place("A1", space41.getId());
        Place place412 = new Place("B1", space41.getId());
        Place place413 = new Place("C1", space41.getId());
        Place place421 = new Place("A1", space42.getId());
        Place place422 = new Place("B1", space42.getId());
        Place place423 = new Place("C1", space42.getId());
        List<Place> places = new ArrayList<>();
        places.add(place111); places.add(place112); places.add(place113); places.add(place121); places.add(place122); places.add(place123); places.add(place211); places.add(place212);
        places.add(place213); places.add(place221); places.add(place222); places.add(place223); places.add(place311); places.add(place312); places.add(place313); places.add(place321);
        places.add(place322); places.add(place333); places.add(place411); places.add(place412); places.add(place413); places.add(place421); places.add(place422); places.add(place423);
        placeRepository.saveAll(places);

        Reservation reservation1 = new Reservation(place111.getId(),2L, LocalDate.of(2019, 3, 12));
        Reservation reservation2 = new Reservation(place212.getId(),3L, LocalDate.of(2019, 3, 7));
        Reservation reservation3 = new Reservation(place333.getId(),4L, LocalDate.of(2019, 3, 15));
        Reservation reservation4 = new Reservation(place412.getId(),1L, LocalDate.of(2019, 3, 10));
        reservationRepository.saveAll(Arrays.asList(reservation1, reservation2, reservation3, reservation4));
    }
}