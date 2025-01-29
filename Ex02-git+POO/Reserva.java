 main
class Reserva {
    private int id;
    private Hospede hospede;
    private Quarto quarto;
    private int diarias;

    public Reserva(int id, Hospede hospede, Quarto quarto, int diarias) {
        this.id = id;
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public double calcularTotal() {
        return diarias * quarto.getPrecoDiaria();
    }

    public void finalizarReserva() {
        quarto.marcarIndisponivel();
    }

    public String exibirResumo() {
        double valorTotal = calcularTotal();
        return String.format("Resumo da Reserva:\n%s\n%s\nDiárias: %d\nValor total: R$ %.2f",
                hospede.exibirHospede(), quarto.exibirDetalhes(), diarias, valorTotal);
    }
}

public class Reserva {
    //atributos
    private int id;
    private Quarto quarto;
    private Hospede hospede;
    private int diarias;
    //metodo construtor com parametro
    public Reserva(int id, Quarto quarto, Hospede hospede, int diarias) {
        this.id = id;
        this.quarto = quarto;
        this.hospede = hospede;
        this.diarias = diarias;
    }
    //Get & Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    public int getDiarias() {
        return diarias;
    }
    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }
    //metodos
    public void calcular_total() {
    reserva = getDiarias() * preco_diaria;
        System.out.println("O valor total da reserva é de: " + reserva);
    }
    public void finalizar_reserva() {
        if (quarto != True) {
            System.out.println("Quarto indisponível! ");
        }
    }
    public void exibir_resumo() {
        System.out.println("Id da reserva: " + getId() + "\nTipo do quarto: " + getQuarto() +
                "\nNome do cliente: " + getHospede() + "\nDiárias: " + getDiarias());

    }
}//class
 main
