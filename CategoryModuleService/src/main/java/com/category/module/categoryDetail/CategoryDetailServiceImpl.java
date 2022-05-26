package com.category.module.categoryDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryDetailServiceImpl implements CategoryDetailService {

	@Autowired 
	private CategoryDetailRepository categoryDetailRepository; 
	
	@Override
	public List<CategoryDetail> getListCategoryDetail(int categoryId) {
		return categoryDetailRepository.findByCategoryId(categoryId);
	}

	@Override
	public CategoryDetail getCategoryDetail(int detailId) {
		return categoryDetailRepository.findByDetailId(detailId);
	}

}
