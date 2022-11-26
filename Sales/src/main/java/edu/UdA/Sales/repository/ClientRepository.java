package edu.UdA.Sales.repository;

import edu.UdA.Sales.model.Client;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ClientRepository extends GenericRepository<Client, Integer>{
}
