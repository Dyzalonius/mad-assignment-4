package com.example.bucketlist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {BucketListItem.class}, version = 1, exportSchema = false)
public abstract class BucketListRoomDatabase extends RoomDatabase {

    private final static String NAME_DATABASE = "product_database";
    public abstract BucketListItemDao itemDao();
    private static volatile BucketListRoomDatabase INSTANCE;

    public static BucketListRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (BucketListRoomDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            BucketListRoomDatabase.class, NAME_DATABASE)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
