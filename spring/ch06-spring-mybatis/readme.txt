spring和mybatis集成

步骤：
1 新建maven项目
2 加入maven的依赖
    1 spring
    2 mybatis
    3 mysql
    4 spring事务
    5 mybatis和spring集成依赖
3 创建实体类
4 创建dao接口和mapper文件
5 创建mybatis主配置文件
6 创建Service接口和实现类，接口是Dao
7 创建spring的配置文件：声明mybatis的对象交给spring创建
    1 数据源
    2 SqlSessionFactory
    3 Dao对象
    4 声明自定义的service
8 创建测试类，获取Service对象，通过service调用dao完成数据库访问