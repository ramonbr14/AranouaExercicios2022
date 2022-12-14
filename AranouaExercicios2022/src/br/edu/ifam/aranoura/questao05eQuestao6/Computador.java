package br.edu.ifam.aranoura.questao05eQuestao6;

import javax.swing.JOptionPane;

public class Computador {
        private String marcar = "";
        private String cor = "";
        private String modelo ="";
        private String numeroSerie;
        private Double preco = 0.0;
        

        String message = "";
	String title = "Computadores de RuneTerra";

        //Contrutores
        public Computador() {
        }

        public Computador(String marcar, String cor, String modelo, String numeroSerie) {
                this.marcar = marcar;
                this.cor = cor;
                this.modelo = modelo;
                this.numeroSerie = numeroSerie;
                //preco = numeroAleatorio();
        }


        public Computador(String marcar, String cor, String modelo, String numeroSerie, Double preco) {
                this.marcar = marcar;
                this.cor = cor;
                this.modelo = modelo;
                this.numeroSerie = numeroSerie;
                this.preco = preco;
        }

        // Metodos Manurais
        public void imprimir(Computador comp){
                message = "Computador: "+comp.getNumeroSerie()+
                        "\nMarca: "+comp.getMarcar()+
                        "\nModelo: "+comp.getModelo()+
                        "\nCor: "+comp.getCor()+
                        "\nPreco: R$ "+comp.getPreco();

                JOptionPane.showConfirmDialog(null, message, title, 0, JOptionPane.WARNING_MESSAGE);
		System.out.println("\n"+message+"\n");
       }

       public void calcularValor(Computador comp){
                if(comp.getMarcar().equals("HP")){
                        comp.setPreco(comp.getPreco()+(comp.getPreco()*0.3));
                }else if(comp.getMarcar().equals("IBM")){
                        comp.setPreco(comp.getPreco()+(comp.getPreco()*0.5));
                }

       }

       public boolean alterarValor(double num, Computador comp){
        //num = numeroAleatorio();
        if(num<=0){
                System.out.println("VALOR N??O ALTERADO");
                return false;
        }else{
                comp.setPreco(numeroAleatorio());
                System.out.println("VALOR CORRIGIDO");
                return true;
        }

        }

       public double numeroAleatorio(){
        double numero;
        int min = 1000;
        int max = 50000;
        numero = Math.round(Math.random()*(max-min+1)+min);
        return numero;
       }

        //getters e setters       
        public String getMarcar() {
                return marcar;
        }

        public void setMarcar(String marcar) {
                this.marcar = marcar;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getNumeroSerie() {
                return numeroSerie;
        }

        public void setNumeroSerie(String numeroSerie) {
                this.numeroSerie = numeroSerie;
        }

        public Double getPreco() {
                return preco;
        }

        public void setPreco(Double preco) {
                this.preco = preco;
        }
}