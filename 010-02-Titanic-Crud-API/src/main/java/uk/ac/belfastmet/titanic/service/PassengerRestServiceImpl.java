package uk.ac.belfastmet.titanic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repositories.PassengersRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService {

	@Autowired
	private PassengersRepository passengersRepository;

	public PassengerRestServiceImpl(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}

	@Override
	public Iterable<Passenger> list() {
		return this.passengersRepository.findAll();
	}

	@Override
	public Passenger create(Passenger passenger) {
		return this.passengersRepository.save(passenger);
	}

	@Override
	public Passenger read(Integer passengerId) {
		return this.passengersRepository.findOne(passengerId);
	}

	@Override
	public Passenger update(Integer passengerId, Passenger passenger) {
		
		Passenger passengerToUpdate = this.passengersRepository.findOne(passengerId);
		
		return passengersRepository.save(passengerToUpdate);
	}

	@Override
	public void delete(Integer passengerId) {
		this.passengersRepository.delete(passengerId);
	}

}
