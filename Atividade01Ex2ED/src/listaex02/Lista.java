/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaex02;

/**
 *
 * @author bruno
 */
public class Lista {
    private double dados[];
    private int tamanho;
    public Lista(){
    dados=new double [5];
    tamanho=0;
    }
    public void AdicionaFinal(double e){
        if (tamanho<dados.length){
            dados[tamanho]=e;
            tamanho++;
        }
        else{
            System.out.println("Lista Cheia");
        }
    }
    public void AdicionaInicio(double e){
        if (tamanho<dados.length){
            for (int i=tamanho;i>0;i--){
                dados[i]=dados[i-1];
            }
        dados[0]=e;
        tamanho++;
        }
        else{
            System.out.println("Erro, lista cheia");
        }
    }
    public void AdicionaQualquerPosicao(double e, int pos){
        int i;
        if ((tamanho<dados.length)&&(pos<tamanho+1)&&(pos>=0)){
            for (i=tamanho;i!=pos;i--){
                if (i!=0){
                    dados[i]=dados[i-1];
                }
               }
         dados[i]=e;
        tamanho++;
        }
    }
    public double RemoveFinal(){
        double retorno = 0;
        int i;
        if (tamanho>=1){
            retorno=dados[tamanho-1];
            for (i=0;i<tamanho;i++){
                if (i==tamanho-1)
                    tamanho--;
                }
        }           
            return retorno;
        }
    public double RemoveInicio(){
        double retorno = 0;
        int i;
        if (tamanho>=1){
            retorno=dados[0];
            for (i=1;i<tamanho;i++){
                dados[i-1]=dados[i];
            }
                tamanho--;
        }
    return retorno;
    }
    public double RemoveQualquerPosicao(int pos){
        int i = 0;
        double retorno=0;
        if ((pos<tamanho)&&(pos>=0)&&(tamanho>=1)){
            retorno=dados[pos];
            for (i=pos;i<tamanho-1;i++){ 
                dados[i]=dados[i+1];
            }
            tamanho--;
        }
        return retorno;
        }
    public  void verifica(){
        if(tamanho==0){
            System.out.println("Lista Vazia");
        }else if(tamanho>=dados.length){
            System.out.println("Lista Cheia");
        }else{
            System.out.println("Lista parcialmente preenchida");
        }
            
    }
    public String percorre(){
    String aux=" ";
    for (int i=0;i<tamanho;i++){
        aux=aux+"\n"+dados[i]+"°C";
    }
        return aux;
    }
}
