package carros

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
data class Carro(
        @field: NotBlank val modelo: String?,
        @field: NotBlank @field: Placa val placa: String?) //AAA-4A444
{
}