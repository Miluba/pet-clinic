package de.miluba.petclinic.services.jpa;

import de.miluba.petclinic.model.Visit;
import de.miluba.petclinic.repositories.VisitRepository;
import de.miluba.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("jpa")
public class VisitJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitJPAService(final VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Collection<Visit> findAll() {
        Collection<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.findById(id);
    }
}
