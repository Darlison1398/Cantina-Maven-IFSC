package model.bo;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-27T22:30:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(MovimentacaoEstoque.class)
public class MovimentacaoEstoque_ { 

    public static volatile SingularAttribute<MovimentacaoEstoque, String> observacaoMovimentada;
    public static volatile SingularAttribute<MovimentacaoEstoque, Integer> id;
    public static volatile SingularAttribute<MovimentacaoEstoque, LocalDateTime> dataHoraMovimentacao;
    public static volatile SingularAttribute<MovimentacaoEstoque, String> qtdMovimentada;
    public static volatile SingularAttribute<MovimentacaoEstoque, String> flagTipoMovimentacao;
    public static volatile SingularAttribute<MovimentacaoEstoque, Character> status;

}