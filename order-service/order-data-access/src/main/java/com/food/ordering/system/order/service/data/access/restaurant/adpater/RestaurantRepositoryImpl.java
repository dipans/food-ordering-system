package com.food.ordering.system.order.service.data.access.restaurant.adpater;

import com.food.ordering.system.order.service.data.access.restaurant.mapper.RestaurantDataAccessMapper;
import com.food.ordering.system.order.service.data.access.restaurant.repository.RestaurantJpaRepository;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.ports.output.repository.RestaurantRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private final RestaurantJpaRepository restaurantJpaRepository;
    private final RestaurantDataAccessMapper restaurantDataAccessMapper;

    public RestaurantRepositoryImpl(RestaurantJpaRepository restaurantJpaRepository,
                                    RestaurantDataAccessMapper restaurantDataAccessMapper) {
        this.restaurantJpaRepository = restaurantJpaRepository;
        this.restaurantDataAccessMapper = restaurantDataAccessMapper;
    }

    @Override
    public Optional<Restaurant> findRestaurantInformation(Restaurant restaurant) {
        return restaurantJpaRepository.findByRestaurantIdAndProductIdIn(restaurant.getId().getValue(),
                restaurantDataAccessMapper.restaurantToRestaurantProducts(restaurant))
                .map(restaurantDataAccessMapper::restaurantEntityToRestaurant);
    }
}
