package top.nanguomm.nanguomall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-19 22:32:52
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

