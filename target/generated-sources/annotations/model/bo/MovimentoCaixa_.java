package model.bo;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.bo.Caixa;
import model.bo.Contas;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-23T23:04:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(MovimentoCaixa.class)
public class MovimentoCaixa_ { 

    public static volatile SingularAttribute<MovimentoCaixa, Character> flagTipoMovimento;
    public static volatile SingularAttribute<MovimentoCaixa, LocalDateTime> dataHorarioMovimento;
    public static volatile SingularAttribute<MovimentoCaixa, String> observacao;
    public static volatile SingularAttribute<MovimentoCaixa, Caixa> caixa;
    public static volatile SingularAttribute<MovimentoCaixa, Integer> id;
    public static volatile SingularAttribute<MovimentoCaixa, Float> valorMovimento;
    public static volatile SingularAttribute<MovimentoCaixa, Contas> contas;
    public static volatile SingularAttribute<MovimentoCaixa, Character> status;

}