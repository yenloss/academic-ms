package mx.edu.uteq.idgs12.academic_ms.service;

import mx.edu.uteq.idgs12.academic_ms.dto.ConfigurationDTO;
import mx.edu.uteq.idgs12.academic_ms.entity.Configuration;
import mx.edu.uteq.idgs12.academic_ms.entity.University;
import mx.edu.uteq.idgs12.academic_ms.repository.ConfigurationRepository;
import mx.edu.uteq.idgs12.academic_ms.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationService {

    private final ConfigurationRepository configurationRepository;
    private final UniversityRepository universityRepository;

    public ConfigurationService(ConfigurationRepository configurationRepository, UniversityRepository universityRepository) {
        this.configurationRepository = configurationRepository;
        this.universityRepository = universityRepository;
    }

    public List<Configuration> getAll() {
        return configurationRepository.findAll();
    }

    public Optional<Configuration> getById(Integer id) {
        return configurationRepository.findById(id);
    }
}
