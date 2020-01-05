package com.example.inheritencesingletable.service;

import com.example.inheritencesingletable.domain.ExternalVet;
import com.example.inheritencesingletable.domain.InternalVet;
import com.example.inheritencesingletable.domain.Vet;
import com.example.inheritencesingletable.repository.ExternalVetRepository;
import com.example.inheritencesingletable.repository.InternalVetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseImpl implements   IDatabase {
    private final InternalVetRepository internalVetRepository;
    private final ExternalVetRepository externalVetRepository;

    public DatabaseImpl(InternalVetRepository internalVetRepository,ExternalVetRepository externalVetRepository) {
        this.internalVetRepository = internalVetRepository;
        this.externalVetRepository = externalVetRepository;
    }

    @Override
    @Transactional
    public void createTable() {
        InternalVet invet1 = new InternalVet("Thaw Thaw","MSc",500000);
        InternalVet invet2 = new InternalVet("Zaw Zaw","BSc",400000);
        ExternalVet exvet1 = new ExternalVet("Prathi","India",400000);
        ExternalVet exvet2 = new ExternalVet("Kakawhar","Japan",400000);

        internalVetRepository.save(invet1);
        internalVetRepository.save(invet2);

        externalVetRepository.save(exvet1);
        externalVetRepository.save(exvet2);

    }
}
