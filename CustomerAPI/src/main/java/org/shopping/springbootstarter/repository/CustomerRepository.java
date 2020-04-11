package org.shopping.springbootstarter.repository;

import org.shopping.springbootstarter.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amit Saini
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
