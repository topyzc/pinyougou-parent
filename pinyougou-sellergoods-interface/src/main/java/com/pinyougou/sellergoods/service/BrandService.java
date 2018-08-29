package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	//查询所有的品牌
	public List<TbBrand> findAll();
	
	//分页查询品牌 pageNum 当前页面  pageSize   每页记录数
	public PageResult findPage(int pageNum,int pageSize);
	
	//增加品牌
	public void add(TbBrand brand);
	
	//根据id查询品牌
	public TbBrand findById(Long id);
	
	//修改品牌
	public void update(TbBrand brand);
	
	//品牌批量删除
	public void delete(Long[] ids);
	
	//条件查询带分页
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
	
}
