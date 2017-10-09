package com.wenhao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenhao.form.ProductCategory;
import com.wenhao.mapper.ProductCategoryMapper;
import com.wenhao.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private ProductCategoryMapper productCategoryMapper;

	@Override
	public ProductCategory selectOne(Integer categoryid) {
		return (ProductCategory) productCategoryMapper.selectByPrimaryKey(categoryid);
	}

	@Override
	public List<ProductCategory> selectAll() {
		return productCategoryMapper.selectAll();
	}

	@Override
	public List<ProductCategory> selectByCategoryType(List<Integer> categoryTypeList) {
		return productCategoryMapper.selectByCategoryType(categoryTypeList);
	}

}
