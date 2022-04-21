package carros

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import jakarta.inject.Singleton
import javax.validation.Constraint

@MustBeDocumented // gera documentação dessa classe
@Target(AnnotationTarget.FIELD, AnnotationTarget.CONSTRUCTOR)
@Retention(AnnotationRetention.RUNTIME) // Framework pode validar a classe antes da execução
@Constraint(validatedBy = [PlacaValidator::class])
annotation class Placa(val message: String = "Placa com formato inválido") {

}

@Singleton // para o objeto ser reconhecido pelo micronaut
class PlacaValidator : ConstraintValidator<Placa, String> {
    override fun isValid(value: String?, annotationMetadata: AnnotationValue<Placa>, context: ConstraintValidatorContext): Boolean {
        //AAA0-0A00

        // ja existe o @NotNUll para verificar, e se ele for opcional não tem o que validar.
        if (value.isNullOrBlank()) {
            return true;
        }

        return value.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}".toRegex())
    }

}