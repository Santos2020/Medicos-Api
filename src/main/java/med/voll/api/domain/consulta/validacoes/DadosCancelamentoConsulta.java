package med.voll.api.domain.consulta.validacoes;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(@NotNull
                                        Long idConsulta,

                                        @NotNull
                                        MotivoCancelamento motivo) {
}
