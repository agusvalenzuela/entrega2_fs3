package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.cliente;
import com.example.repository.clienteRepository;

import  java.util.List;
import java.util.Optional;

@Service
public class clienteServiceImpl implements clienteService {
    @Autowired
    private clienteRepository clienteRepository;

    @Override
    public List<cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    @Override
    public Optional<cliente> getClienteById(Long rut){
        return clienteRepository.findById(rut);
    }

    @Override
    public cliente createCliente(cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public cliente updateCliente(Long rut, cliente cliente){
        if (clienteRepository.existsById(rut)) {
            cliente.setRut(rut);
            return clienteRepository.save(cliente);

        }
        else{
            return null;
        }
    }
    @Override
    public void deleteCliente(Long rut){
        clienteRepository.deleteById(rut);
    }
    
}