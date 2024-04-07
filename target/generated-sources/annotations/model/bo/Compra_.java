package model.bo;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.bo.Fornecedor;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-07T00:09:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, String> observacao;
    public static volatile SingularAttribute<Compra, Float> valorDesconto;
    public static volatile SingularAttribute<Compra, Character> flagTipoDesconto;
    public static volatile SingularAttribute<Compra, LocalDateTime> dataHoraCompra;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Integer> numeroNF;
    public static volatile SingularAttribute<Compra, Fornecedor> fornecedor;
    public static volatile SingularAttribute<Compra, Character> status;

}