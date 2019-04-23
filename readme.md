 团队即将接手一个古老的产品线维护，回想了十几年前作过的项目，写了一个Java Swing 和 WebService的例子

### 1\swing的参考来源：https://blog.csdn.net/gp3056/article/details/70226655
### 2\Webservice参考来源:https://blog.csdn.net/GoGleTech/article/details/78616121

## 步骤
### 1、启动webservice下的ServerMain
### 2、根据wsdl描述文件，用命令行生成客户端引用类:  wsimport -s . -p client.ejb http://localhost:456/runCal?wsdl
### 3、把生成的客户端引用类放入client.ejb 包中，启动ClientMain
