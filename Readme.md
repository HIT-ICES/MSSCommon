服务集合实现过程中使用到的一些类型

* api
  * EndPoint: 表示 IP Port
* device
  * DeviceInfo: 设备的基础信息，其它类型的设备应该继承该类
* sensor
  * SensorInfo: 传感器设备的基础信息
* MResponse: 通用参数

如何使用：
1. 克隆/更新代码
2. 执行 mvn install (确保使用 java8 版本)
3. 自己的项目中添加如下依赖：（如果出现版本问题，就删掉本地的 msscommon 包，重新 maven 下载）
```xml
<project>
    <dependencies>
        <dependency>
            <groupId>com.hitices</groupId>
            <artifactId>msscommon</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
    
    <repositories>
        <repository>
          <id>maven-group</id>
          <url>http://192.168.1.102:8081/repository/maven-public/</url>
        </repository>
    </repositories>
</project>
```

如何更新

1. 你的 maven 全局配置文件 .m2/settings.xml 中 <servers></servers> 添加：
```xml
<server>
  <id>nexus-releases</id>
  <username>deployment</username>
  <password>deployment</password>
</server>

<server>
  <id>nexus-snapshots</id>
  <username>deployment</username>
  <password>deployment</password>
</server>
```
2. msscommon 项目执行 deploy 即可