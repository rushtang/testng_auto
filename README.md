### 要点:
**框架**: testng  
**断言**: jsonschme(json-schema-validator)、AssertJ  
**报告**: allure  
**常用库**: jackson、mybatis、mybatis-generator-maven-plugin  


### 已解决痛点:
1、基于TCP的自定义rpc接口调用封装  
2、通过mybatis封装出mapper,使用orm方便数据操作  
3、使用Assert进行流式断言  
4、通过jsonschme断言返回的json  
5、testng相关:通过@DataProvider实现参数驱动,通过相关注解实现 Test Fixture(对用例中重复代码的复用)  

**复用相关**:  
接口封装复用:关键字驱动  
调用流程复用:行为驱动  

### 快速使用
0、初始化  
根据pom.xml安装依赖  
1、model自动生成  
完善配置mybatis相关配置  
通过mybatis-generator-maven-plugin生成mybatis相关mappers的xml、pojo、mapper代码  
maven中运行: ```mybatis-generator:generate```  

2、完善配置和封装代码  
完善db相关配置、rpc相关配置;  
完善BaseTest类(被用例类继承)中封装数据库mapper和Example  

3、根据demo写用例  
按照testng规范编写用例  

### 分析接口类型:  
1、调用数据存入、删除、修改接口时:  
请求参数多时使用工具生成的实体类(pojo)再转换jsonnode格式；  
请求参数少时直接构造jsonnode对象； 
断言数据库的对应变更  

2、调用数据查询接口时:  
返回参数多时使用jsonschme文件断言  
返回参数少时直接解析断言  


### 待完善
1、allure报告集成和日志记录  
2、流程和复用规范



