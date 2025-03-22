package top.nanguomm.nanguomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.nanguomm.nanguomall.common.utils.PageUtils;
import top.nanguomm.nanguomall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author nanguo
 * @email zhuyuqinss@gmail.com
 * @date 2025-03-19 22:20:48
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

