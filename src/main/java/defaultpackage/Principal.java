/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defaultpackage;

import br.com.bossini._usjt_psc_segunda_crud_pessoas.Pessoa;
import br.com.bossini._usjt_psc_segunda_crud_pessoas.PessoaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String menu = "1-Cadastrar";
        int op;
        
        do{
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );
            
            switch(op)  {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    String fone = JOptionPane.showInputDialog("Digite o telefone");
                    String email = JOptionPane.showInputDialog("Digite o e-mail:");
                    var pessoa = new Pessoa(nome, fone, email);
                    var pessoaDAO = new PessoaDAO();
                    pessoaDAO.cadastrar(pessoa);
                    break;
                case 2:
                    break;
            }
        } while(true);
    }
}
