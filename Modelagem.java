public class Modelagem extends UnidadeCurricular{

@Override
public void exibirCargaHoraria() {
        System.out.println("Unidade Curricular: " + getNome());
        System.out.println("Dia: " + getDia());
        System.out.println("Horário: " + getHorario());
        System.out.println("Sala: " + getSala());
        System.out.println("Carga Horária: " + getCargaHoraria() + " horas");



}
}