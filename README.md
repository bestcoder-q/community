## LWQの社区

## 资料
[Spring 文档](https://spring.io/guides)

[ES社区(参考)](https://elasticsearch.cn/explore)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
## 工具
[Git](https://git-scm.com/)

##脚本
```sql
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT '0',
  `name` varchar(50) DEFAULT '0',
  `token` char(36) DEFAULT '0',
  `gmt_create` bigint(20) DEFAULT '0',
  `gmt_modified` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```