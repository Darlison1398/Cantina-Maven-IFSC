
package controllerMovimento;

import controller.ControllerBuscaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AbrirCaixa;
import view.BuscaFuncionario;
import static controller.ControllerCadastroFuncionario.codigoFuncionario;
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
        utilities.Utilities.limpaComponentes(true, this.abrirCaixa.getjPdadosFuncionario());
        utilities.Utilities.limpaComponentes(true, this.abrirCaixa.getjPdadosCaixa());
        
        
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
             System.out.println("Abrindo caixa");
             
         } else if (e.getSource() == this.abrirCaixa.getjBativarCaixa()){
             System.out.println("Ativando caixa");
             
         } else if (e.getSource() == this.abrirCaixa.getjBfecharCaixa()) {
             System.out.println("Fechando caixa");
             
         }
        
    }

  
    
    
  
    
    
}
