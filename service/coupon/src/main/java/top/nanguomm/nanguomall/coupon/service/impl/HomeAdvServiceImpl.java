package top.nanguomm.nanguomall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.common.utils.Query;

import top.nanguomm.nanguomall.coupon.dao.HomeAdvDao;
import top.nanguomm.nanguomall.coupon.entity.HomeAdvEntity;
import top.nanguomm.nanguomall.coupon.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvEntity> page = this.page(
                new Query<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}