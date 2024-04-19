package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Livro{
    @ID
    private long id;
    private String titulo;
    private String genero;
    
    
}