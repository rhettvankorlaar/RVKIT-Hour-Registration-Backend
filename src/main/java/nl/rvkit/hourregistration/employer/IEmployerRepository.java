package nl.rvkit.hourregistration.employer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployerRepository extends JpaRepository<Employer, Long> {
}
