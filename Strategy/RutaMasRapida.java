package Strategy;

public class RutaMasRapida implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Aquí se implementaría la lógica para calcular la ruta más rápida
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}