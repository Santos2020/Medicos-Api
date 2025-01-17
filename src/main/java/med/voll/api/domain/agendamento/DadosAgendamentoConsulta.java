package med.voll.api.domain.agendamento;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialista;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
//        @JsonFormat(pattern = "dd/MM/yyyy HH:mm
//        ")
        LocalDateTime data,

        Especialista especialista
) {
}
