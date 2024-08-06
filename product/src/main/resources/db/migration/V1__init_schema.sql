CREATE TABLE products (
    id int8 not null primary key,
    account varchar not null,
    balance decimal not null,
    type varchar not null,
    user_id int8 not null references users(id)
);

COMMENT ON TABLE products IS 'Таблица продуктов';
COMMENT ON COLUMN products.account IS 'Номер продукта';
COMMENT ON COLUMN products.balance IS 'Баланс продукта';
COMMENT ON COLUMN products.type IS 'Тип продукта: счёт, карта';
COMMENT ON COLUMN products.user_id IS 'Идентификатор пользователя';

CREATE TABLE users (
    id int8 not null primary key,
    username varchar not null
);

COMMENT ON TABLE users IS 'Таблица пользователей';
COMMENT ON COLUMN users.id IS 'Идентификатор пользователя';
COMMENT ON COLUMN users.username IS 'Имя пользователя';