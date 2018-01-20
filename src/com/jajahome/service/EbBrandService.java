package com.jajahome.service;

import com.jajahome.po.EbBrand;

import java.util.List;

public interface EbBrandService {

    public void saveBrand(EbBrand brand);

    public EbBrand getBrandById(Long id);

    public void update(EbBrand brand);

    public void delete(Long id);

    public List<EbBrand> selectBrand();
}
