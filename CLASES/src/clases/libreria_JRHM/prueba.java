/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.libreria_JRHM;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Jose Ramon Hernandez
 */
public class prueba {
    public static void main(String[] args) throws IOException
    {    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
         libreria r = new libreria();
        Scanner sc;
        sc=new Scanner(System.in);
        String entrada;
//////////////////METODO-ORDENAMIENTO//////////////////////////////////////////
       /* int[] arreglo={4, 9, 2, 1, 6, 3, 8};
       
        r.Ordenamiento(arreglo); 
    
for(int i=0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i]);
        }*/
        
        
        
///////////////////METODO-SUMA-MATRICES//////////////////////////////////////////
      /* System.out.println("Ingresa el numero de filas de la primera matriz");
        int fila1=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la primera matriz");
        int columna1=sc.nextInt();
        int[][] m1=new int[fila1][columna1];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la primera matriz");
        for(int x=0; x < m1.length; x++)
        {
            for(int z=0; z < m1[0].length; z++)
            {
                m1[x][z]=sc.nextInt();
            }
        }
        System.out.println("Ingresa el numero de filas de la segunda matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la segunda matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la segunda matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        int[][] m3;
        m3=r.sumaMatrices(m1, m2);
        r.imprimirMatriz(m1);
        r.imprimirMatriz(m2);
        r.imprimirMatriz(m3);*/
        
        
///////////////////METODO-RESTA-DE-MATRICES////////////////////////////////////////////
       /*System.out.println("Ingresa el numero de filas de la primera matriz");
        int fila1=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la primera matriz");
        int columna1=sc.nextInt();
        int[][] m1=new int[fila1][columna1];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la primera matriz");
        for(int x=0; x < m1.length; x++)
        {
            for(int z=0; z < m1[0].length; z++)
            {
                m1[x][z]=sc.nextInt();
            }
        }
        System.out.println("Ingresa el numero de filas de la segunda matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la segunda matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la segunda matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        int[][] m3;
        m3=r.restaMatrices(m1, m2);
        r.imprimirMatriz(m1);
        r.imprimirMatriz(m2);
        r.imprimirMatriz(m3);*/
       
       
       
/////////////////////////METODO-MULTIPLICACION-DE-MATRICES/////////////////////////////////////////////////////////
      /*System.out.println("Ingresa el numero de filas de la primera matriz");
        int fila1=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la primera matriz");
        int columna1=sc.nextInt();
        int[][] m1=new int[fila1][columna1];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la primera matriz");
        for(int x=0; x < m1.length; x++)
        {
            for(int z=0; z < m1[0].length; z++)
            {
                m1[x][z]=sc.nextInt();
            }
        }
        System.out.println("Ingresa el numero de filas de la segunda matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la segunda matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la segunda matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        int[][] m3;
        m3=r.multiplacionMatrices(m1, m2);
        r.imprimirMatriz(m1);
        r.imprimirMatriz(m2);
        r.imprimirMatriz(m3);
       */
       
/////////////////////METODO-BUSQUEDA.ARREGLO////////////////////////////////////////////////////
    /*  System.out.println("Ingresa el tamaño del arreglo");
        int a=sc.nextInt();
        int[] m=new int[a];
        System.out.println("Ingresa los datos que almacenara el arreglo");
        for(int x=0; x < m.length; x++)
        {
            m[x]=sc.nextInt();
        }
        r.busquedaArreglo(m);*/
       
       
       
//////////////////////////METODO-BUSQUEDA.MATRIZ///////////////////////////////////////////////////
       /* System.out.println("Ingresa el numero de filas de la matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        r.imprimirMatriz(m2);
        r.busquedaMatriz(m2);*/
       
       
       
////////////////////METODO-REPETICION.NUMEROS/////////////////////////////////////////////////////////
       /* System.out.println("Ingresa el numero de filas de la matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        int a;
        r.imprimirMatriz(m2);
        a=r.repeticionNumeros(m2);
        r.imprimirNumero(a);*/
        
        
        
///////////////////////METODO-MODA/////////////////////////////////////////////////////////////////////////
       /* System.out.println("Ingresa el tamaño del arreglo");
        int a=sc.nextInt();
        int[] m=new int[a];
        System.out.println("Ingresa los datos que almacenara el arreglo");
        for(int x=0; x < m.length; x++)
        {
            m[x]=sc.nextInt();
        }
        r.moda(m);*/
        
        
//////////////////////////METODO-ELIMINAR.DATOS.REPETIDOS////////////////////////////////////////////////////////     
        /*System.out.println("Ingresa el tamaño del arreglo");
        int a=sc.nextInt();
        String[] m=new String[a];
        System.out.println("Ingresa los datos que almacenara el arreglo");
        for(int x=0; x < m.length; x++)
        {
            entrada=bufer.readLine();
            m[x]=entrada;
        }
        r.imprimirArreglo_TipoString(m);
        String[] m2;
        m2=r.eliminarDatosRepetidos(m);
        
        r.imprimirArreglo_TipoString(m2);*/
       
       
///////////////////////METODO-MATRIZ.ESPIRAL////////////////////////////////////////////////////////////////////////
       /* System.out.println("Ingresa el numero de filas para la matriz");
        int a=sc.nextInt();
        System.out.println("Ingresa el numero de columnas para la matriz");
        int b=sc.nextInt();
        int[][] m;
        m=r.matrizEspiral(a, b);
        r.imprimirMatriz(m);*/
        
        
//////////////////////METODO-MATRIZ.ADJUNTA/////////////////////////////////////////////////////////////
        /*System.out.println("Ingresa el numero de filas de la matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        r.imprimirMatriz(m2);
        int[][] m3;
        m3=r.matrizAdjunta(m2);
        r.imprimirMatriz(m3);*/
        
        
        
        
        
////////////////////////METODO-MAYOR.MENOR///////////////////////////////////////////////////////
        System.out.println("Ingresa el numero de filas de la matriz");
        int fila2=sc.nextInt();
        System.out.println("Ingresa el numero de columnas de la matriz");
        int columna2=sc.nextInt();
        int[][] m2=new int[fila2][columna2];
        System.out.println("");
        System.out.println("Ingresa los valores que almacenara la matriz");
        for(int x=0; x < m2.length; x++)
        {
            for(int z=0; z < m2[0].length; z++)
            {
                m2[x][z]=sc.nextInt();
            }
        }
        r.menorYmayorMatriz(m2);
    }
    
}
