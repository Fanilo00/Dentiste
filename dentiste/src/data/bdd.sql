create database dentise;

create table type_teeth
(
    id_type_teeth serial primary key,
    nom_type_teeth varchar(40)
);

insert into type_teeth(nom_type_teeth) values('insisive');
insert into type_teeth(nom_type_teeth) values('canine');
insert into type_teeth(nom_type_teeth) values('molaire');
insert into type_teeth(nom_type_teeth) values('premolaire');

create table teeth
(
    id_teeth serial primary key,
    id_type_teeth varchar(40),
    numero_teeth int
);

--dents de 1 à 16(en haut)

insert into teeth(id_type_teeth, numero_teeth) values(3,1);
insert into teeth(id_type_teeth, numero_teeth) values(3,2);
insert into teeth(id_type_teeth, numero_teeth) values(3,3);
insert into teeth(id_type_teeth, numero_teeth) values(4,4);
insert into teeth(id_type_teeth, numero_teeth) values(4,5);
insert into teeth(id_type_teeth, numero_teeth) values(2,6);
insert into teeth(id_type_teeth, numero_teeth) values(1,7);
insert into teeth(id_type_teeth, numero_teeth) values(1,8);
insert into teeth(id_type_teeth, numero_teeth) values(1,9);
insert into teeth(id_type_teeth, numero_teeth) values(1,10);
insert into teeth(id_type_teeth, numero_teeth) values(2,11);
insert into teeth(id_type_teeth, numero_teeth) values(4,12);
insert into teeth(id_type_teeth, numero_teeth) values(4,13);
insert into teeth(id_type_teeth, numero_teeth) values(3,14);
insert into teeth(id_type_teeth, numero_teeth) values(3,15);
insert into teeth(id_type_teeth, numero_teeth) values(3,16);


---dents de 21 a 36(en bas)

insert into teeth(id_type_teeth, numero_teeth) values(3, 21);
insert into teeth(id_type_teeth, numero_teeth) values(3, 22);
insert into teeth(id_type_teeth, numero_teeth) values(3, 23);
insert into teeth(id_type_teeth, numero_teeth) values(4, 24);
insert into teeth(id_type_teeth, numero_teeth) values(4, 25);
insert into teeth(id_type_teeth, numero_teeth) values(2, 26);
insert into teeth(id_type_teeth, numero_teeth) values(1, 27);
insert into teeth(id_type_teeth, numero_teeth) values(1, 28);
insert into teeth(id_type_teeth, numero_teeth) values(1, 29);
insert into teeth(id_type_teeth, numero_teeth) values(1, 30);
insert into teeth(id_type_teeth, numero_teeth) values(2, 31);
insert into teeth(id_type_teeth, numero_teeth) values(4, 32);
insert into teeth(id_type_teeth, numero_teeth) values(4, 33);
insert into teeth(id_type_teeth, numero_teeth) values(3, 34);
insert into teeth(id_type_teeth, numero_teeth) values(3, 35);
insert into teeth(id_type_teeth, numero_teeth) values(3, 36);

create table personne
(
    id_personne serial primary key,
    nom_personne varchar(40),
    budjet_personne int
);

create table type_priorite
(
    id_type_priorite serial primary key,
    nom_priorite varchar(40)
);

insert into type_priorite(nom_priorite) values('sanitaire');
insert into type_priorite(nom_priorite) values('beaute');

create table etape
(
    id_etape serial primary key,
    nom_etape varchar(40),
    prix_unitaire int
);

insert into etape(nom_etape,prix_unitaire) values('remplacement',30000);
insert into etape(nom_etape,prix_unitaire) values('reparation',50000);


create table priorite
(
    id_priorite serial primary key,
    id_personne integer references personne(id_personne),
    id_type_priorite integer references type_priorite(id_type_priorite),
    id_etape integer references etape(id_etape)
);

