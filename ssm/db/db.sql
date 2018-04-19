create database ssm;

use ssm;

create table user(
	id varchar(32) not null,
	user_name varchar(32) not null,
	password varchar(64) not null,
	pwd_key char(6) not null,
	mobile char(11) not null,
	create_time datetime null,
	unique key(user_name),
	primary key(id)
);


create table department(
	dept_id int not null,
	dept_name varchar(32) not null,
	primary key(dept_id)
);

create table employee(
	emp_id int not null auto_increment,
	emp_name varchar(32) not null,
	gender varchar(16) not null,
	email varchar(100) null,
	salary decimal(10, 2) default 0 not null,
	job_title varchar(50) null,
	dept_id int not null,
	primary key(emp_id),
	constraint emp_fk foreign key(dept_id) references department(dept_id)
);


INSERT INTO `department` VALUES ('1000', '董事局');
INSERT INTO `department` VALUES ('1001', '产品部');
INSERT INTO `department` VALUES ('1002', '财务部');
INSERT INTO `department` VALUES ('1003', '技术部');
INSERT INTO `department` VALUES ('1004', '行政部');
INSERT INTO `department` VALUES ('1005', '销售部');
INSERT INTO `department` VALUES ('1006', '客服部');
INSERT INTO `department` VALUES ('1007', '管理层');

