# 使用说明

## 初始配置

修改gsc-code-generator/src/main/resources/application.properties中的数据库配置：

* spring.datasource.url: 数据库链接地址
* spring.datasource.username: 用户名
* spring.datasource.password: 密码
* spring.datasource.type: datasource类型
* spring.datasource.driver-class-name: 驱动名称

## 编译并安装到本地maven库中

~~~bash
mvn install
~~~

## 启动生成器

~~~bash
cd gsc-code-generator
mvn spring-boot:run
~~~


## 使用生成器生成代码

### 初始化

1. 访问http://localhost:8080 访问管理页面
2. 在菜单中选择 环境初始化->出事配置，对每个配置项分别进行设置，包括工程名称、工程位置、基础包名等等
3. 在菜单中选择 环境初始化->工程初始化, 对工程进行初始化，生成初始化的工程文件

### 加载已有的库表

选择 代码生成->加载最新物理库表， 即可将当前库表中所有表加载到数据库中

### 创建表
首页中，选择添加表即可完成添加。

### 生成代码

* 单个映射表生成： 首页选择要生成表中，点击生成代码即可生成
* 所有表全部生成：首页选择代码生成->生成所有代码即可完成所有代码的生成