package top.nanguomm.nanguomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-21 21:28:38
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

