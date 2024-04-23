
package controllerMovimento;

import controller.ControllerBuscaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AbrirCaixa;
import view.BuscaFuncionario;
import static controller.ControllerCadastroFuncionario.codigoFuncionario;
import java.time.LocalDateTime;
import model.bo.Caixa;
import model.bo.Funcionario;


public class AbrirCaixaController implements ActionListener {

    AbrirCaixa abrirCaixa;
    
    public AbrirCaixaController(AbrirCaixa abrirCaixa) {
        this.abrirCaixa = abrirCaixa;
        
        this.abrirCaixa.getjBarbirCaixa().addActionListener(this);
        this.abrirCaixa.getjBativarCaixa().addActionListener(this);
        this.abrirCaixa.getjBbuscarFuncionario().addActionListener(this);
        this.abrirCaixa.getjBfecharCaixa().addActionListener(this);
        
        
        this.abrirCaixa.getjTidFuncionario().setEditable(false);
        this.abrirCaixa.getjTnomeFuncionario().setEditable(false);
        this.abrirCaixa.getjTusuarioFuncionario().setEditable(false);
        
        
        //utilities.Utilities.ativa(true, this.abrirCaixa.getjPbotoes());
        utilities.Utilities.ativa(true, this.abrirCaixa.getjPbotoes());
        utilities.Utilities.limpaComponentes(false, this.abrirCaixa.getjPdadosFuncionario());
        utilities.Utilities.limpaComponentes(false, this.abrirCaixa.getjPdadosCaixa());
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == this.abrirCaixa.getjBbuscarFuncionario()) {
             
             codigoFuncionario = 0;
             BuscaFuncionario buscaFuncionario = new BuscaFuncionario(null, true);
             ControllerBuscaFuncionario conBF = new ControllerBuscaFuncionario(buscaFuncionario);
             buscaFuncionario.setVisible(true);
             
             if (codigoFuncionario != 0) {
                 Funcionario funcionario = new Funcionario();
                 funcionario = service.FuncionarioService.carregar(codigoFuncionario);
                 this.abrirCaixa.getjTidFuncionario().setText(String.valueOf(funcionario.getId()));
                 this.abrirCaixa.getjTnomeFuncionario().setText(funcionario.getNome());
                 this.abrirCaixa.getjTusuarioFuncionario().setText(funcionario.getUsuario());
                 
             }
             
         } else if (e.getSource() == this.abrirCaixa.getjBarbirCaixa()) {
            utilities.Utilities.ativa(false, this.abrirCaixa.getjPbotoes());
            utilities.Utilities.limpaComponentes(true, this.abrirCaixa.getjPdadosCaixa());
            utilities.Utilities.limpaComponentes(true, this.abrirCaixa.getjPdadosFuncionario());
            
             
         } else if (e.getSource() == this.abrirCaixa.getjBativarCaixa()){
             
             Caixa caixa = new Caixa();
             
             caixa.setDataHoraAbertura(LocalDateTime.now());
             caixa.setDataHoraFechamento(null);
             caixa.setFuncionario(service.FuncionarioService.carregar(codigoFuncionario));
             caixa.setObservacao(this.abrirCaixa.getjTobservacao().getText());
             
             /*Number valor = (Number) this.abrirCaixa.getjFvalorAbertura().getValue();
             if (valor != null) {
               caixa.setValorAbertura(valor.floatValue());
             }*/

             boolean statusCaixaAberto = this.abrirCaixa.getjRstatusCaixa().isSelected();
             float valorAbertura = Float.parseFloat(this.abrirCaixa.getjFvalorAbertura().getText());
             float valorFechamento = Float.parseFloat(this.abrirCaixa.getjFvalorFechamento().getText());
             caixa.setStatus(statusCaixaAberto);
             caixa.setValorAbertura(valorAbertura);
             caixa.setValorFechamento(valorFechamento);
             
             service.CaixaService.adicionar(caixa);
             
             
             
             
            utilities.Utilities.ativa(true, this.abrirCaixa.getjPbotoes());
            utilities.Utilities.limpaComponentes(false, this.abrirCaixa.getjPdadosCaixa());
            utilities.Utilities.limpaComponentes(false, this.abrirCaixa.getjPdadosFuncionario());
           /* this.abrirCaixa.getjBbuscarFuncionario().setEnabled(false);
            this.abrirCaixa.getjBarbirCaixa().setEnabled(false);
            this.abrirCaixa.getjBfecharCaixa().setEnabled(true);
            this.abrirCaixa.getjTidFuncionario().setEditable(false);
            this.abrirCaixa.getjTobservacao().setEditable(false);
            this.abrirCaixa.getjTusuarioFuncionario().setEditable(false);
            this.abrirCaixa.getjFvalorAbertura().setEditable(false);*/
           
           this.abrirCaixa.dispose();
             
         } else if (e.getSource() == this.abrirCaixa.getjBfecharCaixa()) {
             System.out.println("Fechando caixa");
             
         }
        
    }

  
    
    
  
    
    
}
