package cn.itcast.dao;

import java.util.List;
import cn.itcast.domain.Items;


public interface ProductDao {

    List<Items> findAllProduct();

    Items findProductById(Integer id);
}
