package nl.rvkit.hourregistration.hourentry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHourEntryRepository extends JpaRepository<HourEntry, Long> {
}
