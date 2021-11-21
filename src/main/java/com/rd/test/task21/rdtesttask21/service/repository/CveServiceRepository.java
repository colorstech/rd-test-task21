/**
 * 
 */
package com.rd.test.task21.rdtesttask21.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.rd.test.task21.rdtesttask21.domain.Severity;

/**
 * @author hemak
 *
 */
public interface CveServiceRepository extends CrudRepository<Severity, Long>{

}
