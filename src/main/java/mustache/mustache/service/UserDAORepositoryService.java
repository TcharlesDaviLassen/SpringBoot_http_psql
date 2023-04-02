package mustache.mustache.service;

import mustache.mustache.model.Users;
import org.hibernate.mapping.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserDAORepositoryService extends JpaRepository<Users, Long> {

//    List<Users> findAllUsers(Long id, String name, String email);

    List<Users> findByName(String name);


    // nome do método deve conter o atributo da classe
    // public User findById(String id);

    // public List<User> findAll(String name, String email);

    // consulta por named parameters
    // @Query("from user where login = :login and senha = :senha")
    // @Query("from users where name = :name and email = :email")
//    public Users findByNomeAndEmail(@Param("login") String login, @Param("senha") String senha);

    // consulta com ordinal parameters
    // @Query("from user where login = ?3 and senha = ?2 and idade = ?1") // findByLoginAndSenhaAndIdade
    // @Query("from users")
    // public Users findByAllUsers (int id, String name, String email);

}
