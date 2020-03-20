
package banco;
import java.util.Scanner;

public class Banco {

 static String[] nomes = new String[6];
 static int QTD1=1500, QTD2 = 1500,QTD3=1500,QTD4=1500,QTD5=1500,QTD6=1500;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.err.println("Quantos jogadores na partida ?");
        byte QT =input.nextByte();
        switch(QT){
            case 2:
                jogador1();           
                jogador2();
                break;
            case 3:
                 jogador1();           
                 jogador2();
                 jogador3();
                break;
            case 4:
                 jogador1();           
                 jogador2();
                 jogador3();
                 jogador4();
                 break;
            case 5:
                 jogador1();           
                 jogador2();
                 jogador3();
                 jogador4();
                 jogador5();
                 break;
            case 6:
                 jogador1();           
                 jogador2();
                 jogador3();
                 jogador4();
                 jogador5();
                 jogador6();
                 break;
            default:
                System.err.println("Essa quantidade é  invalida!");
        } 
            painel();
            System.err.println("O  jogo  acabou  e  tem besta  que ler  isso! hahaha. ");    
    } 
    
     public static void jogador1(){
        Scanner input = new Scanner(System.in);
        System.err.println("Qual  o nome do  primeiro  jogador ?");
        nomes[0] = input.nextLine();
        
        System.err.println( nomes[0] + " está com  " + QTD1 + " manopoly.");
       
       
    }
     public static void jogador2(){
          Scanner input = new Scanner(System.in);
          System.err.println("Qual  o nome do segundo jogador ?");
          nomes[1] = input.nextLine();
          System.err.println( nomes[1] + " está com  " + QTD2 + " manopoly.");
     }
     public static void jogador3(){
        Scanner input = new Scanner(System.in);
          System.err.println("Qual  o nome do terceiro jogador ?");
          nomes[2] = input.nextLine();
          System.err.println( nomes[2] + " está com  " + QTD3 + " manopoly.");  
     }
     public static void jogador4(){
          Scanner input = new Scanner(System.in);
          System.err.println("Qual  o nome do quarto jogador ?");
          nomes[3] = input.nextLine();
          System.err.println( nomes[3] + " está com  " + QTD4 + " manopoly.");
     }
     public static void jogador5(){
          Scanner input = new Scanner(System.in);
          System.err.println("Qual  o nome do quinto jogador ?");
          nomes[4] = input.nextLine();
          System.err.println( nomes[4] + " está com  " + QTD5 + " manopoly.");
     }
     public static void jogador6(){
          Scanner input = new Scanner(System.in);
          System.err.println("Qual  o nome do sexto jogador ?");
          nomes[5] = input.nextLine();
          System.err.println( nomes[5] + " está com  " + QTD6 + " manopoly.");
     }
    
    
    public static void perda(){
      Scanner input = new Scanner(System.in);
        System.err.println("Quem vai perde ? " + nomes[0] + " digite 1, " + nomes[1] + " digite 2,"
                + nomes[2] + " digite 3," + nomes[3] + " digite 4.");
        byte ll =input.nextByte();
        System.err.println("Quanto  o jogador  vai  perder ?");
        int  gan=input.nextInt();
        switch(ll){
            case 1:
               if(QTD1 < gan){
                  System.err.println(" O jogador " + nomes[0] + " bateu as botas.");
               }
                QTD1 -= gan;
                System.err.println( nomes[0] + " está com  " + QTD1 + " manopoly."); 
                break;
            case 2:
               if(QTD2 < gan){
                  System.err.println("O jogador " + nomes[1] + " bateu as botas.");
               }
                QTD2 -= gan;
                System.err.println(nomes[1] + " está com  " + QTD2 + " manopoly."); 
                break;
            case 3:
               if(QTD3 < gan){
                   System.err.println("O jogador " + nomes[2] + "  bateu as botas.");
               }
                QTD3 -= gan;
                System.err.println(nomes[2] + " está com  " + QTD3 + " manopoly.");
                break;
            case 4:
                if(QTD4 < gan){
                  System.err.println("O jogador " + nomes[3] +" bateu as botas.");
               }
                QTD3 -= gan;
                System.err.println(nomes[3] + " está com  " + QTD4 + " manopoly.");
                break;
            default:
                System.err.println("Opção invalida.");
                perda();
                
        }
        
        painel();      
      
    } 
    public static void ganho(){
        Scanner input = new Scanner(System.in);
        System.err.println("Quem vai  ganhar?" + nomes[0] + " digite 1, " + nomes[1] + " digite 2,"
                + nomes[2] + " digite 3," + nomes[3] + " digite 4.");
        byte ll =input.nextByte();
        System.err.println("Quanto  o jogador  vai  ganhar ?");
        int  gan=input.nextInt();
        switch(ll){
            case 1:
               
                QTD1 += gan;
                System.err.println( nomes[0] + " está com  " + QTD1 + " manopoly."); 
                break;
            case 2:
                QTD2 += gan;
                System.err.println(nomes[1] + " está com  " + QTD2 + " manopoly."); 
                break;
            case 3:
                QTD3 += gan;
                System.err.println(nomes[2] + " está com  " + QTD3 + " manopoly.");
                break;
            case 4:
                QTD3 += gan;
                System.err.println(nomes[3] + " está com  " + QTD4 + " manopoly.");
                break;
            default:
                System.err.println("Opção invalida.");
                
                painel();
        }
        
        painel(); 
    }
    public static void transfe(){
       
        Scanner input = new Scanner(System.in);
        System.err.println("Qual jogador  vai pagar ? " + nomes[0] + " digite 1, " + nomes[1] + " digite 2,"
                + nomes[2] +  " digite 3," + nomes[3] + " digite 4.");
        byte ll =input.nextByte();
        System.err.println("Quanto  o jogador  vai pagar ?");
        int  gan=input.nextInt();
        switch(ll){
            case 1:
               if(QTD1 > gan){
                QTD1 -= gan;
                System.err.println( nomes[0] + " está com  " + QTD1 + " manopoly."); 
               }else{
                  gan= QTD1;
                  QTD1 =0;  
                   System.err.println("O jogador " + nomes[0] + " bateu as botas.");
               }
                break;
            case 2:
               if(QTD2 > gan){
                QTD2 -= gan;
                System.err.println(nomes[1] + " está com  " + QTD2 + " manopoly."); 
               }else{
                  gan= QTD2;
                  QTD2 =0;  
                  System.err.println("O jogador " + nomes[1] +" bateu as botas.");
               }
                break;
            case 3:
               if(QTD3 > gan){
                QTD3 -= gan;
                System.out.println(nomes[2] + " está com  " + QTD3 + " manopoly.");
               }else{
                  gan= QTD3;
                  QTD3 =0; 
                  System.err.println("O jogador " + nomes[2] +" bateu as botas.");
               }
                break;
            case 4:
               if(QTD4 > gan){
                QTD3 -= gan;
                System.err.println(nomes[3] + " está com  " + QTD4 + " manopoly.");
               }else{
                  gan= QTD4;
                  QTD4 =0; 
                   System.err.println("O jogador " + nomes[3] +"  bateu as botas.");
               }
                break;
            default:
                System.err.println("Opção invalida.");
                painel();
                
        }
        System.err.println("Quem vai receber? " + nomes[0] + " digite 1, " + nomes[1] + " digite 2,"
            +  nomes[2] + " digite 3," + nomes[3] + " digite 4.");
            byte llm =input.nextByte();
        switch(llm){
            case 1:
               
                QTD1 += gan;
                System.err.println( nomes[0] + " está com  " + QTD1 + " manopoly."); 
                break;
            case 2:
                QTD2 += gan;
                System.err.println(nomes[1] + " está com  " + QTD2 + " manopoly."); 
                break;
            case 3:
                QTD3 += gan;
                System.err.println(nomes[2] + " está com  " + QTD3 + " manopoly.");
                break;
            case 4:
                QTD3 += gan;
                System.err.println(nomes[3] + " está com  " + QTD4 + " manopoly.");
                break;
            default:
                System.err.println("Opção invalida.");
             painel();
                
        }
        painel();    
    }
    public static void statos(){
        System.err.println("Se não  aparecer  agum  jogador  é porque ele está  com 1500 manopoly.\n"
                + "Quando este numero for  alterado o jogador irar aparecer nos  statos. ");
        
        for(int x=0;x<1;++x){
             System.err.println(nomes[0] + " está com  " + QTD1 + " manopoly.");
             System.err.println(nomes[1] + " está com  " + QTD2 + " manopoly.");
             if(QTD3 != 1500){
             System.err.println(nomes[2] + " está com  " + QTD3 + " manopoly.");
             }
             if(QTD4 != 1500){
             System.err.println(nomes[3] + " está com  " + QTD4 + " manopoly.");
             }
             if(QTD5 != 1500){
             System.err.println(nomes[4] + " está com  " + QTD5 + " manopoly.");
             }
             if(QTD6 != 1500){
             System.err.println(nomes[5] + " está com  " + QTD6 + " manopoly.");
             }
        }
        painel();
    }
    public static void painel(){
       Scanner input=new Scanner(System.in);
        System.err.println("Voce deseja  fazer uma:(perda=1),(ganho=2),(transferencia=3),"
                + "(mostra statos dos  jogadores=4) ou (fim  de jogo=5)?");  
                byte MI =input.nextByte();
                switch(MI){
                    case 1:
                        perda();
                        break;
                    case 2:
                        ganho();
                        break;
                    case 3:
                        transfe();
                        break;
                    case 4:
                        statos();
                        break;
                    case 5:
                        break;
                    default:
                        System.err.println("Esta  opção  é  invalida.");
                       painel();
                }
    }
}
