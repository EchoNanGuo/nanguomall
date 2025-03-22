package top.nanguomm.nanguomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-21 21:28:38
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

