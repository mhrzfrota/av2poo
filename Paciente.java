import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {
    private static int codigoCliente;
    private String nomeCliente;
    private static String convenioCliente;
    private int numeroFixo;
    private int numeroCelular;

    static Scanner scn = new Scanner(System.in);
    public Paciente(int codigoCliente, String nomeCliente, String convenioCliente, int numeroFixo) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.convenioCliente = convenioCliente;
        this.numeroFixo = numeroFixo;
    }

    public Paciente(int codigoCliente, String nomeCliente, String convenioCliente, int numeroFixo, int numeroCelular) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.convenioCliente = convenioCliente;
        this.numeroFixo = numeroFixo;
        this.numeroCelular = numeroCelular;
    }

    public Paciente(int codigoCliente, String nomeCliente, int numeroCelular, String convenioCliente ) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.convenioCliente = convenioCliente;
        this.numeroCelular = numeroCelular;
    }

    public Paciente(){

    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getConvenioCliente() {
        return convenioCliente;
    }

    public void setConvenioCliente(String convenioCliente) {
        this.convenioCliente = convenioCliente;
    }

    public int getNumeroFixo() {
        return numeroFixo;
    }

    public void setNumeroFixo(int numeroFixo) {
        this.numeroFixo = numeroFixo;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public static void cadastrar(){
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        Paciente pac = new Paciente();
        System.out.println("Digite o codigo do paciente.");
        pac.setCodigoCliente(scn.nextInt());
        System.out.println("Digite o nome do paciente.");
        pac.setNomeCliente(scn.nextLine());
        System.out.println("Digite o convenio a ser utilizado.");
        pac.setConvenioCliente(scn.nextLine());
        System.out.println("Digite o numero de telefone fixo.");
        pac.setNumeroFixo(scn.nextInt());
        System.out.println("Digite o numero de telefone celular.");
        pac.setNumeroCelular(scn.nextInt());
        listaPacientes.add(pac);
    }

    public void alterar(){

    }

}