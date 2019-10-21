package cn.itguiju.provider.mapper;

import cn.itguiju.springclound.pojo.Dept;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface DeptMapper extends Mapper<Dept>,SelectByIdListMapper<Dept,Long> {
}
