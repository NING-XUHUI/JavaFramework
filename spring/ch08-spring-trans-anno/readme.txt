做事务的环境项目

实现步骤：
1 新建maven项目
2 加入maven的依赖
    1 spring
    2 mybatis
    3 mysql
    4 spring事务
    5 mybatis和spring集成依赖
3 创建实体类
    Sale，Goods
4 创建dao接口和mapper文件
    SaleDao GoodsDao
    SaleDao.xml GoodsDao.xml
5 创建mybatis主配置文件
6 创建Service接口和实现类，接口是Dao
7 创建spring的配置文件：声明mybatis的对象交给spring创建
    1 数据源
    2 SqlSessionFactory
    3 Dao对象
    4 声明自定义的service
8 创建测试类，获取Service对象，通过service调用dao完成数据库访问

使用@Transactional步骤
1 声明事务管理器对象
 <bean id="xx" class="DataSourceTransactionManager">

2 开始事务注解驱动，告诉spring框架，我要使用注解的方式管理事务
    spring开启aop机制，创建@Transactional所在的类代理对象，给方法加入事务的功能
    spring给业务加入事务
        在你的业务方法执行之前，先开启事务，在业务方法之后提交或者回滚，使用aop环绕通知

        @Around()
        Object myAround(){
            开启事务，spring开启
            try {
                buy(1001,10);
                spring的事务管理.commit()；
            } catch(Exception e) {
                spring的事务管理.rollback()；
            }
        }
3 在方法的上面加入@Transactional