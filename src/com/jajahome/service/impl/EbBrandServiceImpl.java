package com.jajahome.service.impl;

import com.jajahome.mapper.EbBrandMapper;
import com.jajahome.po.EbBrand;
import com.jajahome.service.EbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbBrandServiceImpl implements EbBrandService {

    @Autowired
    private EbBrandMapper ebBrandMapper;

    @Override
    public void saveBrand(EbBrand brand) {
        ebBrandMapper.insert(brand);
    }

    @Override
    public EbBrand getBrandById(Long id) {
        return ebBrandMapper.getBrandById(id);
    }

    @Override
    public void update(EbBrand brand) {
        ebBrandMapper.update(brand);
    }

    @Override
    public void delete(Long id) {
        ebBrandMapper.delete(id);
    }

    @Override
    public List<EbBrand> selectBrand() {
        return ebBrandMapper.selectBrand();
    }

}
