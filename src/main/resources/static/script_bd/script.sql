CREATE DATABASE "TaskManager"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;



CREATE TABLE public.sprint(
	id integer,
	nome varchar NOT NULL,
	data_inicio timestamp with time zone NOT NULL,
	data_final timestamp with time zone,
	CONSTRAINT sprint_pk PRIMARY KEY (id)

);

CREATE TABLE public.cliente(
	id integer NOT NULL,
	nome varchar NOT NULL,
	CONSTRAINT cliente_pk PRIMARY KEY (id)

);


CREATE TABLE public.os(
	id integer NOT NULL,
	numero integer NOT NULL,
	descricao varchar NOT NULL,
	CONSTRAINT os_pk PRIMARY KEY (id)

);


CREATE TABLE public.sistema(
	id integer NOT NULL,
	nome varchar NOT NULL,
	CONSTRAINT sistema_pk PRIMARY KEY (id)

);

CREATE TABLE public.modulo(
	id integer NOT NULL,
	nome varchar NOT NULL,
	id_sistema integer,
	CONSTRAINT modulo_pk PRIMARY KEY (id)

);

ALTER TABLE public.modulo ADD CONSTRAINT sistema_fk FOREIGN KEY (id_sistema)
REFERENCES public.sistema (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

CREATE TABLE public.status_tarefa(
	id integer NOT NULL,
	nome varchar NOT NULL,
	CONSTRAINT status_tarefa_pk PRIMARY KEY (id)

);

CREATE TABLE public.tarefa(
	id integer NOT NULL,
	descricao varchar NOT NULL,
	numero integer NOT NULL,
	data_cadastro timestamp with time zone NOT NULL,
	tempo_estimado integer,
	tempo_total integer,
	id_status_tarefa integer,
	id_modulo integer,
	id_cliente integer,
	id_os integer,
	CONSTRAINT tarefa_pk PRIMARY KEY (id)

);


ALTER TABLE public.tarefa ADD CONSTRAINT status_tarefa_fk FOREIGN KEY (id_status_tarefa)
REFERENCES public.status_tarefa (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

ALTER TABLE public.tarefa ADD CONSTRAINT modulo_fk FOREIGN KEY (id_modulo)
REFERENCES public.modulo (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

ALTER TABLE public.tarefa ADD CONSTRAINT cliente_fk FOREIGN KEY (id_cliente)
REFERENCES public.cliente (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

ALTER TABLE public.tarefa ADD CONSTRAINT os_fk FOREIGN KEY (id_os)
REFERENCES public.os (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

CREATE TABLE public.tarefa_sprint(
	id integer NOT NULL,
	id_sprint integer,
	id_tarefa integer,
	tempo_testes integer,
	data_cadastro timestamp with time zone NOT NULL,
	tempo_desenvolvimento integer,
	CONSTRAINT tarefa_sprint_pk PRIMARY KEY (id)

);


ALTER TABLE public.tarefa_sprint ADD CONSTRAINT sprint_fk FOREIGN KEY (id_sprint)
REFERENCES public.sprint (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

ALTER TABLE public.tarefa_sprint ADD CONSTRAINT tarefa_fk FOREIGN KEY (id_tarefa)
REFERENCES public.tarefa (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

CREATE TABLE public.tipo_erro(
	id integer NOT NULL,
	descricao varchar NOT NULL,
	CONSTRAINT tipo_erro_pk PRIMARY KEY (id)

);

CREATE TABLE public.erro(
	id integer NOT NULL,
	descricao varchar NOT NULL,
	data_cadastro timestamp with time zone,
	id_tipo_erro integer,
	id_tarefa integer,
	CONSTRAINT erro_pk PRIMARY KEY (id)

);


ALTER TABLE public.erro ADD CONSTRAINT tipo_erro_fk FOREIGN KEY (id_tipo_erro)
REFERENCES public.tipo_erro (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

ALTER TABLE public.erro ADD CONSTRAINT tarefa_fk FOREIGN KEY (id_tarefa)
REFERENCES public.tarefa (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;

-- Criação de Sequences
CREATE SEQUENCE cliente_seq;
CREATE SEQUENCE os_seq
CREATE SEQUENCE erro_seq;
CREATE SEQUENCE modulo_seq;
CREATE SEQUENCE sistema_seq;
CREATE SEQUENCE sprint_seq;
CREATE SEQUENCE status_tarefa_seq;
CREATE SEQUENCE tarefa_seq;
CREATE SEQUENCE tarefa_sprint_seq;
CREATE SEQUENCE tipo_erro_seq;

-- Insert dos sistemas
INSERT INTO sistema VALUES (1, 'SIGAA');
INSERT INTO sistema VALUES (2, 'SIPAC');
INSERT INTO sistema VALUES (3, 'SIGRH');
INSERT INTO sistema VALUES (4, 'SIGADMIN');
