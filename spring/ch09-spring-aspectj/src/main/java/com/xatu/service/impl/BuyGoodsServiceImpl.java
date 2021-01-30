package com.xatu.service.impl;

import com.xatu.dao.GoodsDao;
import com.xatu.dao.SaleDao;
import com.xatu.domain.Goods;
import com.xatu.domain.Sale;
import com.xatu.excep.NotEnoughException;
import com.xatu.service.BuyGoodsService;

/**
 * @author ningxuhui
 */

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("=============buy方法的开始============");
        // 记录销售的信息，想sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        // 更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            // 商品不存在
            throw new NullPointerException("编号是：" + goodsId + "商品不存在");
        } else if (goods.getAmount() < nums) {
            throw new NotEnoughException("编号是：" + goodsId + "商品库存不足");
        }
        // 修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("=============buy方法的结束============");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
