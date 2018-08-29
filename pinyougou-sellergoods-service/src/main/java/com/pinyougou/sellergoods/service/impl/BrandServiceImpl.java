package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.pojo.TbBrandExample.Criteria;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	//查询所有品牌
	@Override
	public List<TbBrand> findAll() {

		return brandMapper.selectByExample(null);
	}
	
	
   //对查询所有品牌并分页
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		
		PageHelper.startPage(pageNum,pageSize);
		
		Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);
		
		return new PageResult(page.getTotal(), page.getResult());
	}

	//增加品牌
	@Override
	public void add(TbBrand brand) {
		
		brandMapper.insert(brand);
	}


	//根据id查询品牌
	@Override
	public TbBrand findById(Long id) {
		
		return brandMapper.selectByPrimaryKey(id);
	}


	//修改品牌
	@Override
	public void update(TbBrand brand) {
		
		brandMapper.updateByPrimaryKey(brand);
	}


	//批量删除品牌
	@Override
	public void delete(Long[] ids) {
		
		for(Long id:ids) {
			brandMapper.deleteByPrimaryKey(id);
		}
		
	}


	//条件查询带分页
	@Override
	public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
		
        TbBrandExample example=new TbBrandExample();
        Criteria criteria = example.createCriteria();
        if(brand!=null) {
        	if(brand.getName()!=null && brand.getName().length()>0) {
        		
        		criteria.andNameLike("%"+brand.getName()+"%");
        	}
        	if(brand.getFirstChar()!=null && brand.getFirstChar().length()>0) {
        		criteria.andFirstCharLike("%"+brand.getFirstChar()+"%");
        	}
        }
		Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(example);
		
		return new PageResult(page.getTotal(), page.getResult());
	}

}
