package uk.ac.belfastmet.TitanicSavedD5.repositories;

import org.springframework.data.repository.CrudRepository;


import uk.ac.belfastmet.TitanicSavedD5.domain.Passenger;

public interface TitanicRepository extends CrudRepository<Passenger, Integer> {
	//Iterable<Passengers> findByAge(double d);

	//Object findByEmbarked(String string);

	//Object findByEmbarked(String string);

	Iterable<Passenger> findBySurvived(String string);

	Iterable<Passenger> findByAndCabinIsNotNull();

	Iterable<Passenger> findByNameContaining(String name);	
}
