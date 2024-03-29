package com.codeclan.example.phileas_blogg_back_end.repositories.CountryRepository;


import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByNameIgnoreCase(String name);

//    List<Review> findByNameAndReviews_DateIgnoreCase(String name, String date);

    List<Country> findByNameContainingIgnoreCase(String partial_name);
}
