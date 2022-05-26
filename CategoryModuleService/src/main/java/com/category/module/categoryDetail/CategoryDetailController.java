package com.category.module.categoryDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorydetail")
public class CategoryDetailController {

	@Autowired
	private CategoryDetailService categoryDetailService;
	
	@GetMapping(path = "/category/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllCategoryDetails(@PathVariable("categoryId") int categoryId) {
		List<CategoryDetail> categoryDetails;
		try {
			categoryDetails = categoryDetailService.getListCategoryDetail(categoryId);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		return ResponseEntity.ok(categoryDetails);
	}
	
	@GetMapping(path = "/{detailId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllCategoryDetailsByDetailId(@PathVariable("detailId") int detailId) {
		CategoryDetail categoryDetail;
		try {
			categoryDetail = categoryDetailService.getCategoryDetail(detailId);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		return ResponseEntity.ok(categoryDetail);
	}
}
