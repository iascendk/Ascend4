package com.ascendcorparation.ascend4;

/**
 * Created by user on 16.02.2016.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Questions";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT)";
        db.execSQL(sql);
        addQuestions();
//db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
// Create tables again
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(Question quest) {
//SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        dbase.insert(TABLE_QUEST, null, values);
    }

    private void addQuestions() {
        Question q1 = new Question("What if you will catch goldfish? " +
                "What wishes would you tell?");
        this.addQuestion(q1);
        Question q2 = new Question("What if you have doppelganger?");
        this.addQuestion(q2);
        Question q3 = new Question("What if you have million dollars?");
        this.addQuestion(q3);
        Question q4 = new Question("What if today is your last day?");
        this.addQuestion(q4);
        Question q5 = new Question("What if tomorrow you will become Bill Gates?");
        this.addQuestion(q5);
        Question q6 = new Question("What if a sea waters has no salt?");
        this.addQuestion(q6);
        Question q7 = new Question("What if you fell into a black hole?");
        this.addQuestion(q7);
        Question q8 = new Question("What if Earth were twice as big?");
        this.addQuestion(q8);
        Question q9 = new Question("What if everyone on Earth jumped at once?");
        this.addQuestion(q9);
        Question q10 = new Question("What if all the cats in the world suddenly died?");
        this.addQuestion(q10);

        Question q11 = new Question("What if you only ate one type of food?");
        this.addQuestion(q11);
        Question q12 = new Question("What if there were no seasons?");
        this.addQuestion(q12);
        Question q13 = new Question("What if you could be free?");
        this.addQuestion(q13);
        Question q14 = new Question("What if you change your gender for a day?");
        this.addQuestion(q14);
        Question q15 = new Question("What if you woke up in a world that had absolutely no crime?");
        this.addQuestion(q15);
        Question q16 = new Question("What if your pet could only talk to you at midnight for an hour?");
        this.addQuestion(q16);
        Question q17 = new Question("What if you could live in Harry Potter world?");
        this.addQuestion(q17);
        Question q18 = new Question("What if you could find the strength to forgive anyone, no matter how badly they have hurt you?");
        this.addQuestion(q18);
        Question q19 = new Question("What if you could make someone fall in love with you?");
        this.addQuestion(q19);
        Question q20 = new Question("What if electricity and any other power source was unavailable for a full week? ");
        this.addQuestion(q20);

        Question q21 = new Question("What if you were unable to smile for a full month?");
        this.addQuestion(q21);
        Question q22 = new Question("What if you woke up and your body was made out of bacon?");
        this.addQuestion(q22);
        Question q23 = new Question("What if you found out all the answers to the greatest mysteries in the world?");
        this.addQuestion(q23);
        Question q24 = new Question("What if you could create your own TV?");
        this.addQuestion(q24);
        Question q25 = new Question("What if you could be invisible?");
        this.addQuestion(q25);
        Question q26 = new Question("What if elephants could fly?");
        this.addQuestion(q26);
        Question q27 = new Question("What if only women ruled the world?");
        this.addQuestion(q27);
        Question q28 = new Question("What if teachers earned as much as rock stars?");
        this.addQuestion(q28);
        Question q29 = new Question("What if no one were allowed to earn more than $100,000 a year?");
        this.addQuestion(q29);
        Question q30 = new Question("What if there was no music in the world?");
        this.addQuestion(q30);

        Question q31 = new Question("What if war declared illegal?");
        this.addQuestion(q31);
        Question q32 = new Question("What if there were twice more mountains?");
        this.addQuestion(q32);
        Question q33 = new Question("What if you got magic printer which could print real money?");
        this.addQuestion(q33);
        Question q34 = new Question("What if you meet Mark Zuckerberg?");
        this.addQuestion(q34);
        Question q35 = new Question("What if people slept 23 hours a day and were awake for only 1??");
        this.addQuestion(q35);
    }



    public Cursor getRandomDataItemFromDb(String tableName, int limit) {
        Cursor cursor = dbase.rawQuery("SELECT * FROM " + tableName+ " ORDER BY RANDOM() LIMIT " + limit, null);
        if (cursor.moveToFirst()) {
            return cursor;
        }
        return cursor;
    }
    }

