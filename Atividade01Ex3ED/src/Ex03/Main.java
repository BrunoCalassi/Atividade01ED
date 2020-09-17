/*TESTE DE MESA
opc=opção
opc 1= 40 a a 1
opc 7 =lista=40 a a 1 --->
opc 2=20 b b 2
lista:20 b b 2 ---> 
40 a a 1 ---> 
opc 3 posição 2 = 25 c c 3
opc 7 =lista:20 b b 2---> 
25 c c 3---> 
40 a a 1 ---> 
opc 6 posição 2=remove 25 c c 3
opc 7 =lista 20 b b 2 ---> 
40 a a 1 ---> 
opc 4= remove final 40 a a 1 ---> 
opc 7 =lista 20 b b 2 ---> 
opc 5= remove inicio 20 b b 2
opc 7 =msg = lista vazia */        
package Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Main {
    public static void main(String[] args) {
        Lista lista=new Lista();
        Aluno a;
        int pos;
        int opc=0;
        while(opc!=9){
            opc=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Inicio\n2-Adiciona Final\n3-Adiciona em uma posição específica\n"
            + "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n9-Sair"));
            switch(opc){
                case 1:
                      a= new Aluno();
                      a.setRA(Integer.parseInt(JOptionPane.showInputDialog("RA")));
                      a.setNome(JOptionPane.showInputDialog("Nome"));
                      a.setTurma(JOptionPane.showInputDialog("Turma"));
                      a.setSemestre(JOptionPane.showInputDialog("Semestre"));
                      lista.AddInicio(a);
                        break;
                case 2:
                      a= new Aluno();
                      a.setRA(Integer.parseInt(JOptionPane.showInputDialog("RA")));
                      a.setNome(JOptionPane.showInputDialog("Nome"));
                      a.setTurma(JOptionPane.showInputDialog("Turma"));
                      a.setSemestre(JOptionPane.showInputDialog("Semestre"));
                      lista.AddFim(a);
                        break;
                case 3:
                        
                    break;
                case 4:
                     lista.RemoveFinal();
                     break;
                 case 5:
                    lista.RemoveInicio();
                    break;
                 case 6:
                    pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover"));
                    JOptionPane.showMessageDialog(null,"O elemento removido foi: "+lista.RemoveAny((int) pos));
                     break;
                case 7:lista.percorre();
                        break;
                
                        
                           
            case 9:
                JOptionPane.showMessageDialog(null,"Saindo");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
         }
        }
    }
    
}
