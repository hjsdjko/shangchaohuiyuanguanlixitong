package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanEntity;
import java.util.Map;

/**
 * 会员信息 服务类
 * @author 
 * @since 2021-03-15
 */
public interface HuiyuanService extends IService<HuiyuanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}