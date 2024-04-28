
package controllerMovimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bo.Caixa;
import model.bo.Compra;
import model.bo.MovimentacaoEstoque;
import view.TelaComproFiscal;


 
public class ComprovanteFiscalController implements ActionListener {

    TelaComproFiscal tlComproFiscal;
    public static int codigoCompra;
    
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
            this.tlComproFiscal.getjTvalorTotalProduto().setText(Float.toString(compraAtual.getValorDesconto()));
            
            //this.tlComproFiscal.getjTdataHora().setText(compraAtual.getDataHoraCompra().format(DateTimeFormatter.ISO_DATE_TIME));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            this.tlComproFiscal.getjTdataHora().setText(compraAtual.getDataHoraCompra().format(formatter));

            this.tlComproFiscal.getjTobservacao().setText(compraAtual.getObservacao());
            this.tlComproFiscal.getjTValorDesconto().setText(compraAtual.getFlagTipoDesconto());
            this.tlComproFiscal.getjTextField1().setText(Integer.toString(compraAtual.getNumerofi()));
            //this.tlComproFiscal.getjTcodCarteirinha().setText(compraAtual.getCarteirinha().getCodigocarteirinha());
            if (compraAtual.getCarteirinha() != null) {
                this.tlComproFiscal.getjTcodCarteirinha().setText(compraAtual.getCarteirinha().getCodigocarteirinha());
                this.tlComproFiscal.getjTnomeCarteirinha().setText(compraAtual.getCarteirinha().getCliente().getNome());

            }

        }
        
        
        // caixa e funcionario
        List<Caixa> listaCaixa = new ArrayList<Caixa>();
        listaCaixa = service.CaixaService.carregar();
        
        for (Caixa caixaAtual: listaCaixa) {
            this.tlComproFiscal.getjTFuncionario().setText(caixaAtual.getFuncionario().getNome());
        }
        
        
        Compra compra = new Compra();
        compra = service.CompraService.carregar(codigoCompra);
        System.out.println("Compra carregada: " + compra);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.tlComproFiscal.getjBtnRECEBER()){
            
            /*codigoCompra = 0;
            
            if (codigoCompra != 0 ) {
                Compra compra = new Compra();
                compra = service.CompraService.carregar(codigoCompra);
                System.out.println("Compra carregada: " + compra);
                
            }
            System.out.println("Valor de codigoCompra antes de carregar a compra: " + codigoCompra);*/
          
           
            
            MovimentacaoEstoque mvEstoque = new MovimentacaoEstoque();
            
            String qtd = "1";
            String tipoMov = "Saída";
            char status ='A';
            
            //mvEstoque.setCompra(service.CompraService.carregar(codigoCompra));
            mvEstoque.setDataHoraMovimentacao(LocalDateTime.now());
            mvEstoque.setFlagTipoMovimentacao(tipoMov);
            mvEstoque.setQtdMovimentada(qtd);
            mvEstoque.setStatus(status);
            
            service.MovimentacaoEstoqueService.adicionar(mvEstoque);
            
            
             this.tlComproFiscal.dispose();
            
        } else if (e.getSource() == this.tlComproFiscal.getjBtnCANCELAR()) {
            
            utilities.Utilities.limpaComponentes(true, this.tlComproFiscal.getjPanDadosGerais());
            utilities.Utilities.limpaComponentes(true, this.tlComproFiscal.getjPanDadosItens());
            //utilities.Utilities.limpaComponentes(true, this.tlComproFiscal.getj);
            
            this.tlComproFiscal.dispose();
            
        }
        
    }
    
}
