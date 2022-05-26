package com.category.module.categoryDetail;

import java.util.List;

public interface CategoryDetailService {
	public List<CategoryDetail> getListCategoryDetail(int categoryId);
	public CategoryDetail getCategoryDetail(int detailId);
}
