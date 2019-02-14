package cn.com.flever.sys.ui.login;

import cn.com.flever.common.ui.BaseController;
import cn.com.flever.sys.service.mapper.SysUserMapper;
import cn.com.flever.sys.service.model.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys")
public class LoginController extends BaseController{

  private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

  @Autowired
  private SysUserMapper sysUserMapper;


  @Value("${spring.datasource.type}")
  private  String type;

  /**
   * @Cacheable 应用到读取数据的方法上，先从缓存中读取，如果没有再从DB获取数据，然后把数据添加到缓存中
   * unless 表示条件表达式成立的话不放入缓存
   * @param username
   * @return
   */
  @Cacheable(value="user", key="'user'")
  @RequestMapping("test")
  public SysUser test(String username){
    logger.error("######################打印了#######################");
    SysUser sysUser=sysUserMapper.selectByPrimaryKey(1L);
    return  sysUser;
  }

  @RequestMapping("/hello")
  public String sayHi()
  {
     return "hello sys";
  }

}
