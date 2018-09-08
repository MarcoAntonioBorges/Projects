-- Gerado por Oracle SQL Developer Data Modeler 17.4.0.355.2121
--   em:        2018-09-07 23:32:57 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g

/*

DROP TABLE t_spm_destino CASCADE CONSTRAINTS;

DROP TABLE t_spm_mochilao CASCADE CONSTRAINTS;

DROP TABLE t_spm_usuario CASCADE CONSTRAINTS;

*/

CREATE TABLE t_spm_destino (
    cd_destino     NUMBER(4) NOT NULL,
    nm_destino     VARCHAR2(40) NOT NULL,
    ds_distancia   NUMBER(8,2) NOT NULL
);

ALTER TABLE t_spm_destino ADD CONSTRAINT pk_spm_destino PRIMARY KEY ( cd_destino );

CREATE TABLE t_spm_mochilao (
    cd_mochilao     NUMBER(4) NOT NULL,
    cd_usuario      NUMBER(4) NOT NULL,
    cd_destino      NUMBER(4) NOT NULL,
    ds_acessorios   VARCHAR2(600) NOT NULL,
    dt_partida      DATE NOT NULL
);

ALTER TABLE t_spm_mochilao ADD CONSTRAINT pk_spm_mochilao PRIMARY KEY ( cd_mochilao );

CREATE TABLE t_spm_usuario (
    cd_usuario    NUMBER(4) NOT NULL,
    ds_login      VARCHAR2(20) NOT NULL,
    ds_senha      VARCHAR2(40) NOT NULL,
    nm_completo   VARCHAR2(40) NOT NULL
);

ALTER TABLE t_spm_usuario ADD CONSTRAINT pk_spm_usuario PRIMARY KEY ( cd_usuario );

ALTER TABLE t_spm_mochilao
    ADD CONSTRAINT fk_spm_mochilao_destino FOREIGN KEY ( cd_destino )
        REFERENCES t_spm_destino ( cd_destino );

ALTER TABLE t_spm_mochilao
    ADD CONSTRAINT fk_spm_mochilao_usuario FOREIGN KEY ( cd_usuario )
        REFERENCES t_spm_usuario ( cd_usuario );
