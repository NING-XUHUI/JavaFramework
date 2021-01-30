package com.xatu.dao;

import com.xatu.domain.Goods;

/**
 * @author ningxuhui
 */
public interface GoodsDao {
    /**
     * 更新库存
     *
     * @param goods goods表示本次用户购买的商品信息，id，购买数量
     * @return 影响数据库的行数
     */
    int updateGoods(Goods goods);

    /**
     * 查询商品的信息
     *
     * @param id 商品的id号
     * @return 查询到的商品对象
     */
    Goods selectGoods(Integer id);
}
