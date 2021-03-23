package br.com.dbserver.utils;

public class Endpoint {
    protected static final String BASE_URI = PropertiesData.getPropertiesData("urlReqRes", "BASE_URI");
    protected static final String BASE_PATH_LIST_USERS = PropertiesData.getPropertiesData("urlReqRes", "BASE_PATH_LIST_USERS");
    protected static final String BASE_PATH_SINGLE_USER = PropertiesData.getPropertiesData("urlReqRes", "BASE_PATH_SINGLE_USER");
    protected static final String BASE_PATH_SINGLE_USER_NOT_FOUND = PropertiesData.getPropertiesData("urlReqRes", "BASE_PATH_SINGLE_USER_NOT_FOUND");
    protected static final String BASE_PATH_CREATE_USER = PropertiesData.getPropertiesData("urlReqRes", "BASE_PATH_CREATE_USER");
    protected static final String DELETE_ID_USER = PropertiesData.getPropertiesData("idUSer", "ID_USER");
    protected static String idUser;
}