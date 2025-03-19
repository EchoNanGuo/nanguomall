package top.nanguomm.nanguomall.coupon.dao;

import top.nanguomm.nanguomall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-19 22:12:17
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
