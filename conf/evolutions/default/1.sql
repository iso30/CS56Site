# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table listing (
  id                        varchar(255) not null,
  title                     varchar(255),
  content                   varchar(255),
  personal                  varchar(255),
  subject                   varchar(255),
  time_stamp                varchar(255),
  constraint pk_listing primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table listing;

SET FOREIGN_KEY_CHECKS=1;

