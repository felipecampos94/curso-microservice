package com.microservice.mscartoes.service;

import com.microservice.mscartoes.model.ClienteCartao;
import com.microservice.mscartoes.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository cartaoRepository;

    public List<ClienteCartao> listCartoesByCpf(String cpf) {
        return cartaoRepository.findByCpf(cpf);
    }
}
