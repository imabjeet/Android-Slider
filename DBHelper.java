package com.example.restro;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.tools.ir.runtime.IncrementalChange;
import com.android.tools.ir.runtime.InstantReloadException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IncrementalChange $change = null;
    private static final String DATABASE_NAME = "MyExternalDatabase.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DB_PATH_SUFFIX = "/databases/";
    public static Context ctx = null;
    public static final long serialVersionUID = 8963644539519730002L;

    DBHelper(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[1];
        int hashCode = str.hashCode();
        if (hashCode == -496193366) {
            this(objArr[2]);
        } else if (hashCode == -376888114) {
            super((Context) objArr[2], (String) objArr[3], (CursorFactory) objArr[4], objArr[5].intValue(), (DatabaseErrorHandler) objArr[6]);
        } else if (hashCode == 1289736834) {
            super(objArr[2], objArr[3], objArr[4], objArr[5].intValue());
        } else {
            throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/restro/DBHelper"}));
        }
    }

    public static /* synthetic */ Object access$super(DBHelper dBHelper, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -2000015223:
                super.onOpen(objArr[0]);
                return null;
            case -1554832987:
                super.finalize();
                return null;
            case -1100993913:
                super.onConfigure(objArr[0]);
                return null;
            case -1021472056:
                super.wait(objArr[0].longValue());
                return null;
            case -483678593:
                super.close();
                return null;
            case -241799050:
                super.onDowngrade(objArr[0], objArr[1].intValue(), objArr[2].intValue());
                return null;
            case 201261558:
                return super.getClass();
            case 305025623:
                return super.getWritableDatabase();
            case 342041543:
                super.setWriteAheadLoggingEnabled(objArr[0].booleanValue());
                return null;
            case 1403628309:
                return new Integer(super.hashCode());
            case 1452388359:
                return super.getReadableDatabase();
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            case 2084723549:
                return super.getDatabaseName();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/restro/DBHelper"}));
        }
    }

    public DBHelper(Context context) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/restro/DBHelper;Landroid/content/Context;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, context, new Object[0]});
            Object[] objArr2 = (Object[]) objArr[0];
            this(objArr, null);
            objArr2[0] = this;
            incrementalChange.access$dispatch("init$body.(Lcom/example/restro/DBHelper;Landroid/content/Context;[Ljava/lang/Object;)V", objArr2);
            return;
        }
        super(context, DATABASE_NAME, null, 1);
        ctx = context;
    }

    public List<String> Get_ContactDetails(String query) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (List) incrementalChange.access$dispatch("Get_ContactDetails.(Ljava/lang/String;)Ljava/util/List;", new Object[]{this, query});
        }
        Cursor cursor = getReadableDatabase().rawQuery(query, null);
        List<String> list = new ArrayList<>();
        while (cursor != null && cursor.moveToNext()) {
            list.add(cursor.getString(1));
        }
        return list;
    }

    public ArrayList<Bitmap> getImage(String name, String query) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (ArrayList) incrementalChange.access$dispatch("getImage.(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;", new Object[]{this, name, query});
        }
        SQLiteDatabase db = getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Table2 where Name='");
        sb.append(name);
        sb.append("'");
        Cursor cursor = db.rawQuery(sb.toString(), null);
        ArrayList<Bitmap> b = new ArrayList<>();
        cursor.moveToNext();
        byte[] d = cursor.getBlob(4);
        b.add(BitmapFactory.decodeByteArray(d, 0, d.length));
        Cursor cursor2 = db.rawQuery(query, null);
        while (cursor2 != null && cursor2.moveToNext()) {
            byte[] d1 = cursor2.getBlob(4);
            b.add(BitmapFactory.decodeByteArray(d1, 0, d1.length));
        }
        return b;
    }

    public ArrayList<String> getName(String name, String query) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (ArrayList) incrementalChange.access$dispatch("getName.(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;", new Object[]{this, name, query});
        }
        SQLiteDatabase db = getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Table2 where Name='");
        sb.append(name);
        sb.append("'");
        Cursor cursor = db.rawQuery(sb.toString(), null);
        ArrayList<String> b = new ArrayList<>();
        cursor.moveToNext();
        b.add(cursor.getString(1));
        Cursor cursor2 = db.rawQuery(query, null);
        while (cursor2 != null && cursor2.moveToNext()) {
            b.add(cursor2.getString(1));
        }
        return b;
    }

    public ArrayList<String> getDetail(String name, String query) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (ArrayList) incrementalChange.access$dispatch("getDetail.(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;", new Object[]{this, name, query});
        }
        SQLiteDatabase db = getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Table2 where Name='");
        sb.append(name);
        sb.append("'");
        Cursor cursor = db.rawQuery(sb.toString(), null);
        ArrayList<String> b = new ArrayList<>();
        cursor.moveToNext();
        b.add(cursor.getString(5));
        Cursor cursor2 = db.rawQuery(query, null);
        while (cursor2 != null && cursor2.moveToNext()) {
            b.add(cursor2.getString(5));
        }
        return b;
    }

    public ArrayList<Integer> getFav(String name, String query) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (ArrayList) incrementalChange.access$dispatch("getFav.(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;", new Object[]{this, name, query});
        }
        SQLiteDatabase db = getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Table2 where Name='");
        sb.append(name);
        sb.append("'");
        Cursor cursor = db.rawQuery(sb.toString(), null);
        cursor.moveToNext();
        ArrayList<Integer> d = new ArrayList<>();
        d.add(Integer.valueOf(cursor.getInt(3)));
        Cursor cursor2 = db.rawQuery(query, null);
        while (cursor2 != null && cursor2.moveToNext()) {
            d.add(Integer.valueOf(cursor2.getInt(3)));
        }
        return d;
    }

    public void update(String query) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("update.(Ljava/lang/String;)V", new Object[]{this, query});
            return;
        }
        getWritableDatabase().execSQL(query);
    }

    public void CopyDataBaseFromAsset() throws IOException {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("CopyDataBaseFromAsset.()V", new Object[]{this});
            return;
        }
        InputStream myInput = ctx.getAssets().open(DATABASE_NAME);
        String outFileName = getDatabasePath();
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.getApplicationInfo().dataDir);
        sb.append(DB_PATH_SUFFIX);
        File f = new File(sb.toString());
        if (!f.exists()) {
            f.mkdir();
        }
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        while (true) {
            int read = myInput.read(buffer);
            int length = read;
            if (read > 0) {
                myOutput.write(buffer, 0, length);
            } else {
                myOutput.flush();
                myOutput.close();
                myInput.close();
                return;
            }
        }
    }

    private static String getDatabasePath() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (String) incrementalChange.access$dispatch("getDatabasePath.()Ljava/lang/String;", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.getApplicationInfo().dataDir);
        sb.append(DB_PATH_SUFFIX);
        sb.append(DATABASE_NAME);
        return sb.toString();
    }

    public SQLiteDatabase openDataBase() throws SQLException {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (SQLiteDatabase) incrementalChange.access$dispatch("openDataBase.()Landroid/database/sqlite/SQLiteDatabase;", new Object[]{this});
        }
        File dbFile = ctx.getDatabasePath(DATABASE_NAME);
        if (!dbFile.exists()) {
            try {
                CopyDataBaseFromAsset();
                System.out.println("Copying sucess from Assets folder");
            } catch (IOException e) {
                throw new RuntimeException("Error creating source database", e);
            }
        }
        return SQLiteDatabase.openDatabase(dbFile.getPath(), null, 268435472);
    }

    public void onCreate(SQLiteDatabase db) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("onCreate.(Landroid/database/sqlite/SQLiteDatabase;)V", new Object[]{this, db});
        }
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("onUpgrade.(Landroid/database/sqlite/SQLiteDatabase;II)V", new Object[]{this, db, new Integer(oldVersion), new Integer(newVersion)});
        }
    }
}
