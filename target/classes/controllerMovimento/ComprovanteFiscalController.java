
package controllerMovimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bo.Caixa;
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
        
        //Compra compra = new Compra();
        //this.tlComproFiscal.getjComboBoxTipoDesconto().setSelectedItem(compra.getFlagTipoDesconto());
        
        for (Compra compraAtual: listaCompra) {
            this.tlComproFiscal.getjTvalorTotalProduto().setText(Float.toString(compraAtual.getValorDesconto()));
            this.tlComproFiscal.getjTdataHora().setText(compraAtual.getDataHoraCompra().format(DateTimeFormatter.ISO_DATE));
            this.tlComproFiscal.getjTobservacao().setText(compraAtual.getObservacao());
            this.tlComproFiscal.getjTValorDesconto().setText(compraAtual.getFlagTipoDesconto());
            this.tlComproFiscal.getjTextField1().setText(Integer.toString(compraAtual.getNumerofi()));
            this.tlComproFiscal.getjTcodCarteirinha().setText(compraAtual.getCarteirinha().getCodigocarteirinha());
            this.tlComproFiscal.getjTnomeCarteirinha().setText(compraAtual.getCarteirinha().getCliente().getNome());
        }
        
        
        // caixa e funcionario
        List<Caixa> listaCaixa = new ArrayList<Caixa>();
        listaCaixa = service.CaixaService.carregar();
        
        for (Caixa caixaAtual: listaCaixa) {
            this.tlComproFiscal.getjTFuncionario().setText(caixaAtual.getFuncionario().getNome());
        }
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.tlComproFiscal.getjBtnRECEBER()){
            
            
        } else if (e.getSource() == this.tlComproFiscal.getjBtnCANCELAR()) {
            
            
        }
        
    }
    
}
