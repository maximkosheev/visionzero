create table blocks (
  id int4 not null,
  name varchar(500),
  primary key (id)
);

create table categories (
  id int4 not null,
  name varchar(500),
  block_id int4,
  primary key (id)
);

create table answers (
  id  bigserial not null,
  value int4,
  question_id int4,
  user_id int8,
  primary key (id)
);

create table questions (
  id int4 not null,
  name varchar(500),
  category_id int4,
  primary key (id)
);

create table users (
  id int8 not null,
  login varchar(255),
  name varchar(255),
  password varchar(255),
  primary key (id)
);

alter table answers add constraint answers_questions_fk foreign key (question_id) references questions;

alter table answers add constraint answers_users_fk foreign key (user_id) references users;

alter table categories add constraint categories_block_fk foreign key (block_id) references blocks;

alter table questions add constraint questions_categories_fk foreign key (category_id) references categories;

