package com.example.gui;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class WordsListAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;
    private EditText editText;
    private ArrayList<String> mObjects;

    private static class ViewHolder {
        TextView leftText;
        TextView rightText;

    }



    public WordsListAdapter(Context context, int resource, ArrayList<String> objects, EditText editText) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
        mObjects = objects;
        this.editText = editText;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String leftText = getItem(position);
        String rightText = getItem(position);


        Words wordsClass = new Words(leftText,rightText);

        final View result;

        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.leftText = (TextView) convertView.findViewById(R.id.leftTxt);
            holder.rightText = (TextView) convertView.findViewById(R.id.rightTxt);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;
//        holder.leftText.setText(wordsClass.getLeftText());
//        holder.rightText.setText(wordsClass.getRightText());
//        Log.e("WLA", "Prospector");
//        prospector();

//        ArrayList<String> leftSet = new ArrayList<>();

        if(wordsClass.getLeftText().contains(editText.getText())){
            holder.leftText.setText(wordsClass.getLeftText());

        }



//        Log.e("WLA", "Prospector");
//        leftSet
//                .forEach(System.out::println);


//        holder.rightText.setText(wordsClass.getRightText());

        return convertView;
    }

//    private void prospector(){
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            mObjects
//                    .stream().filter(word -> word.contains(editText.getText()))
//                    .forEach(System.out::println);
//        }
//    }

}
