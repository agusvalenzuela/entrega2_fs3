package com.example.service;

import java.util.List;
import java.util.Optional;
import com.example.model.cliente;

public interface clienteService {
    //Mostrar todos los elementos
    List<cliente> getAllClientes();
    //Mostrar clientes por rut
    Optional<cliente> getClienteById(Long rut);
    //Crear cliente
    cliente createCliente(cliente cliente);
    //Actualizar cliente
    cliente updateCliente(Long rut, cliente cliente);
    //Eliminación cliente
    void deleteCliente(Long rut);
}
