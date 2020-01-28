package com.example.restro;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.tools.ir.runtime.IncrementalChange;
import com.android.tools.ir.runtime.InstantReloadException;
import java.util.ArrayList;

public class ImageAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IncrementalChange $change = null;
    public static final long serialVersionUID = -857659856695121778L;
    public Context context;
    public ArrayList<String> details;
    public ArrayList<Bitmap> images;
    public LayoutInflater inflater;
    public ArrayList<String> names;

    ImageAdapter(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[1];
        int hashCode = str.hashCode();
        if (hashCode == 294905800) {
            this(objArr[2], objArr[3], objArr[4], objArr[5]);
        } else if (hashCode != 1697321964) {
            throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/restro/ImageAdapter"}));
        }
    }

    public static /* synthetic */ Object access$super(ImageAdapter imageAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return ImageAdapter.super.toString();
            case -2093417530:
                ImageAdapter.super.setPrimaryItem(objArr[0], objArr[1].intValue(), objArr[2]);
                return null;
            case -1554832987:
                ImageAdapter.super.finalize();
                return null;
            case -1242386338:
                return ImageAdapter.super.saveState();
            case -1021472056:
                ImageAdapter.super.wait(objArr[0].longValue());
                return null;
            case -993198239:
                ImageAdapter.super.restoreState(objArr[0], objArr[1]);
                return null;
            case -930493631:
                ImageAdapter.super.destroyItem(objArr[0], objArr[1].intValue(), objArr[2]);
                return null;
            case -286677780:
                ImageAdapter.super.notifyDataSetChanged();
                return null;
            case 50642664:
                return new Integer(ImageAdapter.super.getItemPosition(objArr[0]));
            case 190603819:
                return new Float(ImageAdapter.super.getPageWidth(objArr[0].intValue()));
            case 201261558:
                return ImageAdapter.super.getClass();
            case 263033090:
                ImageAdapter.super.finishUpdate(objArr[0]);
                return null;
            case 272159538:
                return ImageAdapter.super.instantiateItem(objArr[0], objArr[1].intValue());
            case 446347441:
                return ImageAdapter.super.getPageTitle(objArr[0].intValue());
            case 705961164:
                ImageAdapter.super.destroyItem(objArr[0], objArr[1].intValue(), objArr[2]);
                return null;
            case 943716359:
                ImageAdapter.super.setPrimaryItem(objArr[0], objArr[1].intValue(), objArr[2]);
                return null;
            case 981509679:
                ImageAdapter.super.finishUpdate(objArr[0]);
                return null;
            case 1013191953:
                ImageAdapter.super.startUpdate(objArr[0]);
                return null;
            case 1209898176:
                ImageAdapter.super.startUpdate(objArr[0]);
                return null;
            case 1403628309:
                return new Integer(ImageAdapter.super.hashCode());
            case 1412292157:
                return ImageAdapter.super.instantiateItem(objArr[0], objArr[1].intValue());
            case 1668291879:
                ImageAdapter.super.registerDataSetObserver(objArr[0]);
                return null;
            case 1725662510:
                ImageAdapter.super.unregisterDataSetObserver(objArr[0]);
                return null;
            case 1814730534:
                return new Boolean(ImageAdapter.super.equals(objArr[0]));
            case 2025021518:
                return ImageAdapter.super.clone();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/restro/ImageAdapter"}));
        }
    }

    public ImageAdapter(Context context2, ArrayList<Bitmap> images2, ArrayList<String> names2, ArrayList<String> details2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/restro/ImageAdapter;Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, context2, images2, names2, details2, new Object[0]});
            Object[] objArr2 = (Object[]) objArr[0];
            this(objArr, null);
            objArr2[0] = this;
            incrementalChange.access$dispatch("init$body.(Lcom/example/restro/ImageAdapter;Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;[Ljava/lang/Object;)V", objArr2);
            return;
        }
        this.context = context2;
        this.inflater = LayoutInflater.from(context2);
        this.images = images2;
        this.names = names2;
        this.details = details2;
    }

    public int getCount() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.images.size();
        }
        return ((Number) incrementalChange.access$dispatch("getCount.()I", new Object[]{this})).intValue();
    }

    public Object instantiateItem(ViewGroup view, int position) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return incrementalChange.access$dispatch("instantiateItem.(Landroid/view/ViewGroup;I)Ljava/lang/Object;", new Object[]{this, view, new Integer(position)});
        }
        View myImageLayout = this.inflater.inflate(C0005R.layout.slide_layout, view, false);
        ((TextView) myImageLayout.findViewById(C0005R.C0006id.text1)).setText((CharSequence) this.names.get(position));
        TextView data = (TextView) myImageLayout.findViewById(2131165326);
        data.setText((CharSequence) this.details.get(position));
        data.setMovementMethod(new ScrollingMovementMethod());
        ((ImageView) myImageLayout.findViewById(C0005R.C0006id.image)).setImageBitmap((Bitmap) this.images.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return view.equals(o);
        }
        return ((Boolean) incrementalChange.access$dispatch("isViewFromObject.(Landroid/view/View;Ljava/lang/Object;)Z", new Object[]{this, view, o})).booleanValue();
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("destroyItem.(Landroid/view/ViewGroup;ILjava/lang/Object;)V", new Object[]{this, container, new Integer(position), object});
            return;
        }
        ((ViewPager) container).removeView((View) object);
    }
}
