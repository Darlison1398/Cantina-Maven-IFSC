package model.bo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.bo.Endereco;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-27T22:30:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> fone1;
    public static volatile SingularAttribute<Pessoa, String> fone2;
    public static volatile SingularAttribute<Pessoa, Endereco> endereco;
    public static volatile SingularAttribute<Pessoa, String> complementoEndereco;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Integer> id;
    public static volatile SingularAttribute<Pessoa, String> email;
    public static volatile SingularAttribute<Pessoa, Boolean> status;

}