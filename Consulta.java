import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {
    private int dataAgendamento;
    private int horaAgendamento;
    private String tipoConsuta;

    public int getDataAgendamento() {
        return dataAgendamento;
    }


    public int getHoraAgendamento() {
        return horaAgendamento;
    }



    public String getTipoConsuta() {
        return tipoConsuta;
    }

    public void setTipoConsuta(String tipoConsuta) {
        this.tipoConsuta = tipoConsuta;
    }

    public Consulta(int dataAgendamento, int horaAgendamento, String tipoConsuta) {
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.tipoConsuta = tipoConsuta;
    }

    public Consulta(){

    }

    public void setDataAgendamento(int dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public void setHoraAgendamento(int horaAgendamento) {
        this.horaAgendamento = horaAgendamento;
    }

    public void agendar(){
        Scanner scn = new Scanner(System.in);
        ArrayList<Consulta> consultas = new ArrayList<>();
        Consulta con = new Consulta();
        System.out.println("digite a data da consulta");
        setDataAgendamento(scn.nextInt());
        System.out.println("digite o Horario do agendamento");

    }

    public void visualizar(){

    }
}
