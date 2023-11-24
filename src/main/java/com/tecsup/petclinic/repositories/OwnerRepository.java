package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    List<Owner> findByFirstName(String firstName);
    List<Owner> findByLastName(String lastName);
    List<Owner> findByAddress(String address);
    List<Owner> findByCity(String city);
    List<Owner> findByTelephone(String telephone);
    List<Owner> findById(int id);


}
