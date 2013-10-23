package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.data.validation.Constraints;
import play.data.format.Formats;

@Entity
public class Person extends Model {
    @Id
    public Long id;

    @Constraints.Required
    public String name;
    @Constraints.Required
    public String cpf;

    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date birthDate;
    @Constraints.Required
    @Constraints.Min(0)
    public double salary;
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date admissionDate;

    public static Finder<Long,Person> find = new Finder<Long,Person>(
        Long.class, Person.class
    ); 
}