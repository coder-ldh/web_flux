package com.ldh.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Author: ldh Created on 2018/8/9
 */
public class CodeGeneration {

  /**
   *
   * @Title: main
   * @Description: 生成
   * @param args
   */
  public static void main(String[] args) {
    AutoGenerator mpg = new AutoGenerator();

    // 全局配置
    GlobalConfig gc = new GlobalConfig();
    gc.setOutputDir("E:\\root");
    gc.setFileOverride(true);
    // 不需要ActiveRecord特性的请改为false
    gc.setActiveRecord(false);
    // XML 二级缓存
    gc.setEnableCache(false);
    // XML ResultMap
    gc.setBaseResultMap(true);
    // XML columList
    gc.setBaseColumnList(false);
    // 作者
    gc.setAuthor("ldh");

    // 自定义文件命名，注意 %s 会自动填充表实体属性！
    gc.setControllerName("%sController");
    gc.setServiceName("%sService");
    gc.setServiceImplName("%sServiceImpl");
    gc.setMapperName("%sMapper");
    gc.setXmlName("%sMapper");
    mpg.setGlobalConfig(gc);

    // 数据源配置
    DataSourceConfig dsc = new DataSourceConfig();
    dsc.setDbType(DbType.MYSQL);
    dsc.setDriverName("com.mysql.jdbc.Driver");
    dsc.setUsername("root");
    dsc.setPassword("root");
    dsc.setUrl("jdbc:mysql://127.0.0.1:3306/flux");
    mpg.setDataSource(dsc);

    // 策略配置
    StrategyConfig strategy = new StrategyConfig();
    // 此处可以修改为您的表前缀
    // 表名生成策略
    strategy.setNaming(NamingStrategy.underline_to_camel);
    // 需要生成的表
    strategy.setInclude(new String[] { "user","login_info" });

    strategy.setSuperServiceClass(null);
    strategy.setSuperServiceImplClass(null);
    strategy.setSuperMapperClass(null);

    mpg.setStrategy(strategy);

    // 包配置
    PackageConfig pc = new PackageConfig();
    pc.setParent("com.ldh");
    pc.setController("action");
    pc.setService("service");
    pc.setServiceImpl("serviceImpl");
    pc.setMapper("mapper");
    pc.setEntity("entity");
    pc.setXml("xml");
    mpg.setPackageInfo(pc);

    // 执行生成
    mpg.execute();
  }
}