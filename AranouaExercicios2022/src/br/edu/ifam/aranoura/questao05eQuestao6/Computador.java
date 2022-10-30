package br.edu.ifam.aranoura.questao05eQuestao6;

public class Computador {
        private String marcar;
        private String cor;
        private String modelo;
        private String numeroSerie;
        private Double preco;
        

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
        }


        public Computador(String marcar, String cor, String modelo, String numeroSerie, Double preco) {
                this.marcar = marcar;
                this.cor = cor;
                this.modelo = modelo;
                this.numeroSerie = numeroSerie;
                this.preco = preco;
        }

        // Metodos Manurais]
        public void imprimir(Computador comp){
                message = "Computador: "+comp.numeroSerie+
                        "\nMarca: "+comp.marcar+
                        "\nModelo: "+comp.modelo+
                        "\nCor: "+comp.cor+
                        "\nPreco: R$ "+comp.preco.toString();
                
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