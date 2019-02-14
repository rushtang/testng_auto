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
5、testng相关:通过@DataProvider实现参数驱动,通过相关注解实现 Test Fixture



复用相关:

分析接口类型:增(请求参数多、断言数据库)、删(断言数据库)、查(jsonschme断言)、改(断言数据库)



### 快速使用
