package com.tutorials.hp.jsongridviewmulti_items.m_UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tutorials.hp.jsongridviewmulti_items.R;
import com.tutorials.hp.jsongridviewmulti_items.m_Model.User;

import java.util.ArrayList;

/**
 * Created by Oclemy on 7/8/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 * ---------------------------ROLES-------------------------------
 * 1.INFLATE MODEL LAYOUT
 * 2.BIND DATA TO GRIDVIEW
 */
public class CustomAdapter extends BaseAdapter{

    Context c;
    ArrayList<User> users;

    public CustomAdapter(Context c, ArrayList<User> users) {
        this.c = c;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view=LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        }
        TextView nameTxt= (TextView) view.findViewById(R.id.nameTxt);
        TextView usernameTxt= (TextView) view.findViewById(R.id.usernameTxt);
        TextView emailTxt= (TextView) view.findViewById(R.id.emailTxt);

        User user= (User) this.getItem(i);

        nameTxt.setText(user.getName());
        emailTxt.setText(user.getEmail());
        usernameTxt.setText(user.getUsername());

        return view;
    }
}
