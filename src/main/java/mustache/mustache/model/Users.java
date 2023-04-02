package mustache.mustache.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    //    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    public Users() {
    }


    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "USERS [id=" + id + ", name=" + name + ", email=" + email + "]";

    }

//  – @Entity indica que essa é uma classe com persistência.
//  – @Table nos da a tabela que mapeia essa entidade.
//  – @Id é onde indicamos a nossa chave primária.
//  – @GeneratedValue é usado para definir a estratégia de geração para a chave primária, onde GenerationType.AUTO significa que é um campo automaticamente incrementado.
//  – @Column define a coluna da tabela referente ao campo.

}
