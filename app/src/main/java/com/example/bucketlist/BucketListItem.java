package com.example.bucketlist;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "bucket_list_item_table")
public class BucketListItem {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String title, description;
    private boolean done;

    public BucketListItem(String title, String description, boolean done) {
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean getDone() {
        return done;
    }

    public void switchDone() {
        done = !done;
    }
}
