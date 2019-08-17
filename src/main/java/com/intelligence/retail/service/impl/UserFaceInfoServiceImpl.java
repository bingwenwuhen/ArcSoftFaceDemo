package com.intelligence.retail.service.impl;

import com.intelligence.retail.domain.UserFaceInfo;
import com.intelligence.retail.mapper.MybatisUserFaceInfoMapper;
import com.intelligence.retail.service.UserFaceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserFaceInfoServiceImpl implements UserFaceInfoService {


    @Autowired
    private MybatisUserFaceInfoMapper userFaceInfoMapper;

    @Override
    public void insertSelective(UserFaceInfo userFaceInfo) {
        userFaceInfoMapper.insertUserFaceInfo(userFaceInfo);
    }
}
