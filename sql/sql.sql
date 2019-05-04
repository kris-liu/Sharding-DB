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
