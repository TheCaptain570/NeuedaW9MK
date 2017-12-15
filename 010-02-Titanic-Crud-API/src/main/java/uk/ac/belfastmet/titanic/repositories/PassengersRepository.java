package uk.ac.belfastmet.titanic.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengersRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findByPclass(Integer pclass);

	Iterable<Passenger> findByEmbarked(String searchField);

	Iterable<Passenger> findByName(String searchField);
	

}
