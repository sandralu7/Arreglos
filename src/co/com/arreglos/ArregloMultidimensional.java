package co.com.arreglos;

public class ArregloMultidimensional {

	public static void main(String[] args) {
		
		int [][] matriz = {{32, 87,3, 589}, //0 
						//  0    1 2   3
							{12, -30, 190, 0}, //1
							{622, 127, 981, -3, 5}}; //2
		
		//arreglo {32, 87,3, 589} = 4
		
		
		int numero = 12;
		
		int i = 0;
		int j = 0;
		
		for(i=0; i<matriz.length; i++) {
			for (j=0; j<matriz[i].length; j++) {
				System.out.println("matriz ( " + i + "," + j +") = " +matriz[i][j] );
				if(matriz[i][j]==numero) {
					System.out.println("Lo encontré");
				}
				
			}
			System.out.println(" Siguiente arreglo ");
			
		}
		
		
		

	}

}
