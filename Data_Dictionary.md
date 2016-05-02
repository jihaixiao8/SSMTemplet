# SSMTemplet
[我的博客](http://blog.csdn.net/shasiqq "悬停显示") 
# 目前版本还没做成数据字典后期准备做成数据字典
##数据库     mysql 

###用户表 mo_user <br>

|字段|类型|含义|可否为空|主键|
| ----- |:-------------:|:-------------:|:-------------:|:-------------:|
|id|bigint|id|否|是|
|username|varchar|用户名|可以|否|
|password|varchar|密码|可以|否|
|mobile|varchar|电话|可以|否|
|type|bit|类型|可以|否|
|status|bit|状态|可以|否|
|create_time|datetime|创建时间|可以|否|
|modified_time|datetime|修改时间|可以|否|


###英雄表   mo_hero

|字段|类型|含义|可否为空|主键|
| ----- |:-------------:|:-------------:|:-------------:|:-------------:|
|id|bigint|id|否|是|
|heroName|varchar|英雄名字|可以|否|
|heroSkills|varchar|英雄技能|可以|否|
|skillPlusPoint|varchar|技能加点|可以|否|
|heroOutOfThePack|varchar|英雄出装|可以|否|
|heroLegendStory|varchar|英雄故事|可以|否|
|heroOrientation|varchar|英雄位置|可以|否|
|heroAttribute|varchar|英雄属性|可以|否|
