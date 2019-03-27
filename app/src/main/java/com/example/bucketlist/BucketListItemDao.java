package com.example.bucketlist;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface BucketListItemDao {
    @Insert
    void insert(BucketListItem item);

    @Delete
    void delete(BucketListItem item);

    @Delete
    void delete(List<BucketListItem> items);

    @Query("SELECT * from bucket_list_item_table")
    List<BucketListItem> getAllItems();
}
