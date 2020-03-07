-- 建表
DROP TABLE if exists employee;

CREATE TABLE if not exists employee
(
    id serial ,
    name  varchar(100) NOT NULL,
    gender  varchar(50) NOT NULL,
    age  varchar(10) NOT NULL,
    created_date timestamp without time zone DEFAULT now(),
    created_by  varchar(100) DEFAULT 'system',
    updated_date timestamp without time zone DEFAULT now(),
    update_by  varchar(100) DEFAULT 'system',
    PRIMARY KEY(id)
);

-- 注释
COMMENT ON TABLE employee IS '用户表';
COMMENT ON COLUMN employee.id IS '主键';
COMMENT ON COLUMN employee.name IS '姓名';
COMMENT ON COLUMN employee.gender IS '性别';
COMMENT ON COLUMN employee.age IS '年龄';
COMMENT ON COLUMN employee.created_date IS '创建时间';
COMMENT ON COLUMN employee.created_by IS '创建人';
COMMENT ON COLUMN employee.updated_date IS '更新时间';
COMMENT ON COLUMN employee.update_by IS '更新人';



-- 索引或唯一索引
drop index if exists idx_employee_name;
CREATE INDEX idx_employee_name ON employee (name);


-- 授权
GRANT ALL ON TABLE employee TO postgres;
