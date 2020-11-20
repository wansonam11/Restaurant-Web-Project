package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<kr.co.fastcampus.eatgo.domain.Restaurant, Long> {
    List<kr.co.fastcampus.eatgo.domain.Restaurant> findAll();

    Optional<kr.co.fastcampus.eatgo.domain.Restaurant> findById(Long id);

    kr.co.fastcampus.eatgo.domain.Restaurant save(Restaurant restaurant);
}
