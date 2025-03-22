package top.nanguomm.nanguomall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-19 22:32:51
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

