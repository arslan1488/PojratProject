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

        //mSqLiteDatabase.insert(DATABASE_TABLE, null, getContenValuesItem());
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
