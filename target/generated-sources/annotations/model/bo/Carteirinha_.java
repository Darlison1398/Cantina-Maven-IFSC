package model.bo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.bo.Cliente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-07T00:09:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carteirinha.class)
public class Carteirinha_ { 

    public static volatile SingularAttribute<Carteirinha, Cliente> cliente;
    public static volatile SingularAttribute<Carteirinha, String> codigoBarra;
    public static volatile SingularAttribute<Carteirinha, Integer> id;
    public static volatile SingularAttribute<Carteirinha, String> dataGeracao;
    public static volatile SingularAttribute<Carteirinha, String> dataCancelamento;

}