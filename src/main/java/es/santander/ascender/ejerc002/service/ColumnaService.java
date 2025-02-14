package es.santander.ascender.ejerc002.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc002.model.Columna;
import es.santander.ascender.ejerc002.repository.ColumnaRepository;

@Service
public class ColumnaService {

    private ColumnaRepository repository;

    public Columna create(Columna columna) {
        if (columna.getId() != null) {
            throw new CrudSecurityException("Han tratado de modificar un registro de columna usando el metodo crear",
                    CRUDOperation.CREATE, columna.getId());
        }
        return repository.save(columna);
    }

    public Columna read(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Columna> read() {
        return repository.findAll();
    }

    public Columna update(Columna columna) {
        if (columna.getId() == null) {
            throw new CrudSecurityException("Has tratado de modificar un registro con el metodo crear",
                    CRUDOperation.UPDATE, null);
        }
        return repository.save(columna);
    }

    public void delete(Long id) {
         repository.deleteById(id);
    }

}
