package com.example.android.timetable.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Sudhanshu on 20-08-2017.
 */

public class TimetableContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.timetable";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://"+CONTENT_AUTHORITY);
    public static final String PATH_TIMETABLE = "timetable";
    public static final String PATH_SUBJECT = "subjects";


    /**
     * This table stores the daily time table
     */
    public static final class TimetableEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_TIMETABLE);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of days.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TIMETABLE;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single day.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TIMETABLE;

        public static final String TABLE_NAME = "timetable";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_SUBJECT_CODE = "subject code";
        public static final String COLUMN_ON_MONDAY = "monday";
        public static final String COLUMN_ON_TUESDAY = "tuesday";
        public static final String COLUMN_ON_WEDNESDAY = "wednesday";
        public static final String COLUMN_ON_THURSDAY = "thursday";
        public static final String COLUMN_ON_FRIDAY = "friday";
        public static final String COLUMN_ON_SATURDAY = "saturday";
        public static final String COLUMN_ON_SUNDAY = "sunday";

        /**
         * Possible values for the classes on any day
         */
        public static final int CLASS_YES = 1;
        public static final int CLASS_NO = 0;
    }


    /**
     * This table stores the subject related informations
     */
    public static final class SubjectEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_SUBJECT);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of subjects.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_SUBJECT;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single subject.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_SUBJECT;


        public static final String TABLE_NAME = "subjects";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_CLASSES_PRESENT = "classes present";
        public static final String COLUMN_ALL_CLASSES = "total classes";
    }
}