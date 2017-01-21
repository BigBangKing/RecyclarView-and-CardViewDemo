package mahmud.rifatmahmud.com.facebook.amazing_facts;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by RAM on 11/28/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset;
    private int p=0;

    public MyAdapter(String[] myDataset) {

        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        // set the view's size, margins, padding's and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
        if (p < position) {
            animate(holder, true);
        } else {
            animate(holder, false);

        }
        p = position;


    }

    @Override
    public int getItemCount() {
        return mDataset.length;

    }

    private void animate(MyAdapter.ViewHolder  holder, boolean b) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(holder.itemView, "translationY", b ? 100 : -100, 0);
        objectAnimator.setDuration(1000);
        ObjectAnimator object= ObjectAnimator.ofFloat(holder.itemView, "translationX", b ? 10 : -30, 0);
        object.setDuration(700);
        animatorSet.playTogether(objectAnimator,object);
        animatorSet.start();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        private int i = 0;

        public ViewHolder(final View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);
//            mTextView.getContext();
            mTextView.setOnClickListener(new View.OnClickListener() {
                @TargetApi(Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {

                    if (i==0) {
                        mTextView.setTextAppearance(itemView.getContext(), android.R.style.TextAppearance_Holo_Large);
                        i=1;
                    }else if (i==1){
                        mTextView.setTextAppearance(itemView.getContext(), android.R.style.TextAppearance_Medium);
                        i=2;
                    }else if (i==2){
                        mTextView.setTextAppearance(itemView.getContext(), android.R.style.TextAppearance_Material_Small);
                        i=0;
                    }
                }
            });

        }
    }
}
