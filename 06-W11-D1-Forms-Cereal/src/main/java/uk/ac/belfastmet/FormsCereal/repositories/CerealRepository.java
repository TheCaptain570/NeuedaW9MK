package uk.ac.belfastmet.FormsCereal.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.FormsCereal.domain.Cereals;

public interface CerealRepository extends CrudRepository<Cereals, Integer> {
}