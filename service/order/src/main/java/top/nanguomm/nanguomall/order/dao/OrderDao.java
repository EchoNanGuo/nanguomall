package top.nanguomm.nanguomall.order.dao;

import top.nanguomm.nanguomall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-19 22:32:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
