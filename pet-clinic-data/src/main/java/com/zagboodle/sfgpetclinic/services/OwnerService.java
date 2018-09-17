package com.zagboodle.sfgpetclinic.services;

import com.zagboodle.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
