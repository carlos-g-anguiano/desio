/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author Carlos G. Anguiano
 */
public class Permutar {
    private final int[] IP = new int[]{
        58, 50, 42, 34, 26, 18, 10, 2,
        60, 52, 44, 36, 28, 20, 12, 4,
        62, 54, 46, 38, 30, 22, 14, 6,
        64, 56, 48, 40, 32, 24, 16, 8,
        57, 49, 41, 33, 25, 17, 9, 1,
        59, 51, 43, 35, 27, 19, 11, 3,
        61, 53, 45, 37, 29, 21, 13, 5,
        63, 55, 47, 39, 31, 23, 15, 7
    };
    
    private final int[] E = new int[]{
        32, 1, 2, 3, 4, 5, 4, 5,
        6, 7, 8, 9, 8 ,9 ,10, 11,
        12, 13, 12, 13, 14, 15, 16, 17,
        16, 17, 18, 19, 20, 21, 20, 21,
        22, 23, 24, 25, 24, 25, 26, 27,
        28, 29, 28, 29, 30, 31, 32, 1
    };
    
    private final int[] P = new int[] {
        16, 7, 20, 21, 29, 12, 28, 17,
        1, 15, 23, 26, 5, 18, 31, 10,
        2, 8, 24, 14, 32, 27, 3, 9,
        19, 13, 30, 6, 22, 11, 4, 25
    };
    
    private final int[] FP = new int[] {
        40, 8, 48, 16, 56, 24, 64, 32,
        39, 7, 47, 15, 55, 23, 63, 31,
        38, 6, 46, 14, 54, 22, 62, 30,
        37, 5, 45, 13, 53, 21, 61, 29,
        36, 4, 44, 12, 52, 20, 60, 28,
        35, 3, 43, 11, 51, 19, 59, 27,
        34, 2, 42, 10, 50, 18, 58, 26,
        33, 1, 41, 9, 49, 17, 57, 25
    };
    
    private final int PC1[] ={57,49,41,33,25,17,9,1,
                             58,50,42,34,26,18,10,2,
                             59,51,43,35,27,19,11,3,
                             60,52,44,36,63,55,47,39,
                             31,23,15,7,62,54,46,38,
                             30,22,14,6,61,53,45,37,
                             29,21,13,5,28,20,12,4};
    
    private final int PC2[]={14, 17, 11, 24, 1, 5, 3, 28,
                            15, 6, 21, 10, 23, 19, 12, 4,
                            26, 8, 16, 7, 27, 20, 13, 2,
                            41, 52, 31, 37, 47, 55, 30, 40,
                            51, 45, 33, 48, 44, 49, 39, 56,
                            34, 53, 46, 42, 50, 36, 29, 32};
    
    public String permutedChoiceI(String dato){
        return permutar(dato, this.PC1);
    }
    
    public String permutedChoiceII(String dato){
        return permutar(dato, this.PC2);
    }
    
    public String permutationP(String dato){
        return permutar(dato, this.P);
    }
    
    public String initialPermutation(String dato){
        return permutar(dato, this.IP);
    }
    
    public String Expantion(String dato){
        return permutar(dato, this.E);
    }
    
    public String finalPermutation(String dato){
        return permutar(dato, this.FP);
    }
    
    private String permutar(String dato, int[] arreglo){
        String resultado = "";
        for(int i =0; i<arreglo.length; i++){
            resultado += dato.charAt(arreglo[i]-1);
        }
        return resultado;
    }
    
    
}
 /*
===================================================================
VERSIONES ANTERIORES
===================================================================

private String permutedChoiceII(String recorri){
        String subclave = "";
        
        for(int i=0; i<PC2.length; i++){
            subclave += recorri.charAt(PC2[i]-1);
        }
        
        return subclave;
    }



*/