# pinyougou-parent
大型分布式电商系统   B2B2C
    B2B2C是一种电子商务类型的网络购物商业模式，B是BUSINESS的简称，C是CUSTOMER的简称，第一个B指的是商品或服务的供应商，第二个B指的是从事电子商务的企业，C则是表示消费者。
第一个BUSINESS，并不仅仅局限于品牌供应商、影视制作公司和图书出版商，任何的商品供应商或服务供应商都能可以成为第一个BUSINESS；第二B是B2B2C模式的电子商务企业，通过统一的经营管理对商品和服务、消费者终端同时进行整合，是广大供应商和消费者之间的桥梁，为供应商和消费者提供优质的服务，是互联网电子商务服务供应商。C表示消费者，在第二个B构建的统一电子商务平台购物的消费者；
B2B2C的来源于目前的B2B、B2C模式的演变和完善，把B2C和C2C完美地结合起来，通过B2B2C模式的电子商务企业构建自己的物流供应链系统，提供统一的服务。

1.SOA分布式架构
   
     Dubbo框架
         Dubbox 是一个分布式服务框架，其前身是阿里巴巴开源项目Dubbo ，被国内电商及互联网项目中使用，后期阿里巴巴停止了该项目的维护，当当网便在Dubbo基础上进行优化，并继续维护，为了与原有的Dubbo区分，故将其命名为Dubbox。

2.zookeeper环境搭建，在linux上的安装
      安装步骤：
        第一步：安装 jdk（此步省略，我给大家提供的镜像已经安装好JDK）
        第二步：把 zookeeper 的压缩包（资源\配套软件\dubbox\zookeeper-3.4.6.tar.gz）上传到 linux 系统。
        Alt+P 进入SFTP ，输入put d:\zookeeper-3.4.6.tar.gz 上传
        第三步：解压缩压缩包
        tar -zxvf zookeeper-3.4.6.tar.gz
        第四步：进入 zookeeper-3.4.6 目录，创建 data 文件夹。
        mkdir data
        第五步：进入conf目录 ，把 zoo_sample.cfg 改名为 zoo.cfg
        cd conf
        mv zoo_sample.cfg zoo.cfg
        第六步：打开zoo.cfg ,  修改 data 属性：dataDir=/root/zookeeper-3.4.6/data
        3.2.3 Zookeeper 服务启动
        进入bin目录，启动服务输入命令
         ./zkServer.sh start
        输出以下内容表示启动成功

        关闭服务输入命令
        ./zkServer.sh stop
        输出以下提示信息

        查看状态：
        ./zkServer.sh status
        如果启动状态，提示

        如果未启动状态，提示：
3.系统架构图
       
一，功能实现
   
    1.品牌的管理
  










