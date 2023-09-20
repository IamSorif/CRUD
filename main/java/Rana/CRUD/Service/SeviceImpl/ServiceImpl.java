package Rana.CRUD.Service.SeviceImpl;

import Rana.CRUD.Entity.Registration;
import Rana.CRUD.PayLoad.RegistrationDTO;
import Rana.CRUD.Repository.RanaRepository;
import Rana.CRUD.Service.Service;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private final RanaRepository ranaRepository;

    public ServiceImpl(RanaRepository ranaRepository) {
        this.ranaRepository = ranaRepository;
    }

    @Override
    public RegistrationDTO createRana(RegistrationDTO registrationDTO) {

        Registration covertedRana = maptoEntity(registrationDTO);
        Registration savedRana = ranaRepository.save(covertedRana);
        RegistrationDTO convertedBackRana = maptoDTO(savedRana);
        return convertedBackRana;
    }

    @Override
    public List<RegistrationDTO> getAlStudent() {

        List<Registration> foundedRana = ranaRepository.findAll();
        List<RegistrationDTO> collectRana = foundedRana.stream().map(pst -> maptoDTO(pst)).collect(Collectors.toList());
        return collectRana;
    }

    public Registration maptoEntity(RegistrationDTO registrationDTO){

        Registration entity = new Registration();

        entity.setId(registrationDTO.getId());
        entity.setName(registrationDTO.getName());
        entity.setEmail(registrationDTO.getEmail());
        entity.setMobile(registrationDTO.getMobile());

        return entity;
    }

    public RegistrationDTO maptoDTO(Registration registration){

        RegistrationDTO dto = new RegistrationDTO();

        dto.setId(registration.getId());
        dto.setName(registration.getName());
        dto.setEmail(registration.getEmail());
        dto.setMobile(registration.getMobile());

        return dto;
    }
}
