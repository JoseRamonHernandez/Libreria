/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.libreria_JRHM;
import java.util.Scanner;
/**
 *
 * @author Jose Ramon Hernandez
 */
public class libreria {
    
//para llamar al metodo Ordenamiento deben de colocar lo siguiente:
/*
    public static void main(String[] args)
    {
        int[] arreglo={4, 9, 2, 1, 6, 3, 8};
        libreria r = new libreria();
        r.Ordenamiento(arreglo); ->aquí mandas tu arreglo al metodo
    
Aquí lo imprimes -> for(int i=0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i]);
        }
    }
    */    
/////////////////ORDENAR-ARREGLO-POR-METODO-QUICKSORT-(EL MEJOR)/////////////////////////////////////////////
       public void Ordenamiento(int[] array)
        {   
            
            array = quicksort1(array);
        }
        public int[] quicksort1(int numeros[])
        {
            return quicksort2(numeros,0,numeros.length-1);
        }
        public int[] quicksort2(int numeros[], int izq, int der)
        {
            if(izq>=der)
                return numeros;
            
            int i=izq;
            int d=der;
            if(izq!=der)
            {
                int pivote;
                int aux;
                pivote=izq;
                
                while(izq!=der)
                {
                    while(numeros[der]>=numeros[pivote] && izq<der)
                        der--;
                    while(numeros[izq]<numeros[pivote] && izq<der)
                         izq++;
                   if(der!=izq)
                   {
                       aux= numeros[der];
                       numeros[der]=numeros[izq];
                       numeros[izq]=aux;
                   }
                    
                }
                if(izq==der)
                {
                    quicksort2(numeros,i,izq-1);
                    quicksort2(numeros,izq+1,d);
                }
            }
            else
                return numeros;
                        return numeros;
        }
        
        
///////////////////////SUMAR-MATRICES//////////////////////////////////////////////////////////////////////////
        public int[][] sumaMatrices(int[][] m1, int[][] m2)
        {
            int a=m1.length;
            int b=m2.length;
            int[][] m3= new int[a][b];
            
            if(m1.length != m2.length || m1[0].length != m2[0].length)
            {
                System.out.println("Error, las matrices no son cuadradas");
                System.exit(0);
            }
            else
                for(int i=0; i<a; i++)
                {
                   for(int x=0; x < b; x++)
                    {
                        m3[i][x] = m1[i][x] + m2[i][x];
                
                    }
                }
            return m3;
        }
        
        
////////////////////////RESTAR-MATRICES///////////////////////////////////////////////////////////////////////////
        public int[][] restaMatrices(int[][] m1, int[][] m2)
        {
            int a=m1.length;
            int b=m2.length;
            int[][] m3= new int[a][b];
            
            if(m1.length != m2.length || m1[0].length != m2[0].length)
            {
                System.out.println("Error, las matrices no son cuadradas");
                System.exit(0);
            }
            else
                for(int i=0; i<a; i++)
                {
                   for(int x=0; x < b; x++)
                    {
                        m3[i][x] = m1[i][x] - m2[i][x];
                
                    }
                }
            return m3;
        }
        
        
/////////////////////MULTIPLICACION-MATRICES//////////////////////////////////////////////////////////////////////
        public int[][] multiplacionMatrices(int[][] m1, int[][] m2)
        {
            int a=m1.length;
            int b=m2.length;
            int[][] matriz3= new int[a][b];
            
            if(m1.length != m2[0].length && m1[0].length != m2.length)
        {
            System.out.println("Error, las matrices no son cuadradas");
                System.exit(0);
        }
            else
                
             for (int x= 0; x<matriz3.length; x++)
          for (int y=0; y<matriz3[0].length; y++)
              for (int z=0; z<m2.length; z++)
                  matriz3[x][y] = matriz3[x][y] + m1[x][z] * m2[z][y];
            
            return matriz3;
        }
        
        
        
////////////////BUSCAR-POSICION-DE-UN-NUMERO-EN-UN-ARREGLO////////////////////////////////////////////////////////////////////////////////
        public void busquedaArreglo(int[] m1)
        {
            Scanner sc;
            sc=new Scanner(System.in);
            System.out.println("Tecela el numero el cual deceas conocer su posicion: ");
            int a=sc.nextInt();
             for(int i=0; i < m1.length; i++)
         {    if(a==m1[i])
                {   
                    System.out.println("El numero: "+a+" esta en la posicion: "+ (i+1));
                }   
         }
        }
        
        
///////////////////BUSQUEDA-DE-LA-POSICION-DE-UN-NUMERO-EN-UN-ARREGLO_BIDIMENCIONAL////////////////////////////////////////////////////////////////
        public void busquedaBidimiencional(int[][] m)    
        {
            Scanner sc;
            sc=new Scanner(System.in);
            
            System.out.println("Tecela el numero el cual deceas conocer su posicion: ");
            int a=sc.nextInt();
             for(int i=0; i < m.length; i++)
             {
                 for(int x=0; x < m[0].length; x++)
                    {    
                        if(a==m[i][x])
                        {   
                            System.out.println("El numero: "+a+" esta en la posicion: "+(i+1)+","+(x+1));
                        }   
                    }          
             }
        }
        
        
        
//////////////////CONOCER-EL-NUMERO-DE-REPETICION-DE-UN-NUMERO/////////////////////////////////////////////////////////////
        public int repeticionNumeros(int[][] m)
        {   
            Scanner sc;
            sc=new Scanner(System.in);
            
            
            int a=0;
            System.out.println("Teclea el numero el cual deceas conocer las veces que se repite");
            int numero=sc.nextInt();
            for(int x=0; x < m.length; x++)
            {
                for(int z=0; z < m[0].length; z++)
                {
                    if(numero == m[x][z])
                    {
                        a++;
                    }
                }
            }
            return a;
        }

        
////////////////MODA-ARREGLO//////////////////////////////////////////////////////////////////////////////////////////////
        public void moda(int[] m)
        {
            int Repite = 0;
            int moda = 0;

                for(int i=0; i<m.length; i++)
                {
                    int vecesQueSeRepite = 0;
                    for(int j=0; j<m.length; j++)
                    {
                    if(m[i] == m[j])
                        vecesQueSeRepite++;
                    }
                        if(vecesQueSeRepite > Repite)
                        {
                            moda = m[i];
                            Repite = vecesQueSeRepite;
                        }
                }

                    System.out.println("La moda es "+moda+" y se repitió "+Repite+" veces.");
            }

        
        
/////////////////ELIMINAR-NUMEROS-REPETIDOS-EN-UN-ARREGLO//////////////////////////////////////////////////////////////////////
       public  String[] eliminarDatosRepetidos(String[] arreglo) {  
        
        
        for(int a=0;a<arreglo.length;a++){

			for(int b=0;b<arreglo.length-1;b++){

				if(a!=b){

					if(!(arreglo[a] == null ? arreglo[b] == null : arreglo[a].equals(arreglo[b])))
                                        {
					} 
                                        else 
                                        {
                                        arreglo[a]="";
                                        }

				        }

			    }

		}

		int n=arreglo.length;

		for (int i=0;i<=n-1;i++){

			if(!"".equals(arreglo[i])); 
        
      
     }
                  return arreglo;
     }
        
        
        
        
//////////////////MATRIZ-EN-ESPIRAL//////////////////////////////////////////////////////////////////////////////////////////
public int[][] matrizEspiral(int n1, int n2)
{     
    Scanner sc;
    sc=new Scanner(System.in);
    int[][] matriz = null;
    if(n1 != n2)
    {
        System.out.println("Falla, las matriz no es cuadrada");
        System.exit(0);
    }
    
    else{
    
    matriz = new int[n1][n2];
    int a=0;
    int b=n1-1;
    int valor=0;
    //inicio de ciclo
    for(int j=0; j<matriz.length; j++){
    //llenar la fila superior
     System.out.println("Ingresa los datos que almacenara la fila superior");
    for(int i = a; i<=b; i++){
        matriz[a][i] =sc.nextInt() ;
    }System.out.println("");
    //llenar la columna extremo superior
        System.out.println("Ingresa los valores que almacenara la columna del extremo superior");
    for(int i = a+1; i<=b; i++){
        matriz[i][b] = sc.nextInt() ;
    }System.out.println("");
    //llenar la fila inferior de derecha a izquierda
        System.out.println("Ingresa los valores que almacenara la fila inferior de derecha a izquierda");
    for(int i = b-1 ;i>=a; i--){
        matriz[b][i] = sc.nextInt();
    }System.out.println("");
    //llenar la columna del extremo izquierdo de abajo hacia arriba
        System.out.println("Ingresa los valores que almacenara la columna del extremo izquierdo de bajo hacia arriba");
    for(int i = b-1 ;i>=a+1; i--){
        matriz[i][a] = sc.nextInt();
    }System.out.println("");
    
    a++;
    b--;
    }
    }
    return matriz;
}


///////////////MATRIZ-ADJUNTA////////////////////////////////////////////////////////////////////////////////////////////
    public int[][]  matrizAdjunta(int[][] arreglo)
    {
        Scanner sc;
        sc=new Scanner(System.in);
        int[][] arreglo3 = null;
       
        if(arreglo.length != arreglo[0].length)
        {
            System.out.println("Error, la matriz no es cuadrada");
            System.exit(0);
        }
        else{
            
            if(arreglo.length == 2 && arreglo[0].length == 2)
            {   
                
                arreglo3= new int[arreglo.length][arreglo[0].length];
        
                arreglo3[0][0]=arreglo[1][1];
                arreglo3[1][1]=arreglo[0][0];
                arreglo3[1][0]=(arreglo[1][0]*-1);
                arreglo3[0][1]=(arreglo[0][1]*-1);
                return arreglo3;
            }
            else
            
                if(arreglo.length == 3 && arreglo.length == 3)
                {
                     
                arreglo3= new int[arreglo.length][arreglo[0].length];
                
                arreglo3[0][0]=(arreglo[1][1]*arreglo[2][2])-(arreglo[1][2]*arreglo[2][1]);
                arreglo3[0][1]=-((arreglo[1][0]*arreglo[2][2])-(arreglo[1][2]*arreglo[2][0]));
                arreglo3[0][2]=(arreglo[1][0]*arreglo[2][1])-(arreglo[1][1]*arreglo[2][0]);
                arreglo3[1][0]=-((arreglo[0][1]*arreglo[2][2])-(arreglo[0][2]*arreglo[2][1]));
                arreglo3[1][1]=(arreglo[0][0]*arreglo[2][2])-(arreglo[0][2]*arreglo[2][0]);
                arreglo3[1][2]=-((arreglo[0][0]*arreglo[2][1])-(arreglo[0][1]*arreglo[2][0]));
                arreglo3[2][0]=(arreglo[0][1]*arreglo[1][2])-(arreglo[0][2]*arreglo[1][1]);
                arreglo3[2][1]=-((arreglo[0][0]*arreglo[1][2])-(arreglo[0][2]*arreglo[1][0]));
                arreglo3[2][2]=(arreglo[0][0]*arreglo[1][1])-(arreglo[0][1]*arreglo[1][0]);
                return arreglo3;
                }
            
            if(arreglo.length > 3 && arreglo[0].length > 3 || arreglo.length == 1 && arreglo[0].length == 1)
            {
                System.out.println("Error, este codigo solo funciona con matrices de 2*2 y 3*3 ");
                System.exit(0);
            }
        }
        return arreglo3;
    }
    
    
///////////ENCONTRAR-EL.NUMERO-MENOR-Y-MAYOR-EN-UNA-MATRIZ////////////////////////////////////////////////////////////////
    public void menorYmayorMatriz(int[][] matriz)
    {
        int menor=matriz[0][0];
        int mayor=matriz[0][0];
        for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				int numeroActual = matriz[x][y];
				if (numeroActual > mayor)
					mayor = numeroActual;
				if (numeroActual < menor)
					menor = numeroActual;
			}
		}
        System.out.println("El numero mayor de la matriz es: ");
        System.out.println(mayor);
        System.out.println();
        System.out.println("El numero menor de la matriz es: ");
        System.out.println(menor);
    }
    


////////////////IMPRIMIR-POR-MATRIZ//////////////////////////////////////////////////////////////////////////////////////////        
        public void imprimirMatriz(int[][] m)
        {
             System.out.println("La matriz es: ");
        for(int x=0; x < m.length; x++)
        {
            for(int z=0; z < m.length; z++)
            {
                System.out.print(m[x][z]+"\t");
                
            }
            System.out.println();
        }
        }


///////////////IMPRIMIR-ARREGLOS//////////////////////////////////////////////////////////////////////////////////////////
    public void imprimirArreglo_TipoEntero(int[] m)
    {
        int x;
        System.out.println("El arreglo es: ");
        for(x=0; x < m.length; x++)
        {
            System.out.println(m[x]);
        }
    }
    
    public void imprimirArreglo_TipoString(String[] m)
    {
        int x;
        System.out.print("El arreglo es: ");
        for(x=0; x < m.length; x++)
        {
            System.out.print(m[x]);
            System.out.print(" ");
        }
    }
    
        
////////////////IMPRIMIR-POR-NUMERO///////////////////////////////////////////////////////////////////////////////////
        public void imprimirNumero(int a)
        {
            System.out.println("El resultado es: "+a);
        }
    }
