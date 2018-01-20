package com.jajahome.test;


import com.jajahome.mapper.EbBrandMapper;
import com.jajahome.mapper.ItemsMapperCustom;
import com.jajahome.po.EbBrand;
import com.jajahome.po.ItemsCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MapperTest {

    private ApplicationContext applicationContext;


    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
    }

    @Test
    public void test() throws Exception {

        ItemsMapperCustom itemsMapper = (ItemsMapperCustom) applicationContext.getBean("itemsMapperCustom");
        List<ItemsCustom> customList = itemsMapper.findItemsList(null);
        System.out.print(Arrays.asList(customList));
    }

    @Test
    public void test1() {

        EbBrandMapper mapper = (EbBrandMapper) applicationContext.getBean("ebBrandMapper");
        EbBrand brand = new EbBrand();
        brand.setBrandId(4L);
        brand.setBrandName("黄焖鸡");
        brand.setBrandDesc("很好吃");
        brand.setImgs("www.baidu.com");
        brand.setBrandSort(1);
        brand.setWebsite("www.baidu.com");
        mapper.insert(brand);
    }


}
