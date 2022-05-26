package com.category.module.categoryDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDetailRepository extends JpaRepository<CategoryDetail, Integer>{
	public List<CategoryDetail> findByCategoryId(int categoryId);
	public CategoryDetail findByDetailId(int detailId);
}
