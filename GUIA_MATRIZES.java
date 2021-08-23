import java.util.Scanner;
import java.util.Random;

public class GUIA_MATRIZES {
  public static void main (String[] args){
    
    Scanner leia = new Scanner (System.in);
    Random aleatorio = new Random();
    //var
    Double variavel=0.0;//variavel = leia.nextDouble();
    int variavel=0; //variavel = leia.nextInt():
   
      
    //matrizes
    String[][] vogais = new String[10][10]; //matriz[linha][coluna]=leia.next();     
    double [][] matriz = new double [10][10]; //matriz [linha][coluna] = leia.nextDouble();
    int[][] matriz = new int[10][10]; //matriz[linha][coluna] = leia.nextInt();
    //vetores
    int[] vetor = new int[10];
    String [] vetor = new String [10];//vetor[cont]=leia.next();
    double [] vetor = new double [10];
    
    //valores aleatorios para a matriz
    for (int linha=0; linha < 10; linha++)
    {
      for (int coluna=0; coluna < 10; coluna++)
      {
        System.out.println("Linha: "+i+" Coluna: "+j);
        
        matriz[linha][coluna] = aleatorio.nextInt(10) + 1;
        
      }
    }
    
    //prencher a matriz
    for (int linha=0; linha < 10; linha++)
    {
      for (int coluna=0; coluna < 10; coluna++)
      {
        System.out.println("Linha: "+i+" Coluna: "+j);
        /*if(coluna==0){
         System.out.println("Digite o codigo do produto:"+linha);
         }
         if(coluna==1){
         System.out.println("Digite a quantidade do produto:"+linha);
         }
         if(coluna==2){
         System.out.println("Digite o preço do produto:"+linha);
         }*/
        matriz[linha][coluna] = leia.nextInt();
      }
    }
    
    // ordenando o VETOR em ordem crescente 
    int temporario;
    for(int ind=0;ind<20;ind++){
      for(int j=ind+1;j<20;j++){ // índice +1
        if(vetor[ind]>vetor[j]){
          
          temporario=vetor[ind];
          vetor[ind]=vetor[j];
          vetor[j]=temporario;
        }
      }
    }
// ler o VETOR
    for(int ind=0;ind<10;ind++){
      System.out.print(vetor[ind]+"  ");
    }
    System.out.println("\n");
    
//ler a MATRIZ
    //System.out.println("COD QUANT PRE");
    for (int linha=0; linha < 10; linha++)
    {
      for (int coluna=0; coluna < 10; coluna++)
      {
        
        System.out.print( matriz[linha][coluna]+"\t" );
      }
      System.out.println();
    }
    
    //VETOR armazena MATRIZ
    for (int i=0; i < 10; i ++)
    {
      for (int j=0; j < 20; j++)
      {
        vetor[j]= vetor[j]+ matriz[i][j];
      }
      System.out.println();
    }
    
    
    //MATRIZ multiplica VETOR
    for (int i=0; i < 10; i ++)
    {
      for (int j=0; j < 20; j++)
      {
        matriz[i][j]=matriz[i][j]*vetor[j];
        
      }
      System.out.println();
    }
    
    //MATRIZ: SOMA COLUNA, DIAGONAL PRINCIPAL E SECUNDARIA
    somaColuna = 0; //VARIAVEL PARA SOMAR COLUNA
    for (lin = 0; lin < matriz.length; lin ++) { //PERCORRE A MATRIZ
      somaColuna2 = somaColuna2 + matriz[lin][0]; //SOMA O VALOR DA COLUNA 1
    }
    System.out.println ("A soma dos elementos da coluna 1 é "+somaColuna2); //ESCREVE O RESULTADO DA COLUNA 2
 
    if (matriz.length == matriz[0].length) { //CHECAR SE A MATRIZ É QUADRADA
      somaDiagonaPRINCIPAL = 0;//VARIAVEL PARA SOMAR DIAGONAL PRINCIPAL 
      for (ind = 0; ind < matriz.length; ind ++) {//PERCORRE A MATRIZ
        somaDiagonaPRINCIPAL = somaDiagonaPRINCIPAL + matriz[ind][ind];//SOMA AS POSIÇÕES IGUAIS, 0X0,1X1,2X2... DE LINHAS E COLUNAS
      }
      System.out.println ("A soma dos elementos da diagonal principal é "+somaDiagonalPRINCIPAL);//ESCREVE A SOMA DA DIAGONAL PRINCIPAL
    }
    
    if (mat.length == mat[0].length) {//CHECAR SE A MATRIZ É QUADRADA
      somaDiagonalSECUNDARIA = 0;//VARIAVEL PARA SOMAR DIAGONAL SECUNDARIA 
      for (ind = 0; ind < matriz.length; ind ++) {//PERCORRE A MATRIZ
        somaDiagonalSECUNDARIA = somaDiagonalSECUNDARIA + matriz[ind][(matriz.length-1)-ind];//DIAGONAL SECUNDARIA=LINHA+COMPRIMENTO TOTAL DE COLUNAS-1(PARA FAZER O SENTIDO OPOSTO AO DA PRINCIPAL)
      }
      System.out.println ("A soma dos elementos da diagonal secundária é "+somaDiagonalSECUNDARIA);//ESCREVE O VALOR DA DIAGONAL SECUNDARIA
      
      
    }
    
    //MATRIZ transposta
    for (linha = 0; linha < matriz1.length; linha ++) {
      for (coluna = 0; coluna < matriz1[0].length; coluna ++) {
        matriz1[linha][coluna] = leia.nextInt();
        matriz2[coluna][linha] = matriz1[lin][col];//inverte a matriz
    
  }
}