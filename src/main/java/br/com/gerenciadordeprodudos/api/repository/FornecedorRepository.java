package br.com.gerenciadordeprodudos.api.repository;

import br.com.gerenciadordeprodudos.api.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodudos.api.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodudos.api.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
