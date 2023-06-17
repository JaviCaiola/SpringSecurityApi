package com.ar.restcaiola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.restcaiola.model.Skill;

/*La principal funcion de la Capa repository es la lectura y escritura de datos 
 *Luego tiene como utilidad implementar la misma en la capa de servicios para que pueda
 *consumir los metodos que ofrece JPA. 
 *Es IMPORTANTE tener en cuenta que el tipo de dato que recibe la extencion de JPARepo
 *en lo posible tiene que coincidir con el de la capa modelo, aunque no sea obligatorio
 *debido a que Jpa puede convertir tipos de datos, es recomendable coincidirlos.
 * */

@Repository
public interface Skillrepo extends JpaRepository<Skill, Long> {
}
