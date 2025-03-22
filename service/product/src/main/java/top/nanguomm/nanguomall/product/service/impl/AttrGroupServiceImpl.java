package top.nanguomm.nanguomall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.common.utils.Query;

import top.nanguomm.nanguomall.product.dao.AttrGroupDao;
import top.nanguomm.nanguomall.product.entity.AttrGroupEntity;
import top.nanguomm.nanguomall.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}