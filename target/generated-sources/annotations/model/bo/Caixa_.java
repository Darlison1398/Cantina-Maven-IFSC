package model.bo;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.bo.Funcionario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-26T00:31:51", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Caixa.class)
public class Caixa_ { 

    public static volatile SingularAttribute<Caixa, Float> valorFechamento;
    public static volatile SingularAttribute<Caixa, String> observacao;
    public static volatile SingularAttribute<Caixa, LocalDateTime> dataHoraAbertura;
    public static volatile SingularAttribute<Caixa, Float> valorAbertura;
    public static volatile SingularAttribute<Caixa, Integer> id;
    public static volatile SingularAttribute<Caixa, LocalDateTime> dataHoraFechamento;
    public static volatile SingularAttribute<Caixa, Funcionario> funcionario;
    public static volatile SingularAttribute<Caixa, Character> status;

}