INSERT INTO `employee` VALUES ('1', '刘青云', '男', 'gtl@studymysql.com', '20000.00', '总经理', '1000');
INSERT INTO `employee` VALUES ('2', '陈木胜', '男', 'cms@studymysql.com', '12000.00', '经理', '1000');
INSERT INTO `employee` VALUES ('3', '彭于晏', '男', 'pyy@studymysql.com', '12000.00', '经理', '1000');
INSERT INTO `employee` VALUES ('4', '吴京', '男', 'wj@studymysql.com', '12000.00', '经理', '1000');
INSERT INTO `employee` VALUES ('5', '袁泉', '女', 'yq@studymysql.com', '12000.00', '经理', '1000');
INSERT INTO `employee` VALUES ('6', '江疏影', '女', 'jsy@studymysql.com', '8000.00', '主管', '1000');
INSERT INTO `employee` VALUES ('7', '廖启智', '男', 'lqz@studymysql.com', '8000.00', '主管', '1000');
INSERT INTO `employee` VALUES ('8', '释彦能', '男', 'syn@studymysql.com', '2000.00', '业务员', '1000');
INSERT INTO `employee` VALUES ('9', '姜皓文', '男', 'jhw@studymysql.com', '2000.00', '业务员', '1000');
INSERT INTO `employee` VALUES ('10', '吴廷烨', '男', 'wth@studymysql.com', '2000.00', '业务员', '1000');
INSERT INTO `employee` VALUES ('11', '洪天照', '男', 'htz@studymysql.com', '2000.00', '业务员', '1000');
INSERT INTO `employee` VALUES ('12', '麦兆辉', '男', 'mzh@studymysql.com', '18000.00', '总经理', '1001');
INSERT INTO `employee` VALUES ('13', '古天乐', '男', 'gtl@studymysql.com', '16000.00', '经理', '1001');
INSERT INTO `employee` VALUES ('14', '吴彦祖', '男', 'wyz@studymysql.com', '17000.00', '经理', '1001');
INSERT INTO `employee` VALUES ('15', '曾江', '男', 'zj@studymysql.com', '11800.00', '主管', '1001');
INSERT INTO `employee` VALUES ('16', '叶璇', '女', 'yx@studymysql.com', '11800.00', '主管', '1001');
INSERT INTO `employee` VALUES ('17', '黄奕', '女', 'hy@studymysql.com', '11800.00', '主管', '1001');
INSERT INTO `employee` VALUES ('18', '陈木胜', '男', 'cl@studymysql.com', '26000.00', '总经理', '1002');
INSERT INTO `employee` VALUES ('19', '谢霆锋', '男', 'xtf@studymysql.com', '18000.00', '经理', '1002');
INSERT INTO `employee` VALUES ('20', '成龙', '男', 'cl@studymysql.com', '18000.00', '经理', '1002');
INSERT INTO `employee` VALUES ('21', '杨采妮', '女', 'ycn@studymysql.com', '9000.00', '主管', '1002');
INSERT INTO `employee` VALUES ('22', '蔡卓妍', '女', 'czy@studymysql.com', '5000.00', '主管', '1002');
INSERT INTO `employee` VALUES ('23', '安志杰', '男', 'azj@studymysql.com', '3000.00', null, '1002');
INSERT INTO `employee` VALUES ('24', '尹子维', '女', 'yzw@studymysql.com', '3000.00', null, '1002');
INSERT INTO `employee` VALUES ('25', '王杰', '男', 'wj@studymysql.com', '4000.00', '业务员', '1002');
INSERT INTO `employee` VALUES ('26', '郭富城', '男', 'master@mysql.com', '21000.00', '总经理', '1003');
INSERT INTO `employee` VALUES ('27', '梁家辉', '男', '', '18000.00', '经理', '1003');
INSERT INTO `employee` VALUES ('28', '李治廷', '男', '', '18000.00', '经理', '1003');
INSERT INTO `employee` VALUES ('29', '彭于晏', '男', '', '18000.00', '经理', '1003');
INSERT INTO `employee` VALUES ('30', '杨采妮', '女', '', '14000.00', '主管', '1003');
INSERT INTO `employee` VALUES ('31', '马伊琍', '女', '', '12000.00', '主管', '1003');
INSERT INTO `employee` VALUES ('32', '林家栋', '男', '', '17000.00', '主管', '1003');
INSERT INTO `employee` VALUES ('33', '安志杰', '男', '', '3000.00', null, '1003');
INSERT INTO `employee` VALUES ('34', '钱嘉乐', '男', '', '3000.00', null, '1003');
INSERT INTO `employee` VALUES ('35', '尹子维', '女', '', '3000.00', null, '1003');
INSERT INTO `employee` VALUES ('36', '王敏德', '女', '', '3000.00', null, '1003');
INSERT INTO `employee` VALUES ('37', '黄芝琪', '女', '', '4000.00', '销售', '1003');
INSERT INTO `employee` VALUES ('38', '郑欣宜', '女', '', '3000.00', null, '1003');
INSERT INTO `employee` VALUES ('39', '文峰', '男', '', '3000.00', '销售', '1003');
INSERT INTO `employee` VALUES ('40', 'Andy Liu', '男', 'andy.liu@studymysql.com', '5000.00', '销售', '1003');
INSERT INTO `employee` VALUES ('41', '何华超', '男', '', '5000.00', null, '1003');
INSERT INTO `employee` VALUES ('42', '洪金宝', '男', '', '6000.00', null, '1004');
INSERT INTO `employee` VALUES ('43', '洪金宝', '男', '', '27000.00', '总经理', '1004');
INSERT INTO `employee` VALUES ('44', '刘德华', '男', '', '2000.00', '经理', '1004');
INSERT INTO `employee` VALUES ('45', '徐克', '男', '1122', '16000.00', '经理', '1004');
INSERT INTO `employee` VALUES ('46', '朱雨辰', '女', '', '18000.00', '主管', '1004');
INSERT INTO `employee` VALUES ('47', '李勤勤', '女', '', '8000.00', '主管', '1004');
INSERT INTO `employee` VALUES ('48', '冯嘉怡', '女', '', '3000.00', null, '1004');
INSERT INTO `employee` VALUES ('49', '陈沛妍', '男', '', '3000.00', null, '1004');
INSERT INTO `employee` VALUES ('50', '胡军', '男', '', '5000.00', '业务员', '1004');
INSERT INTO `employee` VALUES ('51', '冯绍峰', '男', '', '2000.00', '实习生', '1004');
INSERT INTO `employee` VALUES ('52', '彭于晏', '男', '', '2000.00', '实习生', '1004');
INSERT INTO `employee` VALUES ('53', '宋佳', '女', '', '2000.00', '实习生', '1004');
INSERT INTO `employee` VALUES ('54', '元彪', '男', '', '2000.00', '实习生', '1004');
INSERT INTO `employee` VALUES ('55', '张家辉', '男', 'zjh@studymysql.com', '5000.00', '业务', '1000');
INSERT INTO `employee` VALUES ('56', '张小辉', '男', 'zxh@studymysql.com', '9000.00', '经理', '1000');
INSERT INTO `employee` VALUES ('57', '张学有辉', '男', 'zxyh@studymysql.com', '8000.00', '主管', '1002');