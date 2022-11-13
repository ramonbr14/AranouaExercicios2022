package br.edu.ifam.aranoura.questao05eQuestao6;

public class PrincipalComputador {
    
    public static void main(String[] args) {
        Computador cpu1 = new Computador("IBM","Vermelho", "IBM-01","IBMSP142536",1000.10);
        Computador cpu2 = new Computador("TOSHIBA","Amarelo", "TSH-02","TOSHI147563",2000.20);
        Computador cpu3 = new Computador("HP","Azul", "AZP-09","AMPC36256",1000.10);
        /*Computador cpu4 = new Computador("DELL","AzulMarinho", "DLL-27","DELLP784965");
        Computador cpu5 = new Computador("LG","Verde", "LG-78","LGPC6546464");
        Computador cpu6 = new Computador("SAMSUMG","Roxo", "SMG-99","SAMG796231");
        Computador cpu7 = new Computador("MULTILASER","Rosa", "MTL-58","MULT798465645666");
        Computador cpu8 = new Computador("HP","Cinza", "PHC-36","PHILC142536");
        Computador cpu9 = new Computador("POWERPC","Turquesa", "PWP-25","POWPC449494");
        Computador cpu0 = new Computador("IBM","Dourado", "MIC-098","MICRO545415");*/
    

        //imprimir
        System.out.print("SEM O ALTERAR VALOR\n\n");
        cpu1.imprimir(cpu1);
        cpu2.imprimir(cpu2);
        cpu3.imprimir(cpu3);
        /*cpu4.imprimir(cpu4);
        cpu5.imprimir(cpu5);
        cpu6.imprimir(cpu6);
        cpu7.imprimir(cpu7);
        cpu8.imprimir(cpu8);
        cpu9.imprimir(cpu9);
        cpu0.imprimir(cpu0);*/
        
        //CalcularValor
        System.out.print("ALTERAR VALOR\n\n");
        cpu1.alterarValor(0, cpu1);
        cpu2.alterarValor(-1, cpu2);
        cpu3.alterarValor(1, cpu3);
        /*cpu8.alterarValor(0, cpu8);
        cpu9.alterarValor(0, cpu9);
        cpu0.alterarValor(0, cpu0);*/
        
        //imprimir
        System.out.print("COM O ALTERAR VALOR\n\n");
        cpu1.imprimir(cpu1);
        cpu2.imprimir(cpu2);
        cpu3.imprimir(cpu3);
        /*cpu4.imprimir(cpu4);
        cpu5.imprimir(cpu5);
        cpu6.imprimir(cpu6);
        cpu7.imprimir(cpu7);
        cpu8.imprimir(cpu8);
        cpu9.imprimir(cpu9);
        cpu0.imprimir(cpu0);*/
        
        //CalcularValor
        System.out.print("calculandoValor");
        cpu1.calcularValor(cpu1);
        cpu2.calcularValor(cpu2);
        cpu3.calcularValor(cpu3);
        /*cpu8.calcularValor(cpu8);
        cpu9.calcularValor(cpu9);
        cpu0.calcularValor(cpu0);*/

        //imprimir
        System.out.print("COM O calcular VALOR\n\n");
        cpu1.imprimir(cpu1);
        cpu2.imprimir(cpu2);
        cpu3.imprimir(cpu3);
        /*cpu4.imprimir(cpu4);
        cpu5.imprimir(cpu5);
        cpu6.imprimir(cpu6);
        cpu7.imprimir(cpu7);
        cpu8.imprimir(cpu8);
        cpu9.imprimir(cpu9);
        cpu0.imprimir(cpu0);*/
    }
}

