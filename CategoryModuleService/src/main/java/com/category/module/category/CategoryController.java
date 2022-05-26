package com.category.module.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllCategories() {
		List<Category> categories;
		try {
			categories = categoryService.getListCategory();
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		return ResponseEntity.ok(categories);
	}
}
