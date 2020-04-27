package com.rchincaamal.miagenda.utils;

public class Utils {
    public static final int db_version  = 1;
    public static final String dbName = "agenda";

    public static final String table_user   = "users";
    public static final String id_field   = "id";
    public static final String name_field   = "name";
    public static final String age_field   = "age";
    public static final String phone_field   = "phone";

    public static final String create_user = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s INTEGER, %s TEXT)"
            ,table_user,id_field,name_field,age_field,phone_field);
}
