/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Lista {
    private No prim;
    private No ult;
    private int qtd;

    public Lista() {
        this.prim = null;
        this.ult = null;
        this.qtd = 0;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void AddInicio(Aluno a){
        No no =new No(a);
        if (this.verifica()) {
            this.ult=no;
        }
        no.setProx(this.prim);
        this.prim=no;
        this.qtd++;
       
    }
    
    public boolean verifica(){
        return(this.prim==null);
    }
    
    public void AddFim(Aluno a){
        No no =new No(a);
        if(this.verifica()){
            this.prim=no;
        }else{
            this.ult.setProx(no);
        }
        this.ult=no;
        this.qtd++;
    }
    
    public boolean RemoveAny(int pos){
        No atual=this.prim;
        No ant=null;
        if(this.verifica()){
            System.out.println("lista vazia");
            return false;
        }else{
            while(atual!=null && this.qtd<pos-1){
                ant=atual;
                atual=atual.getProx();
	        qtd++;
            }
           if(atual ==this.prim){
               if (this.prim==this.ult) {
                   this.ult=null;
               }
               this.prim=this.prim.getProx();
           }else{
               if (atual==this.ult) {
                   this.ult=ant;
               }
               ant.setProx(atual.getProx());
           } 
           this.qtd--;
        }
        return true;
    }
    
    public int RemoveInicio(){
		int r=-1;
		if (verifica()){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r=prim.getA().getRA();
			prim=prim.getProx();
		}
		return r;
	}
    
    public int RemoveFinal(){
		int r=-1;
		if (verifica()){
			System.out.println("Lista Vázia");
		}
		else{
			if (prim.getProx()==null){
				r=prim.getA().getRA();
				prim=null;
			}
			else{
				No aux1=prim;
				No aux2=this.getPrim();

				while(aux1.getProx()!=null){
					aux2=aux1;
					aux1=aux1.getProx();
				}

				r=prim.getA().getRA();
				aux2.setProx(null);
			}
		}
		return r;
	}
    
    
    public void escolhePosicao(Aluno a, int pos){
	        No no= new No(a);

	        if(pos==1){            
	            AddInicio(a);
	        }else{       
	            No aux=prim;
	            int count=1;
	            
	            while(aux.getProx()!=null && count<pos-1){
	                aux=aux.getProx();
	                qtd++;
	            }
	            
	            if(count==pos-1){  
	                no.setProx(aux.getProx());
	                aux.setProx(no);
	            }else{
	                System.out.println("Posição Inválida!");
	            }            
	        }
	    }
    public String percorre(){
        String  msg=" ";
        No atual =prim;
        if(this.verifica()){
            msg="Lista Vazia";
        }
        while(atual !=null){
            msg=msg+"\n"+ atual.getA().getRA() + " " + atual.getA().getNome() +" "+atual.getA().getTurma()+" " +atual.getA().getSemestre() + "--->";
            atual=atual.getProx();
        } 
        return msg;
    }
    
}
