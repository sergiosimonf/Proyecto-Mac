package dev.sergiosf.proyectoaparcamiento.models

data class Vehiculo(
    val matricula: String,
    val dniPropietario: String,
    val marca: String,
    val modelo: String,
    val tipoVehiculo: TipoVehiculo
) {
    enum class TipoVehiculo(val value: String) {
        COMBUSTION("Combustion"), HIBRIDO("Híbrido"), ELECTRICO("Eléctrico"), NONE("")
    }
}

