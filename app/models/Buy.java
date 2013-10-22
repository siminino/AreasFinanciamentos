package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;
import play.data.validation.Constraints;


@Entity
public class Buy extends Model {
    @Id
    public Long id;
    @Constraints.Required
    public String name;

    @Constraints.Required
    @Constraints.Min(0)
    public double valueOfBuy; 
    @Constraints.Required
    @Constraints.Max(70)
    @Constraints.Min(0)
    public int percentageLoan;
    @Constraints.Required
    @Constraints.Min(0)
    public int plots;

    @ManyToOne
    public Person person;

    public static Finder<Long,Buy> find = new Finder<Long,Buy>(
        Long.class, Buy.class
    ); 
}