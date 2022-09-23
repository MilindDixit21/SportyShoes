package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PurchaseItem;

//@author Milind

@Repository
public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Integer>{

	List<PurchaseItem> findBypurchaseDate(String purchaseDate);
	List<PurchaseItem> findBypurchCategory(int purchCategory);
	
	
}
