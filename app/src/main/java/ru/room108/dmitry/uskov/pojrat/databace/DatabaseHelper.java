package ru.room108.dmitry.uskov.pojrat.databace;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;


public class DatabaseHelper extends SQLiteOpenHelper implements BaseColumns {

    private static final String DATABASE_NAME = "AllItems";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_TABLE = "Items";

    public static final String COLUMN_NAME= "name";
    public static final String COLUMN_CATEGORY= "category";
    public static final String COLUMN_PRICE= "price";
    public static final String COLUMN_IMAGE_ID= "image";

    public static final String COLUMN_NUTRITIONAL_VALUR= "nutritional";
    public static final String COLUMN_PROTEIN= "protein";
    public static final String COLUMN_FATS= "fats";
    public static final String COLUMN_CARBOHYDRATES= "carbohydrates";

    private static final String DATABASE_CREATE_SCRIPT = "create table "
            + DATABASE_TABLE + " (" +
            BaseColumns._ID + " integer primary key autoincrement, " +
            COLUMN_NAME + " text not null, " +
            COLUMN_CATEGORY + " text not null, " +
            COLUMN_PRICE + " double, "+
            COLUMN_IMAGE_ID + " integer, " +
            COLUMN_NUTRITIONAL_VALUR + " double, "+
            COLUMN_PROTEIN + " double, "+
            COLUMN_FATS + " double, "+
            COLUMN_CARBOHYDRATES + " double"
            +");";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    private void addItemKFC() {
        SQLiteDatabase mSqLiteDatabase = this.getWritableDatabase();

        //Бургеры
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БИГГЕР оригинальный", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БИГГЕР острый", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЗИНГЕР", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("КЛАССИК", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЛОНГЕР", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЛОНГЕР ЧИЗ", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПАНИНИ", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("САНДЕРС", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ФРЕШЕР", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БОКСМАСТЕР ИЗ ТОСТЕРА оригинальный", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("АЙ-ТВИСТЕР ЧИЗ", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ТВИСТЕР ИЗ ТОСТЕРА оригинальный", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ТВИСТЕР ИЗ ТОСТЕРА острый", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ТВИСТЕР ИЗ ТОСТЕРА ВЕДЖИ", Item.Categories.BURGERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));

        //Гарниры
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("КАРТОФЕЛЬ ФРИ МАЛ.", Item.Categories.SNACKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("КАРТОФЕЛЬ ФРИ СТАНД.", Item.Categories.SNACKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ ФРИ", Item.Categories.SNACKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("КАРТОФЕЛЬНЫЕ КРАНЧИ ФРИ", Item.Categories.SNACKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));

        //Салаты

        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("САЛАТ ЦЕЗАРЬ  + Соус \"Цезарь\"", Item.Categories.SALADS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));



        //Десерты
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром", Item.Categories.DESSERTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром с концентратом \"Клубника\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром с соусом для десерта \"Карамель\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром с соусом для десерта \"Тёмный шоколад\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельска вафля с мороженым ", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром с мороженым и и концентратом \"Клубника\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром с мороженым и соусом для десерта\"Карамель\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Брюссельская вафля с сахаром с мороженым и соусом для десерта\"Тёмный шоколад\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чизкейк New-York", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чизкейк New-York с концентратом \"Клубника\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чизкейк New-York с соусом для десерта \"Карамель\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чизкейк New-York с соусом для десерта \"Темный шоколад\"", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПИРОЖКИ С ВИШНЕВОЙ НАЧИНКОЙ", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПИРОЖКИ С ЯБЛОЧНОЙ НАЧИНКОЙ", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Печенье ванильное с молочным шоколадом ", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Печенье шоколадное с белым шоколадом и фундуком", Item.Categories.DESSERTS, -1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));

        //Напитки
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ-КОЛА дет.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ-КОЛА мал.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ-КОЛА станд.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ-КОЛА бол.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ ЛАЙТ дет.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ ЛАЙТ  мал.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ ЛАЙТ станд.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ПЕПСИ ЛАЙТ бол.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МАУНТИН ДЬЮ  дет.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МАУНТИН ДЬЮ мал.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МАУНТИН ДЬЮ станд.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МАУНТИН ДЬЮ  бол.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СЭВЕН-АП  дет.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СЭВЕН-АП мал.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СЭВЕН-АП станд.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СЭВЕН-АП бол.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МИРИНДА  дет.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МИРИНДА мал.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МИРИНДА станд.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МИРИНДА бол.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЧАЙ \"ЛИПТОН\" дет.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЧАЙ \"ЛИПТОН\" мал.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЧАЙ \"ЛИПТОН\" станд.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЧАЙ \"ЛИПТОН\" бол.", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СОК в ассортименте 0,2 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("апельсиновый 0,2л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("яблочный 0,2л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("томатный 0,2л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МОРС 0,2л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("МОХИТО б/а", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("ЧЕРРИ БЕРРИ б/а", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("КЛУБНИЧНЫЙ ДАЙКИРИ б/а", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));

        //Напитки(Горячие)
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Двойной Эспрессо 0,1 зерновой ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Американо 0,2 зерновой ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Американо 0,3 зерновой", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Капучино 0,3 зерновой ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Капучино 0,4 зерновой ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Латте 0,3 зерновой", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Латте 0,4 зерновой", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Глясе 0,2 зерновой", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чай черный 0,3 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чай черный 0,4 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чай зеленый 0,3 л  ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Чай зеленый 0,4 л  ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Капучино 0,3 без сахара ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Капучино 0,4 без сахара", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Латте 0,3 без сахара ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Кофе Латте 0,4 без сахара", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сироп с ароматом Ваниль к 0,3 л ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сироп с ароматом Карамель к 0,3 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сироп с ароматом Лесной орех к 0,3 л ", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сироп с ароматом Ваниль к 0,4 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сироп с ароматом Карамель к 0,4 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сироп с ароматом Лесной орех к 0,4 л", Item.Categories.DRINKS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));


        //Пиво
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СИБИРСКАЯ КОРОНА 0,3 л", Item.Categories.BEER,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("СИБИРСКАЯ КОРОНА 0,5 л   ", Item.Categories.BEER,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАД 0,3 л", Item.Categories.BEER,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАД 0,5 л", Item.Categories.BEER,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));


        //Завтраки
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Блинчики ", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сырники", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич \"Бустер\"", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Яичница с байтсами", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Картофельные оладьи", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич Брейкер", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич Райзер", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич Боксмастер утренний", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич Твистер утренний", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич Биггер утренний оригинальный", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Сандвич Биггер утренний острый", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Овсяная каша", Item.Categories.BREAKFASTS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));

        //Наборы
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ 25 КРЫЛЬЕВ", Item.Categories.COMBOS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ БОЛЬШОЙ КУШ ОРИГИНАЛЬНЫЙ: 3 куска, 9 куриных крылышек, 4 стрипса (оригинальные) ", Item.Categories.COMBOS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ БОЛЬШОЙ КУШ ОСТРЫЙ: 3 куска, 9 куриных крылышек, 4 стрипса (острые)", Item.Categories.COMBOS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ ДУЭТ ОРИГИНАЛЬНЫЙ : 2 куска, 4 куриных крылышка, 4 стрипса (оригинальные/острые), 2 картофеля фри 70г)", Item.Categories.COMBOS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ ДУЭТ ОСТРЫЙ : 2 куска, 4 куриных крылышка, 4 стрипса (оригинальные/острые), 2 картофеля фри 70г)", Item.Categories.COMBOS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("БАСКЕТ 16 ОСТРЫХ КРЫЛЬЕВ: 16 куриных крылышек, 2 картофеля фри 70г", Item.Categories.COMBOS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));

        //Курица
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("3 КРЫЛЫШКА", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("6 КРЫЛЫШЕК", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("9 КРЫЛЫШЕК", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("3 СТРИПСА оригинальные", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("6 СТРИПСОВ оригинальные", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("9 СТРИПСОВ оригинальные", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("3 СТРИПСА острые", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("6 СТРИПСОВ острые", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("9 СТРИПСОВ острые", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Байтсы из куриного филе острые 95 г.", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Байтсы из куриного филе острые 135 г.", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Байтсы из куриного филе острые 300 г.", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));
        mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem("Байтс Терияки", Item.Categories.SPECIAL_OFFERS,  - 1, -1, new EnergyValue(452, 4.5, 23.5, 54.5)));


    }





    private ContentValues getContenValuesItem(String name, String category, int imageId, double price, EnergyValue energyValue) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME, name);
        contentValues.put(COLUMN_CATEGORY, category);
        contentValues.put(COLUMN_IMAGE_ID, imageId);
        contentValues.put(COLUMN_PRICE, price);

        contentValues.put(COLUMN_PROTEIN, energyValue.getProtein());
        contentValues.put(COLUMN_FATS, energyValue.getFats());
        contentValues.put(COLUMN_CARBOHYDRATES, energyValue.getCarbohydrates());
        contentValues.put(COLUMN_NUTRITIONAL_VALUR, energyValue.getNutritionalValue());

        return contentValues;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_SCRIPT);
        addItemKFC();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE);

        onCreate(db);
    }
}
