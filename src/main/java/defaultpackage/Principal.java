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
        String menu = "1-Cadastrar\\n2-Listar\\n3-Atualizar\\n4-Remover\\n0-Sair";
        var pessoaDAO = new PessoaDAO();
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
                    pessoaDAO.cadastrar(pessoa);
                    break;
                case 4:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do usuário a ser removido"));JOptionPane.showInputDialog("Digite o código do usuário a ser removido");
                    pessoaDAO.deletar(codigo);
                    JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
                    break;
            }
        } while(true);
    }
}
