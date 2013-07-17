/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

/**
 *
 * @author MIGUELH
 */

public class Cedula {

  static int cedula[]={1,1,0,4,6,6,3,9,3};
	static int coeficiente=1,i,suma=0,total,division,verificador;
	
	public static void main(String[] args) {
		
		for(i=0;i<cedula.length;i++){
			
			if(coeficiente==1){
				coeficiente=2;
			}else{
				if(coeficiente==2){
					coeficiente=1;
				}
			}
			total=cedula[i]*coeficiente;
			if(total>9){
				total=total-9;
			}
			suma=suma+total;			
		}
		division = (suma % 10);
		verificador = 10 - division;
		if(division==0){
			verificador=0;
		}
		System.out.println("El digito verificador de su cedula es: "+verificador);
	}
}
