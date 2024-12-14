package med.voll.api.domain.consulta;


import jakarta.validation.constraints.NotNull;

public record DatosCancelamientoConsulta(

        @NotNull(message = "El ID de la consulta es obligatorio.")
        Long idConsulta,

        @NotNull(message = "El motivo de cancelación es obligatorio.")
        MotivoCancelamiento motivo

) {}

