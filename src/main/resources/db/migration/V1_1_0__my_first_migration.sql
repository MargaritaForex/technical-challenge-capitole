create table PRICES (
    Id            int       not null,
    brand_id      int       not null,
    start_date    date      not null,
    price_list    int       not null,
    product_id    int       not null,
    priority      int       not null,
    price         double    not null,
    curr          varchar(50)   not null
);