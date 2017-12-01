package uk.ac.belfastmet.DrawfsSaved.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.DrawfsSaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {
	Iterable<Dwarf> findByAuthor(String string);			//1 "Tolkien"
}
