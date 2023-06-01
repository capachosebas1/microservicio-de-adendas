package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Adenda")
@Data
public class adenda {
    @Id
    private String id;
    private String fecha;
    private String autor;
    private String tipo;
    private String contenido;
    private String historiaclinica;
    
}
