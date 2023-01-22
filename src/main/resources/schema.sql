-- Если в корне пути поиска классов приложения имеется файл с име-
-- нем schema.sql, то его содержимое будет интерпретироваться как код
-- на языке SQL и выполняться в базе данных при запуске приложения.
-- Поэтому сохраните в файле с именем schema.sql в папке src/main/resources.


create table if not exists Taco (
                                    id identity,
                                    name varchar(50) not null,
                                    taco_order bigint not null,
                                    taco_order_key bigint not null,
                                    created_at timestamp not null
);

-- Тип identity, то есть база данных автоматически определяет его значение
create table if not exists Taco_Order (
                                          id identity,
                                          delivery_Name varchar(50) not null,
                                          delivery_Street varchar(50) not null,
                                          delivery_City varchar(50) not null,
                                          delivery_State varchar(2) not null,
                                          delivery_Zip varchar(10) not null,
                                          cc_number varchar(16) not null,
                                          cc_expiration varchar(5) not null,
                                          cc_cvv varchar(3) not null,
                                          placed_at timestamp not null
);
alter table Taco           add foreign key (taco_order) references Taco_Order(id);


create table if not exists Ingredient_Ref (
                                              ingredient varchar(4) not null,
                                              taco bigint not null,
                                              taco_key bigint not null,
                                              primary key (ingredient)
);

create table if not exists Ingredient (
                                          id varchar(4) not null,
                                          name varchar(25) not null,
                                          type varchar(10) not null,
                                          primary key (id)
);
alter table Ingredient_Ref add foreign key (ingredient) references Ingredient(id);
