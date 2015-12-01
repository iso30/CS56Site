
# --- !Ups

create table listing (
  id                        varchar(255) not null,
  title                     varchar(255),
  content                   varchar(1000),
  personal                  varchar(255),
  subject                   varchar(255),
  time_stamp                varchar(255),
  constraint pk_listing primary key (id))
;

create sequence listing_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists listing;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists listing_seq;

