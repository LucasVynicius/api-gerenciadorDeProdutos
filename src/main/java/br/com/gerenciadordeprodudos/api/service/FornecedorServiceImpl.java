package br.com.gerenciadordeprodudos.api.service;

import br.com.gerenciadordeprodudos.api.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodudos.api.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodudos.api.model.Fornecedor;
import br.com.gerenciadordeprodudos.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FornecedorServiceImpl implements FornecedorService{

    @Autowired
    FornecedorRepository fornecedorRepository;


    @Override
    public FornecedorCriadoResponse criarFornecedor(CriarFornecedorRequest criarFornecedorRequest) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome(criarFornecedorRequest.nome());
        fornecedor.setCnpj(criarFornecedorRequest.cnpj());
        fornecedor.setEmail(criarFornecedorRequest.email());
        fornecedor.setTipoFornecedor(criarFornecedorRequest.tipoFornecedor());
        fornecedor.setCriadoEm(LocalDateTime.now());

        Fornecedor fornecedorCriado = fornecedorRepository.save(fornecedor);

        return new FornecedorCriadoResponse(
                "Fornecedor criado com sucesso!",
                fornecedorCriado.getId()
        );
    }

    @Override
    public Fornecedor buscarFornecedorPeloId(Long id) {
        return fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Fornecedor não encontrado"));

    }

    @Override
    public List<Fornecedor> buscarTodosFornecedores() {
        return fornecedorRepository.findAll();
    }

    @Override
    public Fornecedor atualizarFornecedor(Long id, CriarFornecedorRequest criarFornecedorRequest, LocalDateTime atualizadoEm) {
        Fornecedor fornecedorExistente = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Fornecedor não encontrado"));
        fornecedorExistente.setNome(criarFornecedorRequest.nome());
        fornecedorExistente.setCnpj(criarFornecedorRequest.cnpj());
        fornecedorExistente.setEmail(criarFornecedorRequest.email());
        fornecedorExistente.setTipoFornecedor(criarFornecedorRequest.tipoFornecedor());
        fornecedorExistente.setAtualizadoEm(LocalDateTime.now());

        return fornecedorRepository.save(fornecedorExistente);
    }

    @Override
    public void deletarFornecedorPeloId(Long id) {
        Fornecedor fornecedorExistente = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Fornecedor não encontrado"));

        fornecedorRepository.delete(fornecedorExistente);
    }
}
