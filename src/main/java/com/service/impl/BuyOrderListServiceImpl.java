package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.BuyOrderListDao;
import com.entity.BuyOrderListEntity;
import com.service.BuyOrderListService;
import com.entity.view.BuyOrderListView;

/**
 * 购买订单详情 服务实现类
 * @author 
 * @since 2021-03-15
 */
@Service("buyOrderListService")
@Transactional
public class BuyOrderListServiceImpl extends ServiceImpl<BuyOrderListDao, BuyOrderListEntity> implements BuyOrderListService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BuyOrderListView> page =new Query<BuyOrderListView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
