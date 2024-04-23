
package controllerMovimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bo.Compra;
import view.TelaComproFiscal;


 
public class ComprovanteFiscalController implements ActionListener {

    TelaComproFiscal tlComproFiscal;
    
        //private String valorTotalCompra;
    //private DefaultTableModel modeloTabelaCompra;

    public ComprovanteFiscalController(TelaComproFiscal tlComproFiscal) {
        this.tlComproFiscal = tlComproFiscal;
        
        this.tlComproFiscal.getjBtnCANCELAR().addActionListener(this);
        this.tlComproFiscal.getjBtnRECEBER().addActionListener(this);
        
        /* desativando os campos que não podem ser editados*/
        this.tlComproFiscal.getjTValorDesconto().setEditable(false);
        this.tlComproFiscal.getjTableDadosProduto().setEnabled(false);
        this.tlComproFiscal.getjTcodCarteirinha().setEditable(false);
        this.tlComproFiscal.getjTdataHora().setEditable(false);
        this.tlComproFiscal.getjTextField1().setEnabled(false);
        this.tlComproFiscal.getjTnomeCarteirinha().setEditable(false);
        this.tlComproFiscal.getjTobservacao().setEditable(false);
        this.tlComproFiscal.getjTvalorTotalProduto().setEditable(false);
        
        //Compra compra = new Compra();
        
        //compra.setObservacao(this.tlComproFiscal.getjTobservacao().getText());
        List<Compra> listaCompra = new ArrayList<Compra>();
        listaCompra = service.CompraService.carregar();
        
        for (Compra compraAtual: listaCompra) {
            //this.telaCompra.getjTnomeFuncionario().setText(caixaAtual.getFuncionario().getNome());
            this.tlComproFiscal.getjTvalorTotalProduto().setText(Float.toString(compraAtual.getValorDesconto()));
            //this.tlComproFiscal.getjTdataHora().setText(compraAtual.getDataHoraCompra());
            this.tlComproFiscal.getjTobservacao().setText(compraAtual.getObservacao());
            this.tlComproFiscal.getjComboBoxTipoDesconto().setSelectedItem(compraAtual.getFlagTipoDesconto());
            this.tlComproFiscal.getjTextField1().setText(Integer.toString(compraAtual.getNumerofi()));
        }
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.tlComproFiscal.getjBtnRECEBER()){
            
            
        } else if (e.getSource() == this.tlComproFiscal.getjBtnCANCELAR()) {
            
            
        }
        
    }
    
}
