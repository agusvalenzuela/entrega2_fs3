package com.example.service;

import java.util.List;
import java.util.Optional;
import com.example.model.producto;

public interface productoService {
    //Mostrar todos los elementos
    List<producto> getAllProductos();
    //Mostrar produuctos por id
    Optional<producto> getProductoById(Long id);
    //Crear producto
    producto createProducto(producto producto);
    //Actualizar producto
    producto updateProducto(Long id, producto producto);
    //Eliminación producto
    void deleteProducto(Long id);
}
