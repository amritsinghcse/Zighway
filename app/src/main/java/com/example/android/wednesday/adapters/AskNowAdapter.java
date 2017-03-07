package com.example.android.wednesday.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.wednesday.R;
import com.robertlevonyan.views.chip.Chip;

/**
 * Created by hp pc on 3/6/2017.
 */

public class AskNowAdapter extends RecyclerView.Adapter<AskNowAdapter.AskNowViewHolder> {

    private final LayoutInflater inflater;
    public Context context;
    public AskNowAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;

    }

    @Override
    public AskNowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView tv = new TextView(context);
        Drawable drawable = context.getResources().getDrawable(R.drawable.tags_background);
       View view = inflater.inflate(R.layout.ask_now_layout, parent, false);
        tv.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

//        LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View v = vi.inflate(R.layout.question_tag, null);
        View ll = view.findViewById(R.id.tags_holder);
//        Chip chip = (Chip) v.findViewById(R.id.chip);
//        chip.setChipText("Tag");
        ((ViewGroup) ll).addView(tv);
        tv.setText("Tags");
        tv.setTextColor(context.getResources().getColor(R.color.colorPrimary));
        tv.setBackground(drawable);
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) tv.getLayoutParams();

        layoutParams.setMargins(8,5,5,8);

//        tv.setBackgroundColor(context.getResources().getColor(R.color.orange500));

//        chip.changeBackgroundColor(R.color.orange500);
        return new AskNowViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(AskNowViewHolder holder, int position) {
//        holder.addExtraTextView();
//        holder.chip.setChipText("Tag");


    }
//
//    @Override
//    public void onViewRecycled(AskNowViewHolder holder) {
//        super.onViewRecycled(holder);
//        holder.removeExtraTextView();
//    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class AskNowViewHolder extends RecyclerView.ViewHolder {
        View tagHolder;
        Context context;
        View v;
        Chip chip;
        LayoutInflater vi;

         public AskNowViewHolder(View itemView, Context context){
             super(itemView);
             this.context = context;
             tagHolder = itemView.findViewById(R.id.tags_holder);
//              vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


         }

//        public void addExtraTextView() {
//            v = vi.inflate(R.layout.question_tag, null);
//            chip = (Chip) v.findViewById(chip);
//            chip.setChipText("Tag");
//            ((ViewGroup)tagHolder).addView(chip);
//            chip.setChipText("Tag");
//        }
//
//        public void removeExtraTextView() {
//            ((ViewGroup)tagHolder).removeView(chip);
//
//        }



     }


}
