package uk.ac.belfastmet.TitanicSavedD5.repositories;

import org.springframework.data.repository.CrudRepository;


import uk.ac.belfastmet.TitanicSavedD5.domain.Passengers;

public interface TitanicRepository extends CrudRepository<Passengers, Integer> {
	Iterable<Passengers> findByAge(double d);	
}
