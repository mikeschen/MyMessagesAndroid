package com.example.guest.mymessages.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.guest.mymessages.R;
import com.example.guest.mymessages.models.User;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

    public class UserViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.userTextView) TextView mUserTextView;

        private Context mContext;
        private ArrayList<User> mUsers = new ArrayList<>();

        public UserViewHolder(View itemView, ArrayList<User> users) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            mUsers = users;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    int itemPosition = getLayoutPosition();
//                    Intent intent = new Intent(mContext, UserDetailActivity.class);
//                    intent.putExtra("position", itemPosition + "");
//                    intent.putExtra("restaurants", Parcels.wrap(mRestaurants));
//                    mContext.startActivity(intent);
                }
            });
        }

        public void bindUser(User user) {
            mUserTextView.setText(user.getName());
        }
    }
