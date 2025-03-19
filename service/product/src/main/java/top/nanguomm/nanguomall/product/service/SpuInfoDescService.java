package top.nanguomm.nanguomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.nanguomm.common.utils.PageUtils;
import top.nanguomm.nanguomall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-19 22:14:21
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

