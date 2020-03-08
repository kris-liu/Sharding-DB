CREATE DATABASE `test` CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
use test;

create table order_info_0 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_1 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_2 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_3 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_4 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_ext_0 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_1 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_2 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_3 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_4 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';




CREATE DATABASE `test1` CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
use test1;

create table order_info_5 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_6 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_7 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_8 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_info_9 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态',
   `remark` varchar(2048) NOT NULL DEFAULT '' COMMENT '备注',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

create table order_ext_5 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_6 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_7 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_8 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';

create table order_ext_9 (
   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `order_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '订单号',
   `ext_key` VARCHAR(64) NOT NULL DEFAULT '' COMMENT 'key',
   `ext_value` varchar(255) NOT NULL DEFAULT '' COMMENT 'value',
   PRIMARY KEY (`id`),
   UNIQUE KEY `uk_order_id` (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单扩展表';
