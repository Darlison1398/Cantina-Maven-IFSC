package model.bo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.bo.Compra;
import model.bo.Produto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-23T00:32:11", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ItemCompra.class)
public class ItemCompra_ { 

    public static volatile SingularAttribute<ItemCompra, Float> qtdProduto;
    public static volatile SingularAttribute<ItemCompra, Compra> compra;
    public static volatile SingularAttribute<ItemCompra, Produto> produto;
    public static volatile SingularAttribute<ItemCompra, Integer> id;
    public static volatile SingularAttribute<ItemCompra, Float> valorUnitario;
    public static volatile SingularAttribute<ItemCompra, Character> status;

}