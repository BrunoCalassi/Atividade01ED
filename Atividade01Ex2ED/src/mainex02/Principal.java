/*TESTE DE MESA
opc=opção
opc 1= 40
opc 7 =lista=40
opc 2=20
lista:20 40
opc 3 posição 2 = 25
opc 7 =lista:20 25 40
opc 1=-279
msg="Temperatura inválida abaixo do zero absoluto, digite outra"
opc 7 =lista:20 25 40
opc 6 posição 2=remove 25
opc 7 =lista 20 40
opc 4= remove final 40
opc 7 =lista 20
opc 5= remove inicio 20
opc 7 =lista*/


package mainex02;

import javax.swing.JOptionPane;
import listaex02.Lista;

/**
 *
 * @author bruno
 */
public class Principal {
    public static void main(String[] args) {
        Lista temperatura=new Lista();
        double temp,pos;
        int opc=0;
        while(opc!=9){
            opc=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona em uma posição específica\n"
            + "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n8-Verificar Lista\n9-Sair"));
            switch(opc){
                case 1:
                      temp=Double.parseDouble(JOptionPane.showInputDialog("Temperatura Celsius"));
                      if (temp >= -273.15){
                         temperatura.AdicionaFinal(temp); 
                      }
                      else{
                        JOptionPane.showMessageDialog(null,"Temperatura inválida abaixo do zero absoluto, digite outra");
                      }
                        break;
                case 2:
                    temp=Double.parseDouble(JOptionPane.showInputDialog("Temperatura em Celsius"));
                    if (temp >= -273.15){
                        temperatura.AdicionaInicio(temp);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Temperatura inválida abaixo do zero absoluto, digite outra");
                     }
                    break;
                case 3:
                    temp=Double.parseDouble(JOptionPane.showInputDialog("temperatura em Celsius"));
                    pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que você deseja inserir"));
                    pos=pos-1;
                if (temp >= -273.15){
                    temperatura.AdicionaQualquerPosicao(temp, (int)pos);
                }else{
                    JOptionPane.showMessageDialog(null,"Temperatura inválida abaixo do zero absoluto, digite outra");
                }
                    break;
            case 4:
                JOptionPane.showMessageDialog(null,"O elemento removido foi: "+temperatura.RemoveFinal());
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"O elemento removido foi:"+temperatura.RemoveInicio());
                break;
            case 6:
                pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover"));
                pos=pos-1;
                JOptionPane.showMessageDialog(null,"O elemento removido foi: "+temperatura.RemoveQualquerPosicao((int) pos));
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Lista:"+temperatura.percorre());
                break;
            case 8:
                temperatura.verifica();
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
    

