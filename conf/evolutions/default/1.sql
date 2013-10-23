# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table buy (
  id                        bigint not null,
  name                      varchar(255),
  value_of_buy              double,
  percentage_loan           integer,
  plots                     integer,
  person_id                 bigint,
  constraint pk_buy primary key (id))
;

create table person (
  id                        bigint not null,
  name                      varchar(255),
  cpf                       varchar(255),
  birth_date                timestamp,
  salary                    double,
  admission_date            timestamp,
  constraint pk_person primary key (id))
;

create sequence buy_seq;

create sequence person_seq;

alter table buy add constraint fk_buy_person_1 foreign key (person_id) references person (id) on delete restrict on update restrict;
create index ix_buy_person_1 on buy (person_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists buy;

drop table if exists person;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists buy_seq;

drop sequence if exists person_seq;

