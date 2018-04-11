package cn.cc.dao;

import cn.cc.entity.DrSysGroupR;

import java.util.List;

public interface MessageDAO {

    /**
    * @Description: 获取组信息
    * @author CC
    * @date 18/4/11 下午5:36
    * @version V1.0
    */
    List<DrSysGroupR> getGroupList();
    
}
