CREATE SEQUENCE "HARDWARE_ID_SEQUENCE" START WITH 1;
CREATE TABLE "HARDWARE"(
    "ID" BIGINT NOT NULL,
    "DESCRIPTION" VARCHAR(255),
    "NAME" VARCHAR(255) NOT NULL,
    "SERIAL_NO" VARCHAR(255) NOT NULL,
    "HARDWARE_TYPE_ID" VARCHAR(255)
);

ALTER TABLE "HARDWARE" ADD CONSTRAINT "HARDWARE_ID_PK" PRIMARY KEY("ID");
INSERT INTO "HARDWARE" VALUES
(1, 'Komputer jakiśtam', 'Dell 1201', '5gtfdvgyd', '1'),
(2, 'Laptop Fujitsu', 'Fujitsu Lptop est', '6sgs6gys6gs6', '2');
ALTER TABLE "HARDWARE" ADD CONSTRAINT "HARDWARE_TYPE_ID_FK" UNIQUE("HARDWARE_TYPE_ID");
ALTER TABLE "HARDWARE" ADD CONSTRAINT "HARDWARE_TYPE_ID_FK" FOREIGN KEY("HARDWARE_TYPE_ID") REFERENCES "HARDWARE_TYPE"("ID") NOCHECK;

CREATE SEQUENCE "HARDWARE_TYPE_ID_SEQUENCE" START WITH 1;
CREATE TABLE "HARDWARE_TYPE"(
    "ID" VARCHAR(255) NOT NULL,
    "TYPE" VARCHAR(255) NOT NULL
);
ALTER TABLE "HARDWARE_TYPE" ADD CONSTRAINT "CONSTRAINT_C" PRIMARY KEY("ID");
INSERT INTO "HARDWARE_TYPE" VALUES
('1', 'Computer'),
('2', 'Laptop'),
('3', 'Monitor');