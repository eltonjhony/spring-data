package br.com.spring.data.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import com.google.common.base.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
	
	void delete(T deleted);
	List<T> findAll();
	Optional<T> findOne(ID id);
	T findById(ID id);
	T save(T persisted);

}
