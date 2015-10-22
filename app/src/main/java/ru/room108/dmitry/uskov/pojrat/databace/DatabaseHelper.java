package ru.room108.dmitry.uskov.pojrat.databace;

import android.content.Context;
import android.database.DatabaseErrorHandler;
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

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE);

        onCreate(db);
    }
}
