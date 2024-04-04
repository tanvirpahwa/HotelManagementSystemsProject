/**
 * 
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ProvidedService;
/**
 * 
 */
@Repository
public interface ServiceRepository extends JpaRepository<ProvidedService, Long> {

}
