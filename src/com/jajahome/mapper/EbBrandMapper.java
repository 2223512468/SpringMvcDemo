package com.jajahome.mapper;

import com.jajahome.po.EbBrand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EbBrandMapper {

    public void insert(EbBrand brand);

    public EbBrand getBrandById(Long id);

    public void update(EbBrand brand);

    public void delete(Long id);

    public List<EbBrand> selectBrand();

}
