package med.voll.api.domain.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialista especialista) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialista());
    }

}
