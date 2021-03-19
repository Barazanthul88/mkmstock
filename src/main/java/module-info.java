module mkmstock {
    requires spring.context;
    requires spring.tx;
    requires spring.jdbc;
    requires spring.orm;
    requires java.sql;
    requires spring.data.jpa;
    requires lombok;
    requires java.persistence;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    opens de.mkmstock to spring.core;
    opens de.mkmstock.jpa.config to spring.core;

    exports de.mkmstock.jpa.config to spring.beans,spring.context;
}