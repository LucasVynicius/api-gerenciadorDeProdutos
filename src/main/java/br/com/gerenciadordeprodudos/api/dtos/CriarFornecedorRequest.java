package br.com.gerenciadordeprodudos.api.dtos;

import br.com.gerenciadordeprodudos.api.enums.TipoFornecedorEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

import java.time.LocalDateTime;

public record CriarFornecedorRequest(
        @NotBlank
        String nome,
        @CNPJ(message = "Cnpj inválido!")
        String cnpj,
        @Email(message = "Email inválido!")
        String email,
        TipoFornecedorEnum tipoFornecedor,

        LocalDateTime atualizadoEm
) {
}
