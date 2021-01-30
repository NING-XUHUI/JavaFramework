package com.xatu.dao;


import com.xatu.domain.Sale;

/**
 * @author ningxuhui
 */
public interface SaleDao {
    /**
     * 添加销售记录
     * @param sale 销售记录对象
     * @return 影响数据库的行数
     */
    int insertSale(Sale sale);
}
