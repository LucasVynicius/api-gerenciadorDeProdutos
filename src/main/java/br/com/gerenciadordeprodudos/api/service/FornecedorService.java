package br.com.gerenciadordeprodudos.api.service;

import br.com.gerenciadordeprodudos.api.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodudos.api.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodudos.api.model.Fornecedor;

import java.time.LocalDateTime;
import java.util.List;

public interface FornecedorService {

    FornecedorCriadoResponse criarFornecedor(CriarFornecedorRequest criarFornecedorRequest);

    Fornecedor buscarFornecedorPeloId(Long id);

    List<Fornecedor> buscarTodosFornecedores();

    Fornecedor atualizarFornecedor(Long id, CriarFornecedorRequest criarFornecedorRequest, LocalDateTime atualizadoEm);

    void deletarFornecedorPeloId(Long id);

}
