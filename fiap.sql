drop table java_categoria;
 
create table java_categoria(
    id_categoria number,
    categoria VARCHAR2(50),
    CONSTRAINT pk_categoria primary key(id_categoria)
    );
    
create table java_despesa (
    id_despesa number,
    descricao varchar2(100),
    valor number (10, 2),
    data date,
    id_categoria number,
    primary key (id_despesa),
    FOREIGN key (id_categoria) references java_categoria(id_categoria)
        on delete cascade
);
    
    
insert into java_categoria values(1, 'moradia');
insert into java_categoria values(2, 'transporte');

insert into java_despesa values(1, 'supermercado', 150, TO_DATE('8-11-2025'),1);
    
select * from java_categoria;
select * from java_despesa;