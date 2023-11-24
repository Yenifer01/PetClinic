package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import com.tecsup.petclinic.exception.PetNotFoundException;

import java.util.List;

public interface OwnerService {

    /**
     *
     * @param  owner
     * @return
     */
    Owner create(Owner owner);

    /**
     *
     * @param owner
     * @return
     */
    Owner update(Owner owner);


    /**
     *
     * @param id
     * @throws OwnerNotFoundException
     */
    void delete(Long id) throws OwnerNotFoundException;

    /**
     *
     * @param id
     * @return
     */
    Owner findById(long id) throws OwnerNotFoundException;

    /**
     *
     * @param firstName
     * @return
     */
    List<Owner> findByFirstName(String firstName);

    /**
     *
     * @param lastName
     * @return
     */
    List<Owner> findByLastName(String lastName);

    /**
     *
     * @param address
     * @return
     */
    List<Owner> findByAddress(String address);

    /**
     *
     * @param city
     * @return
     */
    List<Owner> findByCity(String city);

    /**
     *
     * @param telephone
     * @return
     */
    List<Owner> findByTelephone(String telephone);

    /**
     *
     * @return
     */
    Iterable<Owner> findAll();
}